package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._3_CardsWithPower;

public class Card {
    private CardsSuit cardSuit;
    private CardsRank cardRank;
    private int power;


    public Card(CardsRank cardsRank, CardsSuit cardSuit) {
        this.cardRank = cardsRank;
        this.cardSuit = cardSuit;
        this.power = this.cardRank.getPowerRank() + this.cardSuit.getSuitPower();
    }

    public CardsSuit getCardSuit() {
        return cardSuit;
    }

    public CardsRank getCardRank() {
        return cardRank;
    }

    public int getPower() {
        return power;
    }
}
