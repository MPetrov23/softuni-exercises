package JavaAdvanced.DefiningClasses.Lab._1_CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carsCount = Integer.parseInt(sc.nextLine());

        for(int i=0; i<carsCount; i++){
            String[] carData = sc.nextLine().split("\\s+");

            Car car = new Car();
            car.setBrand(carData[0]);
            car.setModel(carData[1]);
            car.setHorsePower(Integer.parseInt(carData[2]));

            car.carInfo(car);
        }


    }


}
