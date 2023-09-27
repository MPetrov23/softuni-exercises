package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int stop=Integer.parseInt(scan.nextLine());
        int num=1;

        for(int i=0;i<=stop;i+=1){
            if(i%2==0 ||i==0) {
                System.out.println((int)Math.pow(2,i));
            }
        }

    }
}
