package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Exercise;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int firstNumber=number;
        int sum=0;

        while (number != 0) {
            int digit = number % 10; // Get the last digit


            int fact = 1;
            for (int i = 2; i <= digit; i++) {
                fact *= i;
            }

            number = number / 10; // Remove the last digit
            sum+=fact;
        }

        if(sum==firstNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
