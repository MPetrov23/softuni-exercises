package JavaAdvanced.OOP.Polymorphism.Ex._2_VehiclesExtension;

public class Truck extends Vehicle {
    private final static double AC_CONSUMPTION_INCREASE=1.6;
    private final static double MAX_FUEL_QUANTITY=0.95;

    public Truck(double fuelQuantity, double fuelConsumptionPerKm, double maxFuelQuantity) {
        super(fuelQuantity, fuelConsumptionPerKm, maxFuelQuantity);
        super.setFuelConsumptionPerKm(super.getFuelConsumptionPerKm()+AC_CONSUMPTION_INCREASE);
    }


    @Override
    public void refuel(double liters) {
        liters *= MAX_FUEL_QUANTITY;
        super.refuel(liters);
    }
}
