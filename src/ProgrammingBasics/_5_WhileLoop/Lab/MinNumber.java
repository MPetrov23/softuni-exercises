package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int min=Integer.MAX_VALUE;

        while(!input.equals("Stop")){

            if(Integer.parseInt(input)<min){
                min=Integer.parseInt(input);

            }
            input = scan.nextLine();
        }
        System.out.println(min);
    }
}
