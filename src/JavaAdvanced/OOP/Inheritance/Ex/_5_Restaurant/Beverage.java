package JavaAdvanced.OOP.Inheritance.Ex._5_Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double milliliters;

    public Beverage(String name, BigDecimal price, double mililiters) {
        super(name, price);
        this.milliliters = mililiters;
    }

    public double getMililiters() {
        return milliliters;
    }
}
