package ProgrammingBasics._1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqrMeters = Double.parseDouble(scanner.nextLine());
        double price = sqrMeters*7.61;
        double discount = price*0.18;

        double finalPrice = price - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");

    }
}

