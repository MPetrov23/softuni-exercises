package ProgrammingBasics._5_WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String student = scan.nextLine();

        int f = 0;
        int grade = 0;
        double gradeSum = 0;

        while (grade < 12 && f != 2) {
            double gr = Double.parseDouble(scan.nextLine());
            gradeSum += gr;
            grade++;
            if (gr < 4) {
                f++;
            }
        }

        if (grade < 12) {
            System.out.printf("%s has been excluded at %d grade", student, grade-1);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", student, gradeSum / 12);
        }
    }
}
