package JavaAdvanced.Advanced.MultidimensionalArrays.Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class _6_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String rotation = sc.nextLine();
        int angle = Integer.parseInt(rotation.split("[()]+")[1]) % 360;

        ArrayList<String> words = new ArrayList<>();
        int maxLength = 0;
        while (true) {
            String line = sc.nextLine();
            if(line.equals("END")){
                break;
            }
            words.add(line);
            if(line.length() > maxLength){
                maxLength = line.length();
            }
        }
        int rows = words.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols ; col++) {
                if (col < words.get(row).length()) {
                    matrix[row][col] = words.get(row).charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }

        rotate(angle,rows,cols,matrix);

    }
    private static void rotate(int angleRotation, int rows, int cols, char[][] matrix) {
        if (angleRotation == 90) {
            for (int col = 0; col < cols ; col++) {
                for (int row = rows - 1; row >= 0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (angleRotation == 180) {
            for (int row = rows - 1; row >= 0 ; row--) {
                for (int col = cols - 1; col >= 0 ; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (angleRotation == 270) {
            for (int col = cols - 1; col >= 0 ; col--) {
                for (int row = 0; row < rows ; row++) {
                    System.out.print(matrix[row][col]);

                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows ; row++) {
                for (int col = 0; col < cols ; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
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
}
