package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._3_BirthdayCelebrations;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Birthable> birthables = new ArrayList<>();

        String command = scanner.nextLine();
        while (!"End".equals(command)) {
            String[] commandParts = command.split("\\s+");

            if (commandParts[0].equals("Citizen")) {
                Citizen citizen = new Citizen(commandParts[1], Integer.parseInt(commandParts[2]), commandParts[3], commandParts[4]);
                birthables.add(citizen);
            } else if (commandParts[0].equals("Pet")) {
                Pet pet = new Pet(commandParts[1], commandParts[2]);
                birthables.add(pet);
            }
            command = scanner.nextLine();
        }

        command = scanner.nextLine();

        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().endsWith(command)) {
                System.out.printf("%s%n", birthable.getBirthDate());
            }
        }
    }

}

