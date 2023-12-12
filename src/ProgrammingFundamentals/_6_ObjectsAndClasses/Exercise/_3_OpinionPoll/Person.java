package ProgrammingFundamentals._6_ObjectsAndClasses.Exercise._3_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        List<Person> persons = new ArrayList<>();

        for(int i=0; i<lines; i++){
            String[] personData= sc.nextLine().split(" ");
            int age = Integer.parseInt(personData[1]);
            Person person= new Person(personData[0],age);
            persons.add(person);
        }

        for(int i=0; i<persons.size();i++){
            if(persons.get(i).getAge()>30){
                System.out.println(persons.get(i).getName()+" - "+persons.get(i).getAge());
            }
        }
    }
}
