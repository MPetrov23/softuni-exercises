package ProgrammingBasics._3_ConditionalAdvanced.Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String product=scanner.nextLine();
        String city=scanner.nextLine();
        double number=Double.parseDouble(scanner.nextLine());

        switch (product){
            case "coffee":
                switch (city){
                    case "Sofia":
                        System.out.println(number*0.5);
                        break;
                    case "Plovdiv":
                        System.out.println(number*0.4);
                        break;
                    case "Varna":
                        System.out.println(number*0.45);
                        break;
                }
                break;
            case "water":
                switch (city){
                    case "Sofia":
                        System.out.println(number*0.8);
                        break;
                    case "Plovdiv":
                        System.out.println(number*0.7);
                        break;
                    case "Varna":
                        System.out.println(number*0.7);
                        break;
                }
                break;
            case "beer":
                switch (city){
                    case "Sofia":
                        System.out.println(number*1.2);
                        break;
                    case "Plovdiv":
                        System.out.println(number*1.15);
                        break;
                    case "Varna":
                        System.out.println(number*1.1);
                        break;
                }
                break;
            case "sweets":
                switch (city){
                    case "Sofia":
                        System.out.println(number*1.45);
                        break;
                    case "Plovdiv":
                        System.out.println(number*1.3);
                        break;
                    case "Varna":
                        System.out.println(number*1.35);
                        break;
                }
                break;
            case "peanuts":
                switch (city){
                    case "Sofia":
                        System.out.println(number*1.6);
                        break;
                    case "Plovdiv":
                        System.out.println(number*1.5);
                        break;
                    case "Varna":
                        System.out.println(number*1.55);
                        break;
                }
                break;
        }
    }
}
