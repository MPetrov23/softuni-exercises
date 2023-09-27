package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int num=Integer.parseInt(scan.nextLine());

        int oddSum=0;
        int evenSum=0;

        for (int i=1; i<=num;i++){
            int curr=Integer.parseInt(scan.nextLine());
            if(i%2==0){
                evenSum+=curr;
            }else {
                oddSum+=curr;
            }
        }
        int diff=Math.abs(oddSum-evenSum);
        if(oddSum==evenSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", oddSum);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
