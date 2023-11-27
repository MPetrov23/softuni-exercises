package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _10_MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(multiply(number));
    }
    private static int multiply(int number){
        number=Math.abs(number);
        int even=0;
        int odd=0;
        while(number>0){
            int digit=number%10;
            if(digit%2==0){
                even+=digit;
            }else{
                odd+=digit;
            }
            number/=10;
        }
        return even*odd;
    }
}
