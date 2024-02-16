package JavaAdvanced.DefiningClasses.Lab._2_CarConstructors;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carsCount = Integer.parseInt(sc.nextLine());

        for(int i=0; i<carsCount; i++){
            String[] carData = sc.nextLine().split("\\s+");

            if(carData.length==1){
                Car car = new Car(carData[0]);
                car.carInfo(car);
            }else{
                Car car = new Car(carData[0],
                        carData[1],
                        Integer.parseInt(carData[2]));
                car.carInfo(car);
            }


        }
    }
}
