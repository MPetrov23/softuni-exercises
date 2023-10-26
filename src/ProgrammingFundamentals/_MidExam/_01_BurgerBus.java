package ProgrammingFundamentals._MidExam;

import java.util.Scanner;

public class _01_BurgerBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int cities=Integer.parseInt(sc.nextLine());
    double totalProfit=0;

    for(int i=1;i<=cities;i++){
        String city= sc.nextLine();
        double moneyEarned=Double.parseDouble(sc.nextLine());
        double expences=Double.parseDouble(sc.nextLine());

        if(i%3==0 && i%5==0){
            moneyEarned=moneyEarned*0.9;
        }else if(i%3==0){
            expences=expences*1.5;
        }else if(i%5==0){
        moneyEarned=moneyEarned*0.9;
        }

        double currentProfit=moneyEarned-expences;
        totalProfit+=currentProfit;

        System.out.printf("In %s Burger Bus earned %.2f leva.\n",city,currentProfit);
    }
        System.out.printf("Burger Bus total profit: %.2f leva.",totalProfit);
    }
}
