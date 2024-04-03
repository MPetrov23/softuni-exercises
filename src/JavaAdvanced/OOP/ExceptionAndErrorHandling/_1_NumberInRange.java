package JavaAdvanced.OOP.ExceptionAndErrorHandling;

import java.util.Scanner;

public class _1_NumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] range = sc.nextLine().split(" ");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);
        System.out.printf("Range: [%d...%d]\n",start,end);

        int validNumber = validNumber(sc,start,end);
        System.out.printf("Valid number: %d", validNumber);
    }

    private static int validNumber(Scanner sc, int start, int end){
        while (true) {
            String input = sc.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number >= start && number <= end) {
                    return number;
                }
            } catch (NumberFormatException exception) {
            }

            System.out.printf("Invalid number: %s%n", input);
        }
    }

}
