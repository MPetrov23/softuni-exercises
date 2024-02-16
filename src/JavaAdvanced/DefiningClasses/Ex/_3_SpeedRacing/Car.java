package JavaAdvanced.DefiningClasses.Ex._3_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelPerKm;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelPer1Km, int distanceTraveled) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelPerKm = fuelPer1Km;
        this.distanceTraveled = distanceTraveled;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public boolean isEnoughFuel(int distance) {
        return this.fuelAmount >= neededFuel(distance);
    }

    private double neededFuel(int distance) {
        return this.fuelPerKm * distance;
    }

    public void reduceFuel(int distance) {
        this.fuelAmount -= neededFuel(distance);
    }

    public void increaseKM(int distance) {
        this.distanceTraveled += distance;
    }
}
