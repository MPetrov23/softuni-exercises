package JavaAdvanced.Advanced.Generics.Ex._2_GenericBoxOfInteger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(sc.nextLine());
            Box<Integer> box = new Box<>(input);
            System.out.printf("%s%n", box.toString());
        }
    }
}