package JavaAdvanced.MultidimensionalArrays.Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _7_Crossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = fillMatrix(sc);
        int[][] resultMatrix = destroyCells(matrix,sc);
        printMatrix(resultMatrix);
    }

    private static int[][] fillMatrix(Scanner sc) {
        String[] dimension = sc.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimension[0]);
        int cols = Integer.parseInt(dimension[1]);

        int[][] matrix = new int[rows][cols];
        int num = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = num;
                num++;
            }
        }
        return matrix;
    }

    private static int[][] destroyCells(int[][] matrix, Scanner sc) {
        int matrixSize = matrix.length;
        String command = sc.nextLine();
        int[][] newMatrix = new int[matrixSize][];
        while (!("Nuke it from orbit".equals(command))) {
            int[] size = Arrays.stream(command.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int row = size[0];
            int col = size[1];
            int radius = size[2];
            int rowUp = row - radius;
            int rowDown = row + radius;
            int colLeft = col - radius;
            int colRight = col + radius;
            int rowCounter = -1;
            for (int rows = 0; rows < matrix.length; rows++) {
                List<Integer> newMatrixRow = new ArrayList<>();
                if (rows == row) {
                    for (int cols = 0; cols < matrix[rows].length; cols++) {
                        if (cols < colLeft || cols > colRight) {
                            newMatrixRow.add(matrix[rows][cols]);
                        }
                    }
                } else {
                    if (rows >= rowUp && rows <= rowDown) {
                        for (int cols = 0; cols < matrix[rows].length; cols++) {
                            if (cols != col) {
                                newMatrixRow.add(matrix[rows][cols]);
                            }
                        }
                    } else {
                        for (int i = 0; i < matrix[rows].length; i++) {
                            newMatrixRow.add(matrix[rows][i]);
                        }
                    }
                }
                if (newMatrixRow.size() > 0) {
                    rowCounter++;
                    int[] array = new int[newMatrixRow.size()];
                    for (int i = 0; i < newMatrixRow.size(); i++) {
                        array[i] = newMatrixRow.get(i);
                    }
                    newMatrix[rowCounter] = array;
                }
            }
            if (matrixSize - 1 > rowCounter) {
                int[][] changeMatrix = new int[rowCounter + 1][];
                int counter = 0;
                for (int i = 0; i < changeMatrix.length; i++) {
                    int[] array = new int[newMatrix[i].length];
                    for (int cols = 0; cols < newMatrix[i].length; cols++) {
                        array[cols] = newMatrix[i][cols];
                    }
                    changeMatrix[counter] = array;
                    counter++;
                }
                matrix = changeMatrix;
            } else {
                matrix = newMatrix;
            }
            command = sc.nextLine();
        }
        return matrix;
        }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            StringBuilder result = new StringBuilder();
            for (int anInt : ints) {
                result.append(anInt).append(" ");
            }
            System.out.println(result);
        }
    }
}

