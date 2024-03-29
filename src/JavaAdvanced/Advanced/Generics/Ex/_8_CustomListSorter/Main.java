package JavaAdvanced.Advanced.Generics.Ex._8_CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String input = sc.nextLine();
        while (!input.equals("END")) {
            String[] inputParts = input.split("\\s+");
            String command = inputParts[0];
            if (command.equals("Add")) {
                customList.add(inputParts[1]);
            } else if (command.equals("Remove")) {
                customList.remove(Integer.parseInt(inputParts[1]));
            } else if (command.equals("Contains")) {
                System.out.printf("%s%n", customList.contains(inputParts[1]));
            } else if (command.equals("Swap")) {
                customList.swap(Integer.parseInt(inputParts[1]), Integer.parseInt(inputParts[2]));
            } else if (command.equals("Greater")) {
                System.out.printf("%s%n", customList.countGreaterThan(inputParts[1]));
            } else if (command.equals("Max")) {
                System.out.printf("%s%n", customList.getMax());
            } else if (command.equals("Min")) {
                System.out.printf("%s%n", customList.getMin());
            }else if (command.equals("Sort")) {
                Sorter.sort(customList);
            } else if (command.equals("Print")) {
                customList.print();
            }
            input = sc.nextLine();
        }
    }
}