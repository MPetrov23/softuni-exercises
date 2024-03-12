package JavaAdvanced.Advanced.FunctionalProgramming.Ex;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _11_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<String>> filters = new LinkedHashMap<>();
        filters.put("Starts with", new ArrayList<>());
        filters.put("Ends with", new ArrayList<>());
        filters.put("Length", new ArrayList<>());
        filters.put("Contains", new ArrayList<>());

        List<String> guests = Arrays.stream(sc.nextLine()
                        .split("\\s+"))
                .collect(Collectors.toList());

        String command = sc.nextLine();
        while (!"Print".equals(command)) {

            String[] commandParts = command.split(";");

            if (commandParts[0].equals("Add filter")) {
                filters.get(commandParts[1]).add(commandParts[2]);
            } else if (commandParts[0].equals("Remove filter")) {
                filters.get(commandParts[1]).remove(commandParts[2]);
            }
            command = sc.nextLine();
        }
        filters.entrySet().forEach(entry -> {
            Predicate<String> predicate;
            if (entry.getKey().equals("Starts with")) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String parameter = entry.getValue().get(i);
                    predicate = s -> s.startsWith(parameter);
                    guests.removeIf(predicate);
                }
            } else if (entry.getKey().equals("Ends with")) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String parameter = entry.getValue().get(i);
                    predicate = s -> s.endsWith(parameter);
                    guests.removeIf(predicate);
                }
            } else if (entry.getKey().equals("Length")) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    int parameter = Integer.parseInt(entry.getValue().get(i));
                    predicate = s -> s.length() == parameter;
                    guests.removeIf(predicate);
                }
            } else if (entry.getKey().equals("Contains")) {
                for (int i = 0; i < entry.getValue().size(); i++) {
                    String parameter = entry.getValue().get(i);
                    predicate = s -> s.contains(parameter);
                    guests.removeIf(predicate);
                }
            }
        });
        for (int i = 0; i < guests.size(); i++) {
            System.out.printf("%s ", guests.get(i));
        }
    }
}
