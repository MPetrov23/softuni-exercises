package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int num=Integer.parseInt(scan.nextLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        for(int i=1;i<=num;i++){
            int curr=Integer.parseInt(scan.nextLine());
            if(curr<min){
                min=curr;
            }
            if(curr>max){
                max=curr;
            }
        }
        System.out.printf("Max number: %d \n", max);
        System.out.printf("Min number: %d", min);
    }
}
