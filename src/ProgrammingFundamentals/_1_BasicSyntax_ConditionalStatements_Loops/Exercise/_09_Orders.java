package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Exercise;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orders = Integer.parseInt(sc.nextLine());
        double total=0;

        for(int i=1; i<=orders;i++){
            double capsulePrice=Double.parseDouble(sc.nextLine());
            int days=Integer.parseInt(sc.nextLine());
            int capsulesCount=Integer.parseInt(sc.nextLine());
            double orderSum=((days*capsulesCount)*capsulePrice);
            System.out.printf("The price for the coffee is: $%.2f\n",orderSum);
            total+=orderSum;
        }
        System.out.printf("Total: $%.2f",total);
    }
}
