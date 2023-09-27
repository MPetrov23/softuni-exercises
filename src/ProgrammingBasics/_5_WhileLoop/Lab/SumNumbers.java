package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int num = Integer.parseInt(scan.nextLine());
        int sum= 0;

        while(start >= sum){
            sum+=num;
            if(sum>=start){
                System.out.println(sum);
                break;
            }
            num= Integer.parseInt(scan.nextLine());

        }

    }
}
