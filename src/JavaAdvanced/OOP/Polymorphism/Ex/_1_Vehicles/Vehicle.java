package JavaAdvanced.OOP.Polymorphism.Ex._1_Vehicles;

import java.text.DecimalFormat;

public class Vehicle implements Drivable{
    private double fuelQuantity;
    private double fuelConsumptionPerKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    @Override
    public String drive(double distance) {
        double neededFuel = distance*this.fuelConsumptionPerKm;

        if(neededFuel>this.fuelQuantity){
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        this.fuelQuantity-=neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity +=liters;
    }
}
