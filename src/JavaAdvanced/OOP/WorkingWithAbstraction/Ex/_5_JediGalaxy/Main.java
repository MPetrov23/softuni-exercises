package JavaAdvanced.OOP.WorkingWithAbstraction.Ex._5_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static  long sum = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matrix = fillMatrix(sc);


        String command = sc.nextLine();
        while(!"Let the Force be with you".equals(command)){

            int[] jediCoordinates = Arrays.stream(command.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int[] sithCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sithRow = sithCoordinates[0];
            int sithCol = sithCoordinates[1];
            moveSith(sithRow, sithCol, matrix);

            int jediRow = jediCoordinates[0];
            int jediCol = jediCoordinates[1];
            moveJedi(jediRow, jediCol, matrix);
            
            command=sc.nextLine();
        }
        System.out.println(sum);
    }
    private static void moveJedi(int row, int col, int[][] matrix) {
        while (row >= 0 && col < matrix[0].length) {
            if (row < matrix.length && col >= 0) {
                sum += matrix[row][col];
            }
            row--;
            col++;
        }
    }

    private static void moveSith(int row, int col, int[][] matrix) {
        while (row >= 0 && col >= 0) {
            if (row < matrix.length && col < matrix[0].length) {
                matrix[row][col] = 0;
            }
            row--;
            col--;
        }
    }

    private static int[][] fillMatrix(Scanner sc) {
        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = new int[x][y];
        int num = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = num++;
            }
        }

        return matrix;
    }
}
