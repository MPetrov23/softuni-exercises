package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _6_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = sc.nextLine();
        Predicate<Integer> evenOrOdd = number -> number % 2 == 0;

        if (command.equals("odd")) {
            for (int i = numbers.get(0); i <= numbers.get(1) ; i++) {
                if (!evenOrOdd.test(i)) {
                    System.out.printf("%d ", i);
                }
            }
        } else if (command.equals("even")) {
            for (int i = numbers.get(0); i <= numbers.get(1) ; i++) {
                if (evenOrOdd.test(i)) {
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
