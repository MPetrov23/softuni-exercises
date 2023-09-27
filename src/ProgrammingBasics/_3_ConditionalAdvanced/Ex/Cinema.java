package ProgrammingBasics._3_ConditionalAdvanced.Ex;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        double total=0.0;
        double price=0.0;

        switch (projection){
            case "Premiere":
                price=12.0;
                break;
            case "Normal":
                price=7.5;
                break;
            case "Discount":
                price=5.0;
                break;
        }

        total=price*rows*cols;
        System.out.printf("%.2f leva", total);
    }
}
