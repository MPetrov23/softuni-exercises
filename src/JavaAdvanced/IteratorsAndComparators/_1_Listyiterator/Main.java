package JavaAdvanced.IteratorsAndComparators._1_Listyiterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListyIterator<String> listyIterator = new ListyIterator<>();

        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];
            if (command.equals("Create")) {
                if (inputParts.length > 1) {
                    String[] elements = Arrays.copyOfRange(inputParts, 1, inputParts.length);
                    listyIterator = new ListyIterator<>(elements);
                }

            } else if (command.equals("Move")) {
                System.out.printf("%s%n", listyIterator.move());

            } else if (command.equals("Print")) {
                try {
                    listyIterator.print();
                } catch (IllegalStateException exception) {
                    System.out.printf("%s%n", exception.getMessage());
                }
            } else if (command.equals("HasNext")) {
                System.out.printf("%s%n", listyIterator.hasNext());
            }
            input = sc.nextLine();
        }
    }
}