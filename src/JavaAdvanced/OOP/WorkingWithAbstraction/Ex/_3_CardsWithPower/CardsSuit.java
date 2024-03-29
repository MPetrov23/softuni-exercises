package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._3_CardsWithPower;

public enum CardsSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitPower;

    CardsSuit (int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return this.suitPower;
    }
}
