package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double materialsSum = (nylon+2)*1.5 + (paint*1.1)*14.50 + diluent*5 + 0.4;
        double workSum = (materialsSum*0.3) * workHours;
        double totalSum = materialsSum + workSum;

        System.out.print(totalSum);
    }
}
