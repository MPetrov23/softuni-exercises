package ProgrammingBasics._1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        double dogFoodPrice = 2.5;
        double catFoodPrice = 4;

        Scanner scanner = new Scanner(System.in);
        int dogFoodNumber = Integer.parseInt(scanner.nextLine());
        int catFoodNumber = Integer.parseInt(scanner.nextLine());

        double sum = dogFoodNumber*dogFoodPrice + catFoodNumber*catFoodPrice;

        System.out.println(sum + "");
    }
}
