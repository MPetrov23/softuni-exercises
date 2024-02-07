package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _8_WrongMeasurements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.nextLine());
        int[][] matrix = inputMatrix(size,sc);
        int[] targetCoordinates = inputArray(sc);
        int target = matrix[targetCoordinates[0]][targetCoordinates[1]];

        replaceValues(matrix,target);
    }
    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[][] inputMatrix(int size,Scanner sc){
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = inputArray(sc);
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for(int row = 0; row< matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    public static void replaceValues( int[][] matrix, int target){
        int[][] result = new int[matrix.length][matrix[0].length];

        for(int row = 0; row< matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){

                if(matrix[row][col]==target){
                    int newValue=0;
                    if(row>0 && matrix[row-1][col]!=target){
                            newValue += matrix[row - 1][col];
                    }
                    if(row< matrix.length-1 && matrix[row+1][col]!=target){
                            newValue += matrix[row + 1][col];
                    }
                    if(col>0 && matrix[row][col-1]!=target){
                            newValue += matrix[row][col - 1];
                    }
                    if(col<matrix[row].length-1 && matrix[row][col+1]!=target){
                            newValue += matrix[row][col + 1];
                    }
                    result[row][col]=newValue;
                }else {
                    result[row][col] = matrix[row][col];
                }
            }
        }
        printMatrix(result);
    }

}
