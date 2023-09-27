package ProgrammingBasics._3_ConditionalAdvanced.Ex;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int nights = Integer.parseInt(scan.nextLine());

        double priceStudio = 0.0;
        double priceApartment = 0.0;
        double totalStudio=0.0;
        double totalApartment=0.0;

        if(month.equals("May") || month.equals("October")){
            priceStudio=50;
            priceApartment=65;
            if(nights>7 && nights<=14){
                priceStudio=priceStudio*0.95;
            } else if (nights>14) {
                priceStudio=priceStudio*0.7;
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio=75.20;
            priceApartment=68.70;
            if(nights>14) {
                priceStudio=priceStudio*0.8;
            }
        }else if (month.equals("July") || month.equals("August")){
            priceStudio=76;
            priceApartment=77;
        }
        if(nights>14){
            priceApartment=priceApartment*0.9;
        }

        totalStudio=nights*priceStudio;
        totalApartment=nights*priceApartment;

        System.out.printf("Apartment: %.2f lv. \n", totalApartment);
        System.out.printf("Studio: %.2f lv.", totalStudio);
    }
}
