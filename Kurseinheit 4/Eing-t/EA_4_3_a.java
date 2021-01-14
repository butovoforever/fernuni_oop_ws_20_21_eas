//interface AddressBook muss mittels "extends" Serialization implementieren
//class Person muss mittels "implements" Serialization implementieren

//class Person {
    class Person implements Serializable {
        private String name;
    
        public Person(String name) {
            this.name = name;
        }
    
        public String getName() {
            return name;
        }
    }


//interface AddressBook {
    interface AddressBook extends Serializable {
        void addPerson(Person person);
    
        void print();
    }

