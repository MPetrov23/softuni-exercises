package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._3_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rank = sc.nextLine();
        String suit = sc.nextLine();

        Card card = new Card(CardsRank.valueOf(rank), CardsSuit.valueOf(suit));
        System.out.printf("Card name: %s of %s; Card power: %d", card.getCardRank(), card.getCardSuit(), card.getPower());
    }
}
