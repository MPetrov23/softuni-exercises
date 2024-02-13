package JavaAdvanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _9_ListOfPredicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        List<Integer> numbersOfList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 1; i <= number; i++) {
            boolean isItDivisible = true;
            int currentNumber = i;
            for (int j = 0; j < numbersOfList.size(); j++) {
                Predicate<Integer> check = n -> currentNumber % n != 0;
                if (check.test(numbersOfList.get(j))) {
                    isItDivisible = false;
                    break;
                }
            }
            if (isItDivisible) {
                System.out.print(currentNumber+" ");
            }
        }
    }
}
