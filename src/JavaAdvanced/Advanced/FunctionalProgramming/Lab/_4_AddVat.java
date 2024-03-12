package JavaAdvanced.Advanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class _4_AddVat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UnaryOperator<Double> addVAT = x ->x*1.2;
        Consumer<Double> print = s -> System.out.printf("%.2f\n",s);

        List<Double> numbers = Arrays.stream(sc.nextLine().split(",\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        for (double num : numbers) {
           print.accept(addVAT.apply(num));
        }
    }
}