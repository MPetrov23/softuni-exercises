package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int num=Integer.parseInt(scan.nextLine());

        int sumLeft=0;
        int sumRight=0;

        for(int i=1;i<=num;i++){
            int left=Integer.parseInt(scan.nextLine());
            sumLeft+=left;
        }
        for(int i=1;i<=num;i++){
            int right=Integer.parseInt(scan.nextLine());
            sumRight+=right;
        }

        int diff=Math.abs(sumLeft-sumRight);
        if(sumLeft==sumRight){
            System.out.printf("Yes, sum = %d", sumLeft);
        }else {
            System.out.printf("No, diff = %d", diff);

        }
    }
}
