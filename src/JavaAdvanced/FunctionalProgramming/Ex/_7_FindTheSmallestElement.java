package JavaAdvanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _7_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestNumbers = list -> Collections.min(list);
        int smallestNumber = findSmallestNumbers.apply(numbers);
        System.out.print(numbers.lastIndexOf(smallestNumber));
    }
}
