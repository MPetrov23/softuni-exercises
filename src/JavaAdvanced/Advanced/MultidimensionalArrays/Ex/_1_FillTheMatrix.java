package JavaAdvanced.Advanced.MultidimensionalArrays.Ex;

import java.util.Scanner;

public class _1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] param = sc.nextLine().split(", ");
        int size = Integer.parseInt(param[0]);
        String pattern = param[1];

        if(("A").equals(pattern)){
            fillPatternA(size);

        } else if ("B".equals(pattern)) {
            fillPatternB(size);
        }
    }

    public static void fillPatternA(int size){
        int matrix[][] = new int[size][size];

        int num=1;

        for(int col=0;col<size; col++){
            for(int row = 0;row< size; row++){
                matrix[row][col]=num++;
            }
        }

        printMatrix(matrix);
    }
    public static void fillPatternB(int size){
        int matrix[][] = new int[size][size];

        int num=1;

        for(int col=0;col<size; col++){
            if(col%2==0){
                for(int row = 0;row< size; row++){
                    matrix[row][col]=num++;
                }
            }else{
                for(int row = size-1;row>= 0; row--){
                    matrix[row][col]=num++;
                }
            }
        }

        printMatrix(matrix);
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
