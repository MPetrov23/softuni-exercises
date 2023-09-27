package ProgrammingBasics._2_Conditional.Lab;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());


        if(a>b){
            System.out.print(a);
        }
        else{
            System.out.print(b);

        }
    }
}
