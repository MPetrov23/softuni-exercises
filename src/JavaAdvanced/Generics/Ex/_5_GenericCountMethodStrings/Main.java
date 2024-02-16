package JavaAdvanced.Generics.Ex._5_GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Box<String>> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            Box<String> box = new Box<>(input);
            boxList.add(box);
        }

        Box<String> boxToCompare = new Box<>(sc.nextLine());
        int results = countGreaterResults(boxList, boxToCompare);
        System.out.printf("%d%n", results);
    }

    private static <T extends Comparable<T>> int countGreaterResults(List<T> boxList, T boxToCompare) {
        int count = 0;
        for (T t : boxList) {
            int result = t.compareTo(boxToCompare);
            if (result > 0) {
                count++;
            }
        }
        return count;
    }
}