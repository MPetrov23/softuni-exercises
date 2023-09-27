package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String user = scan.nextLine();
        String pass= scan.nextLine();

        String inputPass = scan.nextLine();

        while(!pass.equals(inputPass)){
            inputPass = scan.nextLine();

        }
        System.out.printf("Welcome %s!", user);

    }
}
