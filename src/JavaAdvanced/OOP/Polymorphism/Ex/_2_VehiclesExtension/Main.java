package JavaAdvanced.OOP.Polymorphism.Ex._2_VehiclesExtension;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carData = sc.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carData[1]), Double.parseDouble(carData[2]), Double.parseDouble(carData[3]));

        String[] truckData = sc.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckData[1]), Double.parseDouble(truckData[2]), Double.parseDouble(truckData[3]));

        String[] busData = sc.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busData[1]), Double.parseDouble(busData[2]), Double.parseDouble(busData[3]));

        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            String[] commandParts = sc.nextLine().split("\\s+");

            String command = commandParts[0];
            if (command.equals("Drive")) {
                if (commandParts[1].equals("Car")) {
                    System.out.printf("%s%n", car.drive(Double.parseDouble(commandParts[2])));
                } else if (commandParts[1].equals("Truck")) {
                    System.out.printf("%s%n", truck.drive(Double.parseDouble(commandParts[2])));
                } else {
                    System.out.printf("%s%n", bus.drive(Double.parseDouble(commandParts[2])));
                }

            } else if (command.equals("Refuel")) {
                if (commandParts[1].equals("Car")) {
                    car.refuel(Double.parseDouble(commandParts[2]));
                } else if (commandParts[1].equals("Truck")) {
                    truck.refuel(Double.parseDouble(commandParts[2]));
                } else {
                    bus.refuel(Double.parseDouble(commandParts[2]));
                }

            } else if (command.equals("DriveEmpty")) {
                System.out.printf("%s%n", bus.driveEmpty(Double.parseDouble(commandParts[2])));
            }
        }

        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f%n", bus.getFuelQuantity());
    }



}


