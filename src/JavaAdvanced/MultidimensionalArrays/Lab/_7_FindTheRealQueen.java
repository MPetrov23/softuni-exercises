package JavaAdvanced.MultidimensionalArrays.Lab;


import java.util.Scanner;

public class _7_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 8;
        char queen = 'q';
        char[][] matrix = inputCharMatrix(size, sc);

        int[] realQueen = findQueen(matrix,queen);
        System.out.printf("%d %d",realQueen[0],realQueen[1]);
    }

    public static char[][] inputCharMatrix(int size, Scanner sc) {
        char[][] charMatrix = new char[size][size];
        for (int row = 0; row < size; row++) {
            charMatrix[row] = sc.nextLine().replaceAll("\\s+", "").toCharArray();
        }
        return charMatrix;
    }

    public static int[] findQueen(char[][] matrix, char queen) {
        int[] queenCoordinates = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if(matrix[row][col]==queen){
                    int[] coordinates = {row,col};

                    if(checkQuadrantOne(matrix,coordinates,queen) && checkQuadrantTwo(matrix,coordinates,queen) && checkQuadrantThree(matrix,coordinates,queen)
                            && checkQuadrantFour(matrix,coordinates,queen)){
                        queenCoordinates[0]=row;
                        queenCoordinates[1]=col;
                    }
                }
            }
        }
        return queenCoordinates;
    }

    public static boolean checkQuadrantOne(char[][] matrix,int[] coordinates, char queen) {
            int row=coordinates[0];
            int col=coordinates[1];

            for (int i = col+1; i < matrix[row].length; i++) {
                if(matrix[row][i]==queen){
                    return false;
                }
            }

            for (int i = row-1; i>=0; i--) {
                if(matrix[i][col]==queen){
                    return false;
                }
             }

        for (int i = row-1; i>=0; i--) {
            for(int j=col+1; j<matrix[row].length;j++){
                if(i+j==row+col) {
                    if(matrix[i][j]==queen){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkQuadrantTwo(char[][] matrix,int[] coordinates, char queen) {
        int row=coordinates[0];
        int col=coordinates[1];

        for (int i = col-1; i >=0; i--) {
            if(matrix[row][i]==queen){
                return false;
            }
        }

        for (int i = row-1; i>=0; i--) {
            if(matrix[i][col]==queen){
                return false;
            }
        }

        for (int i = row-1; i>=0; i--) {
            for(int j = col-1; j >=0; j--){
                if(i+j==row+col) {
                    if(matrix[i][j]==queen){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkQuadrantThree(char[][] matrix,int[] coordinates, char queen) {
        int row=coordinates[0];
        int col=coordinates[1];

        for (int i = col-1; i >=0; i--) {
            if(matrix[row][i]==queen){
                return false;
            }
        }

        for (int i = row+1; i< matrix.length; i++) {
            if(matrix[i][col]==queen){
                return false;
            }
        }

        for (int i = row+1; i< matrix.length; i++) {
            for(int j = col-1; j >=0; j--){
                if(i+j==row+col) {
                    if(matrix[i][j]==queen){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean checkQuadrantFour(char[][] matrix,int[] coordinates, char queen) {
        int row=coordinates[0];
        int col=coordinates[1];

        for (int i = col+1; i < matrix[row].length; i++) {
            if(matrix[row][i]==queen){
                return false;
            }
        }

        for (int i = row+1; i< matrix.length; i++) {
            if(matrix[i][col]==queen){
                return false;
            }
        }

        for (int i = row+1; i< matrix.length; i++) {
            for(int j = col+1; j < matrix[row].length; j++){
                if(i+j==row+col) {
                    if(matrix[i][j]==queen){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
