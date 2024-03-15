package JavaAdvanced.OOP.Inheritance.Ex._4_NeedForSpeed;

public class CrossMotorcycle extends Motorcycle{
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(3);
    }
}
