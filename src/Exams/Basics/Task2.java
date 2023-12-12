package Exams.Basics;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayDeer1 =Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer2 =Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer3 =Double.parseDouble(scanner.nextLine());

        double neededFood = days*foodPerDayDeer1 + days*foodPerDayDeer2 + days*foodPerDayDeer3;

        double diff= Math.abs(foodInKg-neededFood);

        if(foodInKg>neededFood){
            System.out.printf("%d kilos of food left.", (int) Math.floor(diff));
        }else {
            System.out.printf("%d more kilos of food are needed.",(int) Math.ceil(diff));
        }
    }
}
