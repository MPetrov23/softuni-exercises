package ProgrammingFundamentals._2_DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class _4_RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        for (int i = 2; i <= lines; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }
}
