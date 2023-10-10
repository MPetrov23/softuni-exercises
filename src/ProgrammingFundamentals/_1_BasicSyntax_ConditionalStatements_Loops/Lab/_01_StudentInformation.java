package ProgrammingFundamentals._1_BasicSyntax_ConditionalStatements_Loops.Lab;

import java.util.Scanner;

public class _01_StudentInformation {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        double grade = Double.parseDouble(sc.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}