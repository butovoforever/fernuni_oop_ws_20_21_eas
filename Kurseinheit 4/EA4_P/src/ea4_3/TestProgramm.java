package ea4_3;

import java.io.*;

public class TestProgramm {
    public static void main(String[] args) {

//
//        System.out.println(System.getProperty("user.home"));
//        File neuOrdner = new File(System.getProperty("user.home")+"/OOP/TestOrdner/nochEine/undLetzte");
//        boolean bool = neuOrdner.mkdirs();
//        System.out.println("Ordner erzeugt? " + bool);
//
////        String testObjekt = new String("TestString");
//        class Dog implements Serializable {
//            String name;
//            void barking (){};
//
//            Dog (String name){
//                this.name = name;
//            }
//        }
//
//        Dog testObjekt = new Dog ("TestDog");
//
//        File testFile = new File (neuOrdner + "/testFile");
//        FileOutputStream testFileOutputStream = new FileOutputStream(testFile);
//        ObjectOutputStream testObjectOutputStream = new ObjectOutputStream(testFileOutputStream);
//        testObjectOutputStream.writeObject(testObjekt);
//        testObjectOutputStream.flush();
//        testObjectOutputStream.close();
//        testFileOutputStream.close();
//
//        FileInputStream testFileInputStream = new FileInputStream(testFile);
//        ObjectInputStream testObjectInputStream = new ObjectInputStream(testFileInputStream);
//        try {
//            Dog abgelegteTestDog = (Dog) testObjectInputStream.readObject();
//
//            System.out.println("Name von abgelegte Dog ist: " + abgelegteTestDog.name);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        testFileInputStream.close();
//        testObjectInputStream.close();
//

        ArrayListAddressBook neueAddressBuch = new ArrayListAddressBook(3);

        Person PersonEins = new Person("Person1");
        Person PersonZwei = new Person("Person2");
        Person PersonDrei = new Person("Person3");
        Person PersonVier = new Person("Person4");

        neueAddressBuch.addPerson(PersonEins);
        neueAddressBuch.addPerson(PersonZwei);
        neueAddressBuch.addPerson(PersonDrei);
        neueAddressBuch.addPerson(PersonVier);

        SerializationToFilePersistence AddressBuchSpeichernLaden = new SerializationToFilePersistence();

        try {
            AddressBuchSpeichernLaden.storeBook(neueAddressBuch, "AddressBuch1");
        } catch (AddressBookException e) {
            e.printStackTrace();
        }

        try {
            ArrayListAddressBook addressBookAusDatei = (ArrayListAddressBook) AddressBuchSpeichernLaden.loadBook("AddressBuch1");
            addressBookAusDatei.print();
            } catch (AddressBookException addressBookException) {
            addressBookException.printStackTrace();
        }


    }
}
