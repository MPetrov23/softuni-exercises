package JavaAdvanced.Advanced.FunctionalProgramming.Ex;

import java.util.Scanner;
import java.util.function.Consumer;

public class _1_ConsumerPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");
        Consumer<String> printName = name -> System.out.printf("%s%n", name);
        for (String name : names) {
            printName.accept(name);
        }
    }
}