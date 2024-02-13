package JavaAdvanced.FunctionalProgramming.Ex;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _10_PredicateParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Predicate<String> predicate;
        List<String> guests = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!"Party!".equals(command)) {

            String[] commandParts = command.split("\\s+");

            if (commandParts[1].equals("StartsWith")) {
                predicate = s -> s.startsWith(commandParts[2]);
            } else if (commandParts[1].equals("EndsWith")) {
                predicate = s -> s.endsWith(commandParts[2]);
            } else {
                predicate = s -> s.length() == Integer.parseInt(commandParts[2]);
            }

            if (commandParts[0].equals("Remove")) {
                guests.removeIf(predicate);
            } else if (commandParts[0].equals("Double")) {
                List<String> guestDouble = guests.stream().filter(predicate).collect(Collectors.toList());
                guests.addAll(guestDouble);
            }
            command = sc.nextLine();
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            String print = guests.stream().sorted().collect(Collectors.joining(", "));
            System.out.printf("%s are going to the party!%n", print);
        }
    }
}
