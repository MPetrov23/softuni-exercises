package JavaAdvanced.IteratorsAndComparators._5_ComparingObjects;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] inputParts = input.split("\\s+");
            Person person = new Person(inputParts[0], Integer.parseInt(inputParts[1]), inputParts[2]);
            personList.add(person);


            input = sc.nextLine();
        }

        int n = Integer.parseInt(sc.nextLine());
        Person personToCompare = personList.get(n - 1);
        int equals = 0;
        int diff = 0;

        for (Person person : personList) {
            int result = personToCompare.compareTo(person);
            if (result == 0) {
                equals++;
            } else {
                diff++;
            }
        }

        if (equals <= 1) {
            System.out.printf("No matches%n");
        } else {
            System.out.printf("%d %d %d%n", equals, diff, personList.size());
        }
    }
}