package ProgrammingFundamentals._6_ObjectsAndClasses.Exercise._6_OrderByAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Person implements Comparable<Person>{
    String name;
    String id;
    int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        List<Person> people = new ArrayList<>();

        while(!input.equals("End")){
            String[] personData = input.split(" ");
            String name = personData[0];
            String id = personData[1];
            int age = Integer.parseInt(personData[2]);

            Person person = new Person(name,id,age);
            people.add(person);

            input=sc.nextLine();
        }

        Collections.sort(people);

        for(Person person : people){
            System.out.printf("%s with ID: %s is %d years old.\n",person.getName(),person.getId(),person.getAge());
        }
    }


}
