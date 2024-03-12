package JavaAdvanced.Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _2_PositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] param = inputArray(sc);
        int rows= param[0];
        int cols= param[1];
        int[][] matrix = new int[rows][cols];
        for(int row=0; row<rows; row++){
            matrix[row] = inputArray(sc);
        }
        int searchNumber = Integer.parseInt(sc.nextLine());
        boolean isFound = false;

        for(int row = 0; row< rows; row++){
            for(int col = 0; col<cols; col++){
                if(matrix[row][col]==searchNumber){
                    System.out.println(row+" "+col);
                    isFound=true;
                }
            }
        }

        if(!isFound){
            System.out.println("not found");
        }
    }
    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
