package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._1_CardSuit;

public class Main {
    public static void main(String[] args) {
        Cards[] cards = Cards.values();
        System.out.println("Card Suits:");

        for (Cards card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card);
        }
    }
}
