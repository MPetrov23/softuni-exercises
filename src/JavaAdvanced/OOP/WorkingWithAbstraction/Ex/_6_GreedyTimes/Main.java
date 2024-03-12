package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._6_GreedyTimes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long capacity = Long.parseLong(sc.nextLine());
        String[] safe = sc.nextLine().split("\\s+");
        Bag bag = new Bag(capacity);

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long amount = Long.parseLong(safe[i + 1]);
            if (name.length() == 3) {
                bag.addCash(name, amount);
            } else if (name.toLowerCase().endsWith("gem")) {
                bag.addGem(name, amount);
            } else if (name.toLowerCase().equals("gold")) {
                bag.addGold(amount);
            }
        }

        bag.print();
    }
}
