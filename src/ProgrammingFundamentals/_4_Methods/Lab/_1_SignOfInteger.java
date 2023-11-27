package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _1_SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input=Integer.parseInt(sc.nextLine());
        sign(input);
    }

    private static void sign(int number){
        if(number==0){
            System.out.printf("The number %d is zero.",number);
        }else if(number>0){
            System.out.printf("The number %d is positive.",number);
        }else{
            System.out.printf("The number %d is negative.",number);
        }
    }
}
