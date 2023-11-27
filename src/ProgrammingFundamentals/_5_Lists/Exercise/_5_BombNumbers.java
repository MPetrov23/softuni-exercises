package ProgrammingFundamentals._5_Lists.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _5_BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bomb= sc.nextLine().split(" ");
        int bombNumber= Integer.parseInt(bomb[0]);
        int power= Integer.parseInt(bomb[1]);
        int sum=0;
        int bombIndex = numbers.indexOf(bombNumber);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bombNumber) {
                int startIndex = Math.max(0, i - power);
                int endIndex = Math.min(numbers.size() - 1, i + power);

                for (int j = endIndex; j >= startIndex; j--) {
                    numbers.remove(j);
                }
                i = Math.max(0, i - power - 1);
            }
        }
        for (int num : numbers) {
            sum += num;
         }
        System.out.println(sum);
    }
}
