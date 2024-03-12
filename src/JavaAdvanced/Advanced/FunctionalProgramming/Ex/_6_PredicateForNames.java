package JavaAdvanced.Advanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _6_PredicateForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> names = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> check = name -> name.length() > n;
        names.removeIf(check);
        names.forEach(e -> System.out.println(e));
    }
}