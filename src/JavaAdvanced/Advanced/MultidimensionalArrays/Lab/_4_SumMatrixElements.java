package JavaAdvanced.Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _4_SumMatrixElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] param = inputArray(sc);
        int rows= param[0];
        int cols= param[1];
        int[][] matrix = new int[rows][cols];
        for(int row=0; row<rows; row++){
            matrix[row] = inputArray(sc);
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(matrixSum(matrix));
    }
    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int matrixSum(int[][] matrix){
        int sum=0;
        for(int row=0; row<matrix.length; row++){
            for(int col=0; col<matrix[row].length; col++){
                sum+=matrix[row][col];
            }
        }
        return sum;
    }
}
