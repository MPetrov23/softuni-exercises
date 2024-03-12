package JavaAdvanced.Advanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _8_CustomComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Comparator<Integer> comparator = (first, seconds) -> {
            if (first % 2 == 0 && seconds % 2 != 0) {
                return -1;
            }
            if (first % 2 != 0 && seconds % 2 == 0) {
                return 1;
            }
            return first.compareTo(seconds);
        };

        Arrays.sort(numbers, comparator);
        Arrays.stream(numbers).forEach(n -> System.out.print(n+" "));
    }
}
