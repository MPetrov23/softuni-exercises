package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposit = Integer.parseInt(scanner.nextLine());
        int timeInMonths = Integer.parseInt(scanner.nextLine());
        float percent = Float.parseFloat(scanner.nextLine());

        float sum = deposit + timeInMonths * ((deposit*percent/100)/12);
        System.out.println(sum);
    }

}
