package SoftUniada;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int startRow = Integer.parseInt(sc.nextLine());
        int startCol = Integer.parseInt(sc.nextLine());
        int targetRow = Integer.parseInt(sc.nextLine());
        int targetCol = Integer.parseInt(sc.nextLine());

        int minimum = findMinMoves(n,startRow,startCol,targetRow,targetCol);
        System.out.println(minimum);
    }

    public static int findMinMoves(int n, int startRow, int startCol, int targetRow, int targetCol) {
        boolean[][] visited = new boolean[n][n];

        int[] dRow = {-2,-1, 1, 2, 2,  1, -1, -2};
        int[] dCol = {1,  2, 2, 1,-1, -2, -2, -1};

        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startRow, startCol});
        visited[startRow][startCol] = true;

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                if (row == targetRow && col == targetCol) {
                    return moves;
                }

                for (int j = 0; j < 8; j++) {
                    int newRow = row + dRow[j];
                    int newCol = col + dCol[j];

                    if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && !visited[newRow][newCol]) {
                        visited[newRow][newCol] = true;
                        queue.add(new int[]{newRow, newCol});
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}
