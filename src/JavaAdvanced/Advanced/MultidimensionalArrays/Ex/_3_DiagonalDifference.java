package JavaAdvanced.Advanced.MultidimensionalArrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = inputMatrix(size,sc);

        int primary = primaryDiagonal(size,matrix);
        int secondary = secondaryDiagonal(size, matrix);

        System.out.println(Math.abs(primary-secondary));
    }


    public static int[][] inputMatrix(int size, Scanner sc){
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
    public static int primaryDiagonal(int size, int[][] matrix){
        int result =0;

        for(int row=0;row< matrix.length; row++){
            for(int col=0; col<matrix[row].length;col++){
                if(row==col){
                    result+=matrix[row][col];
                }
            }
        }

        return result;
    }
    public static int secondaryDiagonal(int size, int[][] matrix){
        int result = 0;

        for(int row= matrix.length-1;row>=0; row--){
            for(int col=0; col<matrix[row].length;col++){
                if(row+col==size-1) {
                    result += matrix[row][col];
                }
            }
        }

        return result;
    }
}
