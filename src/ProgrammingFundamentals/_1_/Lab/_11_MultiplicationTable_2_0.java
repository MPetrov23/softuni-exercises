package ProgrammingFundamentals._1_.Lab;

import java.util.Scanner;

public class _11_MultiplicationTable_2_0 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int num =Integer.parseInt(sc.nextLine());
        int start=Integer.parseInt(sc.nextLine());


        if(start>10){
            System.out.printf("%d X %d = %d \n",num,start,num*start);
        }else {
            for (int i = start; i <= 10; i++) {
                System.out.printf("%d X %d = %d \n", num, i, num * i);
            }
        }
    }
}
