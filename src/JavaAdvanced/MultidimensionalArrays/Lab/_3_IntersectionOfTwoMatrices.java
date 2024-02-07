package JavaAdvanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _3_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int rows= Integer.parseInt(sc.nextLine());
        int cols= Integer.parseInt(sc.nextLine());

        char[][] A = new char[rows][cols];
        for(int row=0; row<rows; row++){
            A[row] = sc.nextLine().replaceAll("\\s+","").toCharArray();
        }

        char[][] B = new char[rows][cols];
        for(int row=0; row<rows; row++){
            B[row] = sc.nextLine().replaceAll("\\s+","").toCharArray();
        }

        char[][] C = new char[rows][cols];

        for(int row = 0 ; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(A[row][col]==B[row][col]){
                    C[row][col]=A[row][col];
                }else{
                    C[row][col]='*';
                }
            }
        }

        printMatrix(C);
    }

    public static void printMatrix(char[][] matrix) {
        for(int row = 0; row< matrix.length;row++){
            for(int col=0; col<matrix[row].length; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }
    }
