package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int num=Integer.parseInt(scan.nextLine());
        int sum=0;

        if(num<=0){
            System.out.println(0);
        }else{
            for(int i=1;i<=num;i++){
                int curr=Integer.parseInt(scan.nextLine());
                sum+=curr;
            }
            System.out.println(sum);
        }

    }
}
