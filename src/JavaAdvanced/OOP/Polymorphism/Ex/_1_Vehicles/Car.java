package JavaAdvanced.OOP.Polymorphism.Ex._1_Vehicles;

public class Car extends Vehicle{
    private final static double AC_CONSUMPTION_INCREASE=0.9;

    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm);
        super.setFuelConsumptionPerKm(super.getFuelConsumptionPerKm()+AC_CONSUMPTION_INCREASE);
    }
}
