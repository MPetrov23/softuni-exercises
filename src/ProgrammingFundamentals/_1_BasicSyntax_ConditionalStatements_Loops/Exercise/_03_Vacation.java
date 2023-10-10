package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Exercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        String groupType = sc.nextLine();
        String day= sc.nextLine();

        double price=0;

        if(groupType.equals("Students")){
            switch (day) {
                case "Friday" :
                    price = 8.45;
                    break;
                case "Saturday" :
                    price = 9.80;
                    break;
                case "Sunday" :
                    price = 10.46;
                    break;
            }
        } else if (groupType.equals("Business")) {
            switch (day) {
                case "Friday" :
                    price = 10.90;
                    break;
                case "Saturday" :
                    price = 15.60;
                    break;
                case "Sunday" :
                    price = 16;
                    break;
            }
        }else if (groupType.equals("Regular")) {
            switch (day) {
                case "Friday":
                    price = 15;
                    break;
                case "Saturday" :
                    price = 20;
                    break;
                case "Sunday" :
                    price = 22.50;
                    break;
            }
        }

        double totalPrice = price*people;
        if(groupType.equals("Students") && people>=30){
            totalPrice=totalPrice*0.85;
        } else if (groupType.equals("Business") && people>=100) {
            totalPrice=totalPrice-price*10;
        } else if (groupType.equals("Regular") && people>=10 && people<=20) {
            totalPrice=totalPrice*0.95;
        }

        System.out.printf("Total price: %.2f",totalPrice);
    }
}
