package ProgrammingBasics._3_ConditionalAdvanced.Ex;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();

        String location = "";
        String sleep = "";
        double price=0.0;

        if(budget<=100){
            location="Bulgaria";
            if(season.equals("summer")){
                price=budget*0.3;
                sleep = "Camp";
            } else if (season.equals("winter")) {
                price=budget*0.7;
                sleep = "Hotel";
            }
        } else if (budget>100 && budget<=1000) {
            location="Balkans";
            if(season.equals("summer")){
                price=budget*0.4;
                sleep = "Camp";
            } else if (season.equals("winter")) {
                price=budget*0.8;
                sleep = "Hotel";
            }
        } else if (budget>1000) {
            location="Europe";
            price=budget*0.9;
            sleep = "Hotel";
        }

        System.out.println("Somewhere in "+ location);
        System.out.printf("%s - %.2f", sleep, price);

    }
}
