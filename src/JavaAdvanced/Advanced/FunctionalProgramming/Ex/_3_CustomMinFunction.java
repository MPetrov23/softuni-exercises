package JavaAdvanced.Advanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _3_CustomMinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Function<Integer[], Integer> findSmallestNumbers = arr -> Arrays.stream(arr).mapToInt(e -> e).min().getAsInt();
        int smallestNumber = findSmallestNumbers.apply(numbers);
        System.out.print( smallestNumber);
    }
}
