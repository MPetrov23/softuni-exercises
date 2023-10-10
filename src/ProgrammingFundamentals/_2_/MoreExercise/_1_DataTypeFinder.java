package ProgrammingFundamentals._2_.MoreExercise;

import java.util.Scanner;

public class _1_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("END")) {
                break;
            }

            if (isInteger(input)) {
                System.out.println(input + " is integer type");
            } else if (isFloat(input)) {
                System.out.println(input + " is floating point type");
            } else if (isCharacter(input)) {
                System.out.println(input + " is character type");
            } else if (isBoolean(input)) {
                System.out.println(input + " is boolean type");
            } else {
                System.out.println(input + " is string type");
            }
        }
    }

    // Integer
    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Float
    private static boolean isFloat(String input) {
        try {
            Float.parseFloat(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Char
    private static boolean isCharacter(String input) {
        return input.length() == 1;
    }

    // Boolean
    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }
}
