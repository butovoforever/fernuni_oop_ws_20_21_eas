package ea4_3;

import java.io.*;

public class SerializationToFilePersistence implements FullPersistence {

    /*
    1) AdressBook Objekt uebernehmen und
    2) Ins Datei ablegen
    */


    @Override
    public AddressBook loadBook(String name) throws AddressBookException {
        return null;
    }

    @Override
    public void storeBook(AddressBook book, String name) throws AddressBookException {

        try {

            File neuOrdner = new File(System.getProperty("user.home")+"/addressbooks");
            neuOrdner.mkdirs();

//            File storedAddressbuch = new File(System.getProperty("user.home") + "/" + "addressbooks" + "/" + name);
            File storedAddressbuch = new File(neuOrdner + "/" + name);
            FileOutputStream dateiStrom = new FileOutputStream(storedAddressbuch);
            ObjectOutputStream writer = new ObjectOutputStream(dateiStrom);
            writer.writeObject(book);
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
    }



}
