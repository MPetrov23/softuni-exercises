package ProgrammingFundamentals._2_.Exercise;

import java.util.Scanner;

public class _07_WaterOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines=Integer.parseInt(sc.nextLine());
        int capacity=255;
        int water=0;

        for(int i=0; i<lines; i++){
            int currWater=Integer.parseInt(sc.nextLine());
            if(capacity>=currWater) {
                capacity -= currWater;
                water+=currWater;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(water);
    }
}
