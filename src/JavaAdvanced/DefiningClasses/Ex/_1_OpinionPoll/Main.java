package JavaAdvanced.DefiningClasses.Ex._1_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleCount = Integer.parseInt(sc.nextLine());

        List<Person> people = new ArrayList<>();

        for(int i=0; i<peopleCount; i++){
            String[] personData = sc.nextLine().split("\\s+");

            Person person = new Person(personData[0],Integer.parseInt(personData[1]));
            people.add(person);
        }

        people.stream()
                .filter(p -> p.getAge()>30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(p -> System.out.println(p.getName()+" - "+p.getAge()));

    }
}
