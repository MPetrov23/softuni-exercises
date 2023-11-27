package ProgrammingFundamentals._4_Methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _11_MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int b=Integer.parseInt(sc.nextLine());

        System.out.printf(new DecimalFormat("0.##").format(operation(operator,a,b)));
    }
    private static double operation(String operator, int a, int b){
       double result=0.0;
        switch (operator){
            case "+":
                result=a+b;
                break;
            case "-":
                result=a-b;
                break;
            case "*":
                result=a*b;
                break;
            case "/":
                result= a * 1.00 / b;
                break;
        }
        return result;
    }
}
