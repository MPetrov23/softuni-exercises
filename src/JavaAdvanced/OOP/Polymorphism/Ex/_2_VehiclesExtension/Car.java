package JavaAdvanced.OOP.Polymorphism.Ex._2_VehiclesExtension;

public class Car extends Vehicle {
    private final static double AC_CONSUMPTION_INCREASE=0.9;


    public Car(double fuelQuantity, double fuelConsumptionPerKm, double maxFuelQuantity) {
        super(fuelQuantity, fuelConsumptionPerKm, maxFuelQuantity);
        super.setFuelConsumptionPerKm(super.getFuelConsumptionPerKm()+AC_CONSUMPTION_INCREASE);
    }
}
