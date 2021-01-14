package ea4_3;

import java.io.Serializable;

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
