package ProgrammingFundamentals._2_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class _8_LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        if (Character.isLowerCase(letter)) {
            System.out.println("lower-case");
        } else if (Character.isUpperCase(letter))
            System.out.println("upper-case");
        }

    }
