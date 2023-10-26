package ProgrammingFundamentals._MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_SchoolLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> books = Arrays.stream(sc.nextLine().split("&"))
                .collect(Collectors.toList());


        while (true) {
            String command = sc.nextLine();
            if (command.equals("Done")) {
                break;
            }

            String[] commandParts = command.split( " \\| ");
            String action = commandParts[0];

            if (action.equals("Add Book")) {
                String bookToAdd = commandParts[1];
                if (!books.contains(bookToAdd)) {
                    books.add(0, bookToAdd);
                }

            } else if (action.equals("Take Book")) {
                String bookToTake = commandParts[1];
                books.remove(bookToTake);


            } else if (action.equals("Swap Books")) {
                String firstBookToSwap = commandParts[1];
                String secondBookToSwap = commandParts[2];
                if (books.contains(firstBookToSwap) && books.contains(secondBookToSwap)) {
                    int firstIndex = books.indexOf(firstBookToSwap);
                    int secondIndex = books.indexOf(secondBookToSwap);

                    books.set(firstIndex, secondBookToSwap);
                    books.set(secondIndex, firstBookToSwap);
                }
            } else if (action.equals("Insert Book")) {
                String bookToInsert = commandParts[1];
                if (!books.contains(bookToInsert)) {
                    books.add(bookToInsert);
                }
            } else if (action.equals("Check Book")) {
                int indexToCheck = Integer.parseInt(commandParts[1]);
                if (indexToCheck >= 0 && indexToCheck <= books.size()) {
                    String checkedBook = books.get(indexToCheck);
                    System.out.println(checkedBook);
                }
            }

        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            output.append(books.get(i));
            if (i < books.size() - 1) {
                output.append(", ");
            }
        }
        System.out.println(output);
    }
}

