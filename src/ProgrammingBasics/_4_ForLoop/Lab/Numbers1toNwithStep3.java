package ProgrammingBasics._4_ForLoop.Lab;

import java.util.Scanner;

public class Numbers1toNwithStep3 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int stop=Integer.parseInt(scan.nextLine());

        for(int i=1;i<=stop;i+=3){
            System.out.println(i);
        }
    }
}
