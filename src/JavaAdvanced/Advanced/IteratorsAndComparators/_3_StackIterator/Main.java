package JavaAdvanced.Advanced.IteratorsAndComparators._3_StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackIterator stackIterator = new StackIterator();

        String command = sc.nextLine();
        while (!command.equals("END")) {
            String[] commandParts = command.split("[\\s+,]+");
            if (commandParts[0].equals("Push")) {
                for (int i = 1; i < commandParts.length; i++) {
                    stackIterator.push(Integer.parseInt(commandParts[i]));
                }
            } else if (commandParts[0].equals("Pop")) {
                try {
                    stackIterator.pop();
                } catch (IllegalStateException exception) {
                    System.out.printf("%s%n", exception.getMessage());
                }
            }
            command = sc.nextLine();
        }
        stackIterator.forEach(s -> System.out.printf("%s%n", s));
        stackIterator.forEach(s -> System.out.printf("%s%n", s));
    }
}