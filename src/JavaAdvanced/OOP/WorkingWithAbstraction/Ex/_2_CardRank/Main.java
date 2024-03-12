package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._2_CardRank;

public class Main {
    public static void main(String[] args) {
        CardsRank[] cards = CardsRank.values();
        System.out.println("Card Ranks:");

        for (CardsRank card : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card);
        }
    }
}
