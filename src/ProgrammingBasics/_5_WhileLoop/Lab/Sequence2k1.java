package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int number=1;

        while(number <=num){
            System.out.println(number);
            number=number*2 +1;
        }
    }
}
