package JavaAdvanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Predicate<String> isUpperCase = s->Character.isUpperCase(s.charAt(0));
        Consumer<String> print = s -> System.out.println(s);

        List<String> result= Arrays.stream(sc.nextLine().split("\\s+"))
                .filter(isUpperCase)
                .collect(Collectors.toList());

        print.accept(String.valueOf(result.size()));
        result.forEach(print);
    }
}
