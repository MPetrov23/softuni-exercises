package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int totalItems = puzzle + dolls + bears + minions + trucks;
        double totalSum = (puzzle * 2.60) + (dolls * 3.0) + (bears * 4.10) + (minions * 8.20) + (trucks * 2.0);

        totalSum = totalSum - totalSum * 10 / 100;

        if (totalItems >= 50) {
            totalSum = totalSum - totalSum * 25 / 100;
        }

        double result = Math.abs(totalSum - tripPrice);

        if (tripPrice > totalSum) {
            System.out.printf("Not enough money! %.2f lv needed.", result);
        } else {
            System.out.printf("Yes! %.2f lv left.", result);
        }
    }
}
