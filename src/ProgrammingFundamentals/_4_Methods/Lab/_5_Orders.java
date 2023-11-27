package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _5_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        totalPrice(product,quantity);
    }
    private static void totalPrice(String product, int quantity){
        switch (product){
            case "coffee":
                System.out.printf("%.2f",quantity*1.5);
                break;
            case "water":
                System.out.printf("%.2f",quantity*1.0);
                break;
            case "coke":
                System.out.printf("%.2f",quantity*1.4);
                break;
            case "snacks":
                System.out.printf("%.2f",quantity*2.0);
                break;

        }
    }
}
