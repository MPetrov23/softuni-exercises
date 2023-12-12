package Exams.Fundamentals_MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class _02_FriendListMaintenance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> contacts = Arrays.stream(sc.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true) {
            String command = sc.nextLine();
            if (command.equals("Report")) {
                break;
            }

            String[] commandParts = command.split(" ");
            String action = commandParts[0];

            if (action.equals("Blacklist")) {
                String nameToBlacklist = commandParts[1];
                if (contacts.contains(nameToBlacklist)) {
                    int index = contacts.indexOf(nameToBlacklist);
                    contacts.set(index, "Blacklisted");
                    System.out.println(nameToBlacklist + " was blacklisted.");
                } else {
                    System.out.println(nameToBlacklist + " was not found.");
                }

            } else if (action.equals("Error")) {
                int index = Integer.parseInt(commandParts[1]);
                if (index >= 0 && index < contacts.size() && !contacts.get(index).equals("Blacklisted") && !contacts.get(index).equals("Lost")) {
                    System.out.println(contacts.get(index) + " was lost due to an error.");
                    contacts.set(index, "Lost");
                }

            } else if (action.equals("Change")) {
                int index = Integer.parseInt(commandParts[1]);
                String newName = commandParts[2];
                if (index >= 0 && index < contacts.size()) {
                    String currentName = contacts.get(index);
                    System.out.println(currentName + " changed his username to " + newName+".");
                    contacts.set(index, newName);
                }
            }
        }

        int blacklistedCount = 0;
        int lostCount = 0;
        for (String name : contacts) {
            if (name.equals("Blacklisted")) {
                blacklistedCount++;
            } else if (name.equals("Lost")) {
                lostCount++;
            }
        }

        System.out.println("Blacklisted names: " + blacklistedCount);
        System.out.println("Lost names: " + lostCount);
        System.out.println(String.join(" ", contacts));
    }
}
