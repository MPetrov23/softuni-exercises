package ProgrammingFundamentals._1_.Exercise;

import java.util.Scanner;

public class _07_VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double money=0;
        double nuts=2;
        double water=0.7;
        double crisps=1.5;
        double soda=0.8;
        double coke=1.0;



        while(!input.equals("Start")){
            double coin= Double.parseDouble(input);
            if(coin==0.1 || coin==0.2 || coin == 0.5 || coin== 1.0 || coin==2.0){
                money+=coin;
            }else {
                System.out.printf("Cannot accept %.2f\n",coin);
            }
            if(input.equals("Start")){
                break;
            }
            input=sc.nextLine();
        }

        input=sc.nextLine();

        while(!input.equals("End")){
            switch (input){
                case "Nuts" :
                    if(money>=nuts){
                        System.out.println("Purchased Nuts");
                        money-=nuts;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water" :
                    if(money>=water){
                        System.out.println("Purchased Water");
                        money-=water;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps" :
                    if(money>=crisps){
                        System.out.println("Purchased Crisps");
                        money-=crisps;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if(money>=soda){
                        System.out.println("Purchased Soda");
                        money-=soda;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if(money>=coke){
                        System.out.println("Purchased Coke");
                        money-=coke;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            input=sc.nextLine();
        }

        System.out.printf("Change: %.2f", money);

    }
}
