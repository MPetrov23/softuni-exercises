package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double mealsSum = chicken*10.35 + fish*12.4 + vegetarian*8.15;
        double dessert = mealsSum*0.2;
        double total = mealsSum + dessert + 2.5;

        System.out.print(total);

    }
}
