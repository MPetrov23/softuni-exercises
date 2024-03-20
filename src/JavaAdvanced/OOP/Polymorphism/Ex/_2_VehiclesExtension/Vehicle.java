package JavaAdvanced.OOP.Polymorphism.Ex._2_VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle implements Drivable {
    private double fuelQuantity;
    private double fuelConsumptionPerKm;
    private double maxFuelQuantity;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm, double maxFuelQuantity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.maxFuelQuantity = fuelQuantity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public void setFuelConsumptionPerKm(double fuelConsumptionPerKm) {
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
    }

    public double getMaxFuelQuantity() {
        return maxFuelQuantity;
    }

    public void setMaxFuelQuantity(double maxFuelQuantity) {
        this.maxFuelQuantity = maxFuelQuantity;
    }

    @Override
    public String drive(double distance) {
        double neededFuel = distance*this.fuelConsumptionPerKm;

        if(neededFuel>this.fuelQuantity){
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
        this.fuelQuantity-=neededFuel;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s", this.getClass().getSimpleName(), decimalFormat.format(distance));
    }

    @Override
    public void refuel(double liters) {
        if(liters>0){
            if (liters <= this.maxFuelQuantity - this.fuelQuantity) {
                this.fuelQuantity += liters;
            } else {
                System.out.printf("Cannot fit fuel in tank%n");
            }
        }else{
            System.out.println("Fuel must be a positive number");
        }
    }
}
