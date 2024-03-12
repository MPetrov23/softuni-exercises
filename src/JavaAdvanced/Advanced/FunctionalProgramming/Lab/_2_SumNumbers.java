package JavaAdvanced.Advanced.FunctionalProgramming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Function<String,Integer> func = x -> Integer.parseInt(x);

        List<Integer> nums=Arrays.stream(sc.nextLine().split(",\\s+"))
                .map(func)
                .collect(Collectors.toList());

        int count = nums.size();
        int sum = nums.stream().mapToInt(x ->x.intValue()).sum();

        System.out.println("Count = "+count);
        System.out.println("Sum = "+sum);
    }
}
