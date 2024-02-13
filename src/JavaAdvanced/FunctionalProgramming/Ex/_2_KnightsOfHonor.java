package JavaAdvanced.FunctionalProgramming.Ex;

import java.util.Scanner;
import java.util.function.Consumer;

public class _2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");
        Consumer<String> printName = name -> System.out.printf("Sir %s%n", name );
        for (String name : names) {
            printName.accept(name);
        }
    }
}
