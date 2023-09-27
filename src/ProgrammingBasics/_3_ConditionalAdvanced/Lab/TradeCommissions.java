package ProgrammingBasics._3_ConditionalAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city=scanner.nextLine();
        double sales=Double.parseDouble(scanner.nextLine());

        double percent=0;
        boolean isValid=true;

        switch (city){
            case "Sofia":
                if(sales >= 0 && sales <= 500){
                    percent=5;
                } else if (sales > 500 && sales <= 1000) {
                    percent=7;
                }else if (sales > 1000 && sales <= 10000) {
                    percent = 8;
                } else if (sales > 10000) {
                    percent=12;
                }else {
                    isValid=false;
                }
                break;
            case "Varna":
                if(sales >= 0 && sales <= 500){
                    percent=4.5;
                } else if (sales > 500 && sales <= 1000) {
                    percent=7.5;
                }else if (sales > 1000 && sales <= 10000) {
                    percent = 10;
                } else if (sales > 10000) {
                    percent=13;
                }else {
                    isValid=false;
                }
                break;
            case "Plovdiv":
                if(sales >= 0 && sales <= 500){
                    percent=5.5;
                } else if (sales > 500 && sales <= 1000) {
                    percent=8;
                }else if (sales > 1000 && sales <= 10000) {
                    percent = 12;
                } else if (sales > 10000) {
                    percent=14.5;
                }else {
                    isValid=false;
                }
                break;
            default:
                isValid=false;
                break;
        }

        double result = sales*percent/100;

        if(isValid==true){
            System.out.printf("%.2f", result);
        }else {
            System.out.println("error");
        }

    }
}
