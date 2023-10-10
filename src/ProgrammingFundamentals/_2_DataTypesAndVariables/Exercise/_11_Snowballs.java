package ProgrammingFundamentals._2_DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int snowballs = Integer.parseInt(sc.nextLine());
        int snowballSnow=0;
        int snowballTime=0;
        int snowballQuality=0;
        double snowballValue=0;

        for(int i = 0; i < snowballs; i ++){
            int currentSnowballSnow=Integer.parseInt(sc.nextLine());
            int currentSnowballTime=Integer.parseInt(sc.nextLine());
            int currentSnowballQuality=Integer.parseInt(sc.nextLine());
            double currentSnowballValue = Math.pow(currentSnowballSnow/currentSnowballTime,currentSnowballQuality);

       if(currentSnowballValue>snowballValue){
           snowballSnow=currentSnowballSnow;
           snowballTime=currentSnowballTime;
           snowballQuality=currentSnowballQuality;
           snowballValue=currentSnowballValue;
       }
        }

        System.out.printf("%d : %d = %.0f (%d)", snowballSnow,snowballTime,snowballValue,snowballQuality);
    }
}
