package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int start=Integer.parseInt(scan.nextLine());

        for(int i = start;i>0;i--){
            System.out.println(i);
        }
    }
}
