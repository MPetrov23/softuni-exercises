package JavaAdvanced.MultidimensionalArrays.Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _7_Crossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] param = inputArray(sc);
        int rows = param[0];
        int cols = param[1];

        List<List<Integer>> matrix = new ArrayList<>();
        fillListMatrix(rows, cols, matrix);

        String command = sc.nextLine();
        while(!"Nuke it from orbit".equals(command)){
            String[] coordinates = command.split("\\s+");
            int row = Integer.parseInt(coordinates[0]);
            int col = Integer.parseInt(coordinates[1]);
            int radius = Integer.parseInt(coordinates[2]);

            for(int currRow=row-radius; currRow<=row+radius; currRow++){
                if(isValidIndex(currRow,col,matrix)){
                    matrix.get(currRow).remove(col);
                }
            }

            for(int currCol=col+radius; currCol>- col-radius; currCol--){
                if(isValidIndex(row,currCol,matrix)){
                    matrix.get(row).remove(currCol);
                }
            }

            matrix.removeIf(List::isEmpty);
            command=sc.nextLine();
        }

        printListMatrix(matrix);
    }

    public static int[] inputArray(Scanner sc){
        return Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
    public static void fillListMatrix(int rows, int cols, List<List<Integer>> matrix){
     int fillNumber = 1;

     for(int row=0; row<rows; row++){
         matrix.add(new ArrayList<>());
         for (int col=0; col<cols; col++){
             matrix.get(row).add(fillNumber++);
         }
     }
    }
    public static void printListMatrix(List<List<Integer>> matrix) {
       for (List<Integer> row : matrix){
           for(int element : row){
               System.out.print(element + " ");
           }
           System.out.println();
       }
    }
    private static boolean isValidIndex(int row, int col, List<List<Integer>> matrix) {
        return row >= 0
                && row < matrix.size()
                && col >= 0
                && col < matrix.get(row).size();
    }
}
