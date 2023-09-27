package ProgrammingBasics._1_FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            float inch = Float.parseFloat(scanner.nextLine());
            double centimeter= inch * 2.54;
            System.out.println(centimeter);
        }
}
