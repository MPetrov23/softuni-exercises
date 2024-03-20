package JavaAdvanced.OOP.Polymorphism.Ex._2_VehiclesExtension;

public class Bus extends Vehicle{
    private final static double AC_CONSUMPTION_INCREASE=1.4;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double maxFuelQuantity) {
        super(fuelQuantity, fuelConsumptionPerKm, maxFuelQuantity);
    }

    @Override
    public String drive(double distance) {
        super.setFuelConsumptionPerKm(super.getFuelConsumptionPerKm() + AC_CONSUMPTION_INCREASE);
        return super.drive(distance);
    }

    public String driveEmpty (Double distance) {
        return super.drive(distance);
    }

}
