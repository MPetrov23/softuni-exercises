package ProgrammingFundamentals._2_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class _1_ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meters=Integer.parseInt(sc.nextLine());
        double kilometers = (meters*1.00)/1000;
        System.out.printf("%.2f", kilometers);
    }
}
