package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sum = 0;

        while(!input.equals("NoMoreMoney")){
            if(Double.parseDouble(input)<0) {
                System.out.println("Invalid operation!");
                break;
            }else {
                sum += Double.parseDouble(input);
                System.out.printf("Increase: %.2f \n", Double.parseDouble(input));
            }
            input = scan.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
