package JavaAdvanced.MultidimensionalArrays.Ex;

import java.util.Scanner;

public class _9_ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] parking = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(parking[0]);
        int cols = Integer.parseInt(parking[1]);
        String[][] parkingMatrix = new String[rows][cols];

        movement(parkingMatrix,sc);
    }

    public static void movement(String[][] matrix,Scanner sc){
        String command=sc.nextLine();
        while(!"stop".equals(command)) {
            String[] path = command.split("\\s+");
            int entryRow = Integer.parseInt(path[0]);
            int parkRow = Integer.parseInt(path[1]);
            int parkCol = Integer.parseInt(path[2]);
            int distance = 1;

            if (areFreeSpots(matrix, parkRow)) {

                if (!"Taken".equals(matrix[parkRow][parkCol])) {
                    distance += Math.abs(entryRow - parkRow) + parkCol;
                    matrix[parkRow][parkCol] = "Taken";
                    System.out.println(distance);
                } else {
                    int closestFreeSpot = findFreeSpot(matrix,parkRow,parkCol);
                    matrix[parkRow][closestFreeSpot] = "Taken";
                    distance += Math.abs(entryRow - parkRow) + closestFreeSpot;
                    System.out.println(distance);
                }

            }else{
                System.out.printf("Row %d full\n",parkRow);
            }
            command=sc.nextLine();
        }
    }

    public static boolean areFreeSpots(String[][] matrix, int row){
        for(int i=1; i<matrix[row].length; i++){
            if(!"Taken".equals(matrix[row][i])){
                return true;
            }
        }
        return false;
    }

    public static int findFreeSpot(String[][] matrix,int parkRow, int parkCol){
        int newCol=0;
        int prevSpot = parkCol - 1;
        int nextSpot = parkCol + 1;

        while (prevSpot > 0 || nextSpot < matrix[parkRow].length) {
            if (prevSpot > 0) {
                if (!"Taken".equals(matrix[parkRow][prevSpot])) {
                    newCol = prevSpot;
                    break;
                }
                prevSpot--;
            }
            if (nextSpot < matrix[parkRow].length) {
                if (!"Taken".equals(matrix[parkRow][nextSpot])) {
                   newCol = nextSpot;
                    break;
                }
                nextSpot++;
            }
        }
        return newCol;
    }
}
