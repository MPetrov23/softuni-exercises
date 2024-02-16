package JavaAdvanced.Generics.Ex._6_GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Box<Double>> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Double input = Double.valueOf(sc.nextLine());
            Box<Double> box = new Box<>(input);
            boxList.add(box);
        }

        Box<Double> boxToCompare = new Box<>(Double.parseDouble(sc.nextLine()));
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