package ProgrammingBasics._5_WhileLoop.Ex;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double goalMoney= Double.parseDouble(scan.nextLine());
        double money = Double.parseDouble(scan.nextLine());

        int spentCount=0;
        int daysCount=0;

        while(goalMoney>money){
            String activity=scan.nextLine();
            double amount= Double.parseDouble(scan.nextLine());

            if(activity.equals("spend")){
                money=money-amount;
                if(money<0){
                    money=0;
                }
                spentCount++;
            }else{
                money=money+amount;
                spentCount=0;
            }

            daysCount++;
            if(spentCount>=5){
                break;
            }
        }

        if(money>=goalMoney){
            System.out.printf("You saved the money for %d days.", daysCount);
        }else {
            System.out.println("You can't save the money.");
            System.out.printf("%d",daysCount);
        }
    }
}
