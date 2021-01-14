package ea4_3;

import java.io.Serializable;

//interface AddressBook {
interface AddressBook extends Serializable {
    void addPerson(Person person);

    void print();
}
