package ProgrammingBasics._4_ForLoop.Ex;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int age=Integer.parseInt(scan.nextLine());
        double washingMachinePrice=Double.parseDouble(scan.nextLine());
        double toyPrice=Double.parseDouble(scan.nextLine());

        int lilyMoney=0;
        int moneyGift=10;
        int toyNum=0;

        for(int i=1;i<=age;i++){
            if(i%2==0){
                lilyMoney+=moneyGift;
                moneyGift+=10;
                lilyMoney-=1;
            }else {
                toyNum++;
            }
        }
        lilyMoney+=toyNum*toyPrice;

        double diff=Math.abs(washingMachinePrice-lilyMoney);

        if(lilyMoney>=washingMachinePrice){
            System.out.printf("Yes! %.2f",diff);
        }else {
            System.out.printf("No! %.2f",diff);
        }

    }
}
