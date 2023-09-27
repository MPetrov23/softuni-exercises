package ProgrammingFundamentals._1_.Exercise;

import java.util.Scanner;

public class _02_Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        int divider=0;

        if(number%10==0){
            divider=10;
        } else if (number%7==0) {
            divider=7;
        }else if (number%6==0) {
            divider=6;
        }else if (number%3==0) {
            divider=3;
        }else if (number%2==0) {
            divider=2;
        }

        if(divider==0){
            System.out.println("Not divisible");
        }else {
            System.out.printf("The number is divisible by %d",divider);
        }
    }
}
