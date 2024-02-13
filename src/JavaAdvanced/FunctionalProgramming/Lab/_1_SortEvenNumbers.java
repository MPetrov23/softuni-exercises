package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _1_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(",\\s+"))
                .map(s ->Integer.parseInt(s))
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 ==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers.toString().replaceAll("\\[|]",""));
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString().replaceAll("\\[|]",""));
    }
}
