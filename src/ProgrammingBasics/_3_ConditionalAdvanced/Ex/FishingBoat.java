package ProgrammingBasics._3_ConditionalAdvanced.Ex;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season= scan.nextLine();
        int numberFisherman = Integer.parseInt(scan.nextLine());

        double price=0.0;

        switch (season){
            case "Spring":
                price=3000.0;
                break;
            case "Summer" :
            case "Autumn":
                price = 4200.0;
                break;
            case "Winter":
                price=2600.0;
                break;
        }

        if(numberFisherman<=6){
            price=price*0.9;
        } else if (numberFisherman>6 && numberFisherman<=11) {
            price = price*0.85;
        } else if (numberFisherman>=12) {
            price=price*0.75;
        }

        if(numberFisherman%2==0 && !season.equals("Autumn")){
            price = price*0.95;
        }else{
            price=price;
        }

        double diff=Math.abs(price-budget);

        if(price<=budget){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }

    }
}
