package JavaAdvanced.OOP.Encapsulation.Lab._2_SalaryIncrease;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2]),Double.parseDouble(input[3])));
        }

        double bonus = Double.parseDouble(sc.nextLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
        }
}
