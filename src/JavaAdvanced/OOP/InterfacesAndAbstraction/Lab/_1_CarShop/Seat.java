package JavaAdvanced.OOP.InterfacesAndAbstraction.Lab._1_CarShop;

public class Seat implements Car{
    private String model;
    private String color;
    private int horsePower;
    private String countryProduced;

    public Seat(String model, String color, int horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    @Override
    public String toString() {
        return "This is "+getModel()+" produced in "+ countryProduced()+ " and have "+ Car.TIRES+" tires";
    }
}
