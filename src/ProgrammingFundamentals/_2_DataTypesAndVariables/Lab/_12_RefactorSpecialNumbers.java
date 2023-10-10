package ProgrammingFundamentals._2_DataTypesAndVariables.Lab;

import java.util.Scanner;

public class _12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums = Integer.parseInt(scanner.nextLine());


        boolean isSpecial = false;

        for (int i = 1; i <= nums; i++) {
            int sum = 0;
            int current = i;
            while (current > 0) {
                sum += current % 10;
                current = current / 10;
            }
            isSpecial = (sum == 5) || (sum == 7) || (sum == 11);
            if(isSpecial) {
                System.out.printf("%d -> True\n", i);
            }else {
                System.out.printf("%d -> False\n", i);
            }

        }

            }
}
