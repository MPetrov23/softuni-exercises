package ProgrammingBasics._1_FirstStepsInCoding.Ex;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tax = Integer.parseInt(scanner.nextLine());

        double sneakers =tax - tax*0.40;
        double kit = sneakers - sneakers*0.20;
        double ball = kit/4;
        double accessories = ball/5;

        double total  = tax+sneakers+kit+ball+accessories;

        System.out.print(total);

    }
}
