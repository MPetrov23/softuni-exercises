package JavaAdvanced.Advanced.FunctionalProgramming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_FilterByAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> info = new LinkedHashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(", ");
            info.put(input[0], Integer.parseInt(input[1]));
        }
        String condition = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String format = sc.nextLine();

        info.entrySet().forEach(entry -> {
            if (condition.equals("younger")) {
                if (entry.getValue() <= age) {
                    if (format.equals("name")) {
                        System.out.printf("%s%n", entry.getKey());
                    } else if (format.equals("age")) {
                        System.out.printf("%d%n", entry.getValue());
                    } else if (format.equals("name age")) {
                        System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
                    }
                }
            } else if (condition.equals("older")) {
                if (entry.getValue() >= age) {
                    if (format.equals("name")) {
                        System.out.printf("%s%n", entry.getKey());
                    } else if (format.equals("age")) {
                        System.out.printf("%d%n", entry.getValue());
                    } else if (format.equals("name age")) {
                        System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
                    }
                }
            }
        });

    }

}
