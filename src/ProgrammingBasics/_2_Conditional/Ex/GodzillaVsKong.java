package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget*0.1;
        double clothesPrice= people*clothes;

        if(people>150){
            clothesPrice=clothesPrice*0.9;
        }

        double totalPrice= decorPrice+clothesPrice;

        double difference = Math.abs(budget-totalPrice);

        if(budget>=totalPrice){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);

        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }


    }
}
