package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _6_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int param = Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[param][param];
        for (int row = 0; row < param; row++) {
            matrix[row] = inputArray(sc);
        }

        printArray(primaryDiagonal(param,matrix));
        printArray(secondaryDiagonal(param,matrix));
    }
    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[] primaryDiagonal(int size, int[][] matrix){
        int[] result = new int[size];

        for(int row=0;row< matrix.length; row++){
            for(int col=0; col<matrix[row].length;col++){
                if(row==col){
                    result[row]=matrix[row][col];
                }
            }
        }

        return result;
    }
    public static int[] secondaryDiagonal(int size, int[][] matrix){
        int[] result = new int[size];

        for(int row= matrix.length-1;row>=0; row--){
            for(int col=0; col<matrix[row].length;col++){
                if(row+col==size-1) {
                    result[col] = matrix[row][col];
                }
            }
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
