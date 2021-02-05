package ea4_3;

interface FullPersistence {
    AddressBook loadBook(String name) throws AddressBookException;

    void storeBook(AddressBook book, String name) throws AddressBookException;
}
