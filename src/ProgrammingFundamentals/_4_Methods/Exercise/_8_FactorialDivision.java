package ProgrammingFundamentals._4_Methods.Exercise;

import java.util.Scanner;

public class _8_FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum=Integer.parseInt(sc.nextLine());
        int secondNum=Integer.parseInt(sc.nextLine());

        double result= factorial(firstNum)*1.0/factorial(secondNum);
        System.out.printf("%.2f",result);
    }
    private static long factorial(int a){

        if (a > 0) {
            long result = 1;

            for (int i = 1; i <= a; i++) {
                result *= i;
            }

            return result;
        }
        return 0;
    }
}
