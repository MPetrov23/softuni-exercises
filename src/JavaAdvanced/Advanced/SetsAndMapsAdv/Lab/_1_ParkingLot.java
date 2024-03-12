package JavaAdvanced.Advanced.SetsAndMapsAdv.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _1_ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> parkingLot = new LinkedHashSet<>();

        String input=sc.nextLine();

        while(!"END".equals(input)){
            String[] commandParts = input.split(",\\s+");
            String command=commandParts[0];
            String car=commandParts[1];

            if("IN".equals(command)){
                parkingLot.add(car);
            }else if("OUT".equals(command))
            {
                parkingLot.remove(car);
            }
            input=sc.nextLine();
        }

        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else{
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }
    }
}
