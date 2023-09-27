package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double sum = (pens * 5.8 + markers * 7.2 + cleaningAgent * 1.2);
        double totalSum= sum - (sum*discount/100);



        System.out.print(totalSum);
    }
}