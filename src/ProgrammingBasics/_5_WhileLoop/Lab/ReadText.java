package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();


        while(!word.equals("Stop")){
            System.out.println(word);
            word = scan.nextLine();

        }
    }
}
