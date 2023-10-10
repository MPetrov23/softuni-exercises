package ProgrammingFundamentals._3_Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _4_ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArray= sc.nextLine().split(" ");

        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
