package JavaAdvanced.OOP.Inheritance.Ex._4_NeedForSpeed;

public class RaceMotorcycle extends Motorcycle{

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(8);
    }
}
