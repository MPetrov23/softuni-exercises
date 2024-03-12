package JavaAdvanced.Advanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _4_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> add = num -> num.stream().map(nums -> nums + 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = num -> num.stream().map(nums -> nums * 2).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = num -> num.stream().map(nums -> nums - 1).collect(Collectors.toList());
        Consumer<List<Integer>> print = num -> num.forEach(nums -> System.out.printf("%d ", nums));

        String command = sc.nextLine();
        while (!command.equals("end")) {

            switch (command){
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtract.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    System.out.println();
                    break;
            }

            command = sc.nextLine();
        }
    }
}
