package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _4_Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String calculation = sc.nextLine();
        int firstNum= Integer.parseInt(sc.nextLine());
        int secondNum= Integer.parseInt(sc.nextLine());

        switch (calculation){
            case "add":
                add(firstNum,secondNum);
                break;
            case "multiply":
                multiply(firstNum,secondNum);
                break;
            case "subtract" :
                subtract(firstNum,secondNum);
                break;
            case "divide" :
                divide(firstNum,secondNum);
                break;
        }
    }

    private static void add(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    private static void multiply(int a,int b){
        int c = a*b;
        System.out.println(c);
    }
    private static void subtract(int a,int b){
        int c = a-b;
        System.out.println(c);
    }
    private static void divide(int a,int b){
        int c = a/b;
        System.out.println(c);
    }
}
