package ProgrammingFundamentals._6_ObjectsAndClasses.Exercise._5_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> vehicleCatalogue = new ArrayList<>();
        String newVehicle = sc.nextLine();

        double carHorsePower=0.0;
        double truckHorsePower=0.0;
        int cars=0;
        int trucks=0;

        while(!newVehicle.equals("End")){
            String[] vehicleData = newVehicle.split(" ");
            String type = vehicleData[0];
            String model = vehicleData[1];
            String color = vehicleData[2];
            int horsepower = Integer.parseInt(vehicleData[3]);

            if(type.equals("car")){
                cars++;
                carHorsePower+=horsepower;
            }else if(type.equals("truck")) {
                trucks++;
                truckHorsePower+=horsepower;
            }
            Vehicle vehicle = new Vehicle(type,model,color,horsepower);
            vehicleCatalogue.add(vehicle);

            newVehicle=sc.nextLine();
        }

        String browse=sc.nextLine();
        while(!browse.equals("Close the Catalogue")){
            for(int i=0;i<vehicleCatalogue.size();i++){
                if(browse.equals(vehicleCatalogue.get(i).getModel())){
                    Vehicle vehicle = vehicleCatalogue.get(i);
                    System.out.println("Type: "+vehicle.getType().substring(0, 1).toUpperCase()+vehicle.getType().substring(1));
                    System.out.println("Model: "+vehicle.getModel());
                    System.out.println("Color: "+vehicle.getColor());
                    System.out.println("Horsepower: "+vehicle.getHorsepower());
                }
            }
            browse=sc.nextLine();
        }
        if(cars>0) {
            System.out.printf("Cars have average horsepower of: %.2f.\n", carHorsePower / cars);
        }else{
            System.out.printf("Cars have average horsepower of: %.2f.\n", carHorsePower);
        }
        if(trucks>0) {
            System.out.printf("Trucks have average horsepower of: %.2f.", truckHorsePower / trucks);
        }else{
            System.out.printf("Trucks have average horsepower of: %.2f.", truckHorsePower);

        }

    }
}
