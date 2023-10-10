package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Lab;

import java.util.Scanner;

public class _02_Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if(grade >=3){
            System.out.println("Passed!");
        }
    }
}
