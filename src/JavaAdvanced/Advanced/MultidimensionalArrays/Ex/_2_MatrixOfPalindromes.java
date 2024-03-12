package JavaAdvanced.Advanced.MultidimensionalArrays.Ex;

import java.util.Scanner;

public class _2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] params =sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(params[0]);
        int cols = Integer.parseInt(params[1]);

        createMatrix(rows,cols);
    }
    public static void printMatrix(String[][] matrix) {
        for(int row = 0; row< matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    public static void createMatrix(int rows, int cols){
        String[][] matrix = new String[rows][cols];

        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                char first = (char) (97+row);
                char mid = (char) (first+col);

                matrix[row][col]= String.valueOf(first)+String.valueOf(mid)+String.valueOf(first);
            }
        }
        printMatrix(matrix);
    }

}
