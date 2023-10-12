package ProgrammingFundamentals._3_Arrays.MoreExercise;

import java.util.Scanner;

public class _2_PascalTriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numRows=Integer.parseInt(sc.nextLine());

        for (int row = 0; row < numRows; row++) {
            int number =1;
             for (int col = 0; col <= row; col++) {
                System.out.print(number + " ");
                number = number * (row - col) / (col + 1);
            }
            System.out.println();
        }
    }
}

