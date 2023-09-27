package ProgrammingBasics._3_ConditionalAdvanced.Ex;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int variableA = Integer.parseInt(scan.nextLine());
        int variableB = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();

        double result = 0.0;
        String isEven = "";

        if (operator.equals("%")) {
            if (variableB == 0) {
                System.out.printf("Cannot divide %d by zero", variableA);
            } else {
                result = variableA%variableB;
                System.out.printf("%d %s %d = %.0f", variableA, operator, variableB, result);
            }
        } else if (operator.equals("/")) {
            if (variableB == 0) {
                System.out.printf("Cannot divide %d by zero", variableA);
            } else {
                result = (double) variableA / (double) variableB;
                System.out.printf("%d %s %d = %.2f", variableA, operator, variableB, result);
            }
        } else if(operator.equals("+")){
            result = variableA + variableB;
            if (result % 2 == 0) {
                isEven = "even";
            } else {
                isEven = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", variableA, operator, variableB, result, isEven);
        }else if(operator.equals("-")){
            result = variableA - variableB;
            if (result % 2 == 0) {
                isEven = "even";
            } else {
                isEven = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", variableA, operator, variableB, result, isEven);
        }else if(operator.equals("*")){
            result = variableA * variableB;
            if (result % 2 == 0) {
                isEven = "even";
            } else {
                isEven = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", variableA, operator, variableB, result, isEven);
        }

    }
}
