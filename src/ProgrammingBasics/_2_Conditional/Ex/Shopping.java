package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsNumber = Integer.parseInt(scanner.nextLine());
        int processorsNumber = Integer.parseInt(scanner.nextLine());
        int ramsNumber = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice=videoCardsNumber*250;
        double processorsPrice=(videoCardsPrice*0.35)*processorsNumber;
        double ramsPrice=(videoCardsPrice*0.1)*ramsNumber;

        double totalPrice=videoCardsPrice+processorsPrice+ramsPrice;

        if(videoCardsNumber>processorsNumber){
            totalPrice-=totalPrice*15/100;
        }

        if(totalPrice>budget){
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice-budget);
        }else {
            System.out.printf("You have %.2f leva left!", budget-totalPrice);

        }

    }
}