package JavaAdvanced.Advanced.StreamsFilesDirectories.Ex;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int age;
    String phone;

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
