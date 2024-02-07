package JavaAdvanced.MultidimensionalArrays.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class _5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] param = inputArray(sc);
        int rows= param[0];
        int cols= param[1];
        String[][] matrix = inputMatrix(rows,sc);

        String[] command = sc.nextLine().split("\\s+");

        while(!"END".equals(command[0])){

    if(command.length==5) {

        int rowOne = Integer.parseInt(command[1]);
        int colOne = Integer.parseInt(command[2]);
        int rowTwo = Integer.parseInt(command[3]);
        int colTwo = Integer.parseInt(command[4]);

        if("swap".equals(command[0])) {

            if (rowOne >= 0 && rowOne < rows
                    && colOne >= 0 && colOne < cols
                    && rowTwo >= 0 && rowTwo < rows
                    && colTwo >= 0 && colTwo < cols) {

                String temp = matrix[rowOne][colOne];
                matrix[rowOne][colOne] = matrix[rowTwo][colTwo];
                matrix[rowTwo][colTwo] = temp;

                printMatrix(matrix);
            } else {
                System.out.println("Invalid input!");
            }
        }else {
            System.out.println("Invalid input!");
        }
    }else {
        System.out.println("Invalid input!");
    }
            command=sc.nextLine().split("\\s+");

            }

        }

    public static void printMatrix(String[][] matrix) {
        for(int row = 0; row< matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    public static String[][] inputMatrix(int size, Scanner sc){
        String[][] matrix = new String[size][size];

        for (int row = 0; row < size; row++) {
            matrix[row] = sc.nextLine().split("\\s+");

        }
        return matrix;
    }

}
