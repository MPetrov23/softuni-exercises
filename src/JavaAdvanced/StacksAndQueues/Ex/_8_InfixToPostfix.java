package JavaAdvanced.StacksAndQueues.Ex;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _8_InfixToPostfix {
    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfixExpression = new StringBuilder();
        ArrayDeque<String> operatorStack = new ArrayDeque<>();

        String[] tokens = infixExpression.split("\\s+");

        for (String token : tokens) {
            token = token.trim();

            if (token.isEmpty()) {
                continue;
            }

            if (isNumericOrVariable(token)) {
                postfixExpression.append(token).append(" ");
            } else if (isOperator(token)) {
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(") && hasHigherPrecedence(operatorStack.peek(), token)) {
                    postfixExpression.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(token);
            } else if (token.equals("(")) {
                operatorStack.push(token);
            } else if (token.equals(")")) {
                while (!operatorStack.isEmpty() && !operatorStack.peek().equals("(")) {
                    postfixExpression.append(operatorStack.pop()).append(" ");
                }
                operatorStack.pop();
            }
        }

        while (!operatorStack.isEmpty()) {
            postfixExpression.append(operatorStack.pop()).append(" ");
        }

        return postfixExpression.toString().trim();
    }

    private static boolean isNumericOrVariable(String str) {
        return str.matches("[0-9]+") || str.matches("[a-zA-Z]+");
    }

    private static boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private static int getPrecedence(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
        }
        return 0;
    }

    private static boolean hasHigherPrecedence(String op1, String op2) {
        return getPrecedence(op1) >= getPrecedence(op2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String infixExpression = sc.nextLine();
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println(postfixExpression);
    }
}

