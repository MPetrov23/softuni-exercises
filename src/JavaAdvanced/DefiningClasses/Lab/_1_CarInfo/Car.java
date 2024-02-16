package JavaAdvanced.DefiningClasses.Lab._1_CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    public void carInfo(Car car){
        System.out.printf("The car is: %s %s - %d HP.\n",getBrand(),getModel(),getHorsePower());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
