package ea4_3;

import java.io.*;

public class SerializationToFilePersistence implements FullPersistence {

    File neuOrdner;
    File neuOrdnerWeg;

    /*
    1) AdressBook Objekt uebernehmen und
    2) Ins Datei ablegen
    */

    SerializationToFilePersistence () {
        this.neuOrdner = new File(System.getProperty("user.home")+"/addressbooks");
        this.neuOrdnerWeg = neuOrdner;
        neuOrdner.mkdirs();
    }



    @Override
    public AddressBook loadBook(String name) throws AddressBookException {
        AddressBook loadedBook = null;

        try {
            FileInputStream lesenBuch = new FileInputStream(neuOrdnerWeg + "/"+name);
            ObjectInputStream lesenBuchObjekt = new ObjectInputStream(lesenBuch);
            loadedBook = (AddressBook) lesenBuchObjekt.readObject();
            lesenBuchObjekt.close();
            lesenBuch.close();
            return loadedBook;
        } catch (IOException | ClassNotFoundException e) {
            throw new AddressBookException(e.getMessage());
        }

//        return loadedBook;
    }

    @Override
    public void storeBook(AddressBook book, String name) throws AddressBookException {

        try {



//            File storedAddressbuch = new File(System.getProperty("user.home") + "/" + "addressbooks" + "/" + name);
            File storedAddressbuch = new File(neuOrdnerWeg + "/" + name);
            FileOutputStream dateiStrom = new FileOutputStream(storedAddressbuch);
            ObjectOutputStream writer = new ObjectOutputStream(dateiStrom);
            writer.writeObject(book);
            writer.flush();
            writer.close();
            dateiStrom.close();
        } catch (IOException e) {
            throw new AddressBookException(e.getMessage());
        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }


    }



}
