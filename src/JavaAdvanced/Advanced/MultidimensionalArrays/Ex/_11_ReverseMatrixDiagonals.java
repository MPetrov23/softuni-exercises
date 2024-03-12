package JavaAdvanced.Advanced.MultidimensionalArrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _11_ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputMatrix(sc);

    }

    public static void inputMatrix(Scanner sc){
        String[] dimension = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    print(matrix,rows,cols);
    }

    public static void print(int[][] matrix, int rows, int cols){

        for(int c=cols-1; c>0 ;c--){
            for(int row=rows-1, col=c; row>=0 && col<cols; row--,col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        for(int r=rows-1 ; r>=0 ;r--){
            for(int col=0, row=r;  row>=0 && col<cols; col++,row--){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
