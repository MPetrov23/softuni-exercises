package ProgrammingBasics._6_NestedLoops.Lab;

import java.util.Scanner;

public class Combinations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=Integer.parseInt(scan.nextLine());
        int count=0;

        for(int a=0;a<=num;a++){
         for(int b=0;b<=num;b++){
          for(int c=0;c<=num;c++){
              int sum=a+b+c;
                if(sum==num){
                    count++;
                }
                }
            }
        }

        System.out.print(count);
        }
}
