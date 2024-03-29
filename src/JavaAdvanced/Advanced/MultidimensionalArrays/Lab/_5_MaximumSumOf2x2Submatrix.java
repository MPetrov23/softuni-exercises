package JavaAdvanced.Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] param = inputArray(sc);
        int rows= param[0];
        int cols= param[1];
        int[][] matrix = new int[rows][cols];
        for(int row=0; row<rows; row++){
            matrix[row] = inputArray(sc);
        }

        int[][] maxMatrix = maxSubMatrix(matrix);
        printMatrix(maxMatrix);
        System.out.println(matrixSum(maxMatrix));


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

    public static int[][] maxSubMatrix(int[][] matrix){
        int maxSum = Integer.MIN_VALUE;
        int[][] max = new int[2][2];

        for(int row=0; row<matrix.length-1; row++){
            for(int col=0; col < matrix[row].length-1; col++){
                int currentSum = matrix[row][col]+matrix[row][col+1]+
                                matrix[row+1][col]+matrix[row+1][col+1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    max[0][0]=matrix[row][col];
                    max[0][1]=matrix[row][col+1];
                    max[1][0]=matrix[row+1][col];
                    max[1][1]=matrix[row+1][col+1];
                }
            }
        }

        return max;
    }
    public static void printMatrix(int[][] matrix) {
        for(int row = 0; row< matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
}
