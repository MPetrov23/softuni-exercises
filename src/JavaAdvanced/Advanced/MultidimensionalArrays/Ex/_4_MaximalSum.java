package JavaAdvanced.Advanced.MultidimensionalArrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _4_MaximalSum {
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
        System.out.printf("Sum = %s%n",matrixSum(maxMatrix));
        printMatrix(maxMatrix);

    }
    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
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
        int[][] max = new int[3][3];

        for(int row=0; row<matrix.length-2; row++){
            for(int col=0; col < matrix[row].length-2; col++){
                int currentSum = matrix[row][col]+matrix[row][col+1]+matrix[row][col+2]+
                        matrix[row+1][col]+matrix[row+1][col+1]+matrix[row+1][col+2]+
                        matrix[row+2][col]+matrix[row+2][col+1]+matrix[row+2][col+2];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                    max[0][0]=matrix[row][col];
                    max[0][1]=matrix[row][col+1];
                    max[0][2]=matrix[row][col+2];

                    max[1][0]=matrix[row+1][col];
                    max[1][1]=matrix[row+1][col+1];
                    max[1][2]=matrix[row+1][col+2];

                    max[2][0]=matrix[row+2][col];
                    max[2][1]=matrix[row+2][col+1];
                    max[2][2]=matrix[row+2][col+2];
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
