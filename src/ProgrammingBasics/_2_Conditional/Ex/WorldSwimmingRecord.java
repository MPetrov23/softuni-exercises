package ProgrammingBasics._2_Conditional.Ex;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordTime = Double.parseDouble(scanner.nextLine());
        double lengthInMeters = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());

        double timeIvan=lengthInMeters*timeForMeter;
        int delay= (int) (lengthInMeters/15);
        timeIvan=timeIvan + delay*12.5;

        double difference=timeIvan-recordTime;

        if(timeIvan<recordTime){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }




    }
}
