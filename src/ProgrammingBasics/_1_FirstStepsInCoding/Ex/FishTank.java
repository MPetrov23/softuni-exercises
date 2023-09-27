package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        float percent = Float.parseFloat(scanner.nextLine());

        double capacity = length*width*height;
        double capacityInLiters = capacity/1000; //

        double neededLiters = capacityInLiters-capacityInLiters*percent/100;
        System.out.print(neededLiters);

    }
}
