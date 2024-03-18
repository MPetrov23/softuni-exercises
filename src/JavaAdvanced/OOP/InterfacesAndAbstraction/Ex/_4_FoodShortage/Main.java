package JavaAdvanced.OOP.InterfacesAndAbstraction.Ex._4_FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Rebel> rebels = new ArrayList<>();
        List<Citizen> citizens = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split("\\s+");
            if (input.length == 4) {
                Citizen citizen = new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]);
                citizens.add(citizen);
            } else if (input.length == 3) {
                Rebel rebel = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
                rebels.add(rebel);
            }
        }

        String buyer = sc.nextLine();
        while (!"End".equals(buyer)) {
            for (Rebel rebel : rebels) {
                if (rebel.getName().equals(buyer)) {
                    rebel.buyFood();
                }
            }
            for (Citizen citizen : citizens) {
                if (citizen.getName().equals(buyer)) {
                    citizen.buyFood();
                }
            }
            buyer = sc.nextLine();
        }

        int totalFood = 0;
        for (Rebel rebel : rebels) {
            totalFood += rebel.getFood();
        }
        for (Citizen citizen : citizens) {
            totalFood += citizen.getFood();
        }

        System.out.println(totalFood);
    }
}
