package JavaAdvanced.MultidimensionalArrays.Ex;

import java.util.Scanner;

public class _8_TheHeiganDance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] matrix = new String[15][15];
        matrix[7][7] = "Player";

        fight(matrix, sc);
    }

    public static void fight(String[][] matrix, Scanner sc){
        double heiganHP = 3000000;
        double damageToHeigan = Double.parseDouble(sc.nextLine());

        int playerHP = 18500;
        boolean isHitByColud = false;
        String deathReason = "";


        while (heiganHP > 0) {

            heiganHP -= damageToHeigan;
            if (isHitByColud) {
                playerHP -= 3500;
                isHitByColud = false;
            }
            if (playerHP <= 0) {
                deathReason = "Plague Cloud";
                break;
            }
            if (heiganHP <= 0) {
                break;
            }

            String[] commandParts = sc.nextLine().split("\\s+");
            String spell = commandParts[0];
            int attackX = Integer.parseInt(commandParts[1]);
            int attackY = Integer.parseInt(commandParts[2]);

            boolean isAttacked = isAttacked(matrix,attackX,attackY);

            if (isAttacked) {
                if (spell.equals("Cloud")) {
                    playerHP -= 3500;
                    isHitByColud = true;
                    if (playerHP <= 0) {
                        deathReason = "Plague Cloud";
                        break;
                    }
                } else if (spell.equals("Eruption")) {
                    playerHP -= 6000;
                    if (playerHP <= 0) {
                        deathReason = "Eruption";
                        break;
                    }
                }
            }
        }
        printResults(playerHP, heiganHP, deathReason, matrix);
    }

    public static boolean isAttacked(String[][] matrix, int xMatrix, int yMatrix) {
        int playerX = 0;
        int playerY = 0;
        int playerNewX;
        int playerNewY;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ("Player".equals(matrix[row][col])) {
                    playerX = row;
                    playerY = col;
                }
            }
        }
        if (playerX == xMatrix && playerY == yMatrix) {
            return true;
        } else if (isAttackInMatrix(playerX, playerY , xMatrix, yMatrix)){
            if (playerX - 1 < xMatrix - 1 && playerX - 1 < xMatrix + 1 && playerX - 1 < xMatrix && playerX - 1 >= 0) {
                playerNewX = playerX - 1;
                playerNewY = playerY;
            } else if (playerY + 1 > yMatrix + 1 && playerY + 1 > yMatrix - 1 && playerY + 1 > yMatrix && playerY + 1 <= 14) {
                playerNewX = playerX;
                playerNewY = playerY + 1;
            } else if (playerX + 1 > xMatrix + 1 && playerX + 1 > xMatrix - 1 && playerX + 1 > xMatrix && playerX + 1 <= 14) {
                playerNewX = playerX + 1;
                playerNewY = playerY;
            } else if (playerY - 1 < yMatrix - 1 && playerY - 1 < yMatrix + 1 && playerY - 1 < yMatrix && playerY - 1 >= 0) {
                playerNewX = playerX;
                playerNewY = playerY - 1;
            } else {
                return true;
            }
            matrix[playerX][playerY] = null;
            matrix[playerNewX][playerNewY] = "Player";
        }
        return false;
    }

    public static boolean isAttackInMatrix(int x, int y, int xMatrix, int yMatrix) {
        boolean isX = x == xMatrix || x == xMatrix - 1 || x == xMatrix + 1;
        boolean isY = y == yMatrix || y == yMatrix - 1 || y == yMatrix + 1;

        return isX && isY;
    }
    public static void printResults(int playerHitPoints, double heiganHitPoints, String killedBy, String[][] matrix) {
        int playerX = 0;
        int playerY = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ("Player".equals(matrix[row][col])) {
                    playerX = row;
                    playerY = col;
                }
            }
        }

        if (heiganHitPoints <= 0) {
            System.out.printf("Heigan: Defeated!%n");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganHitPoints);
        }
        if (playerHitPoints <= 0) {
            System.out.printf("Player: Killed by %s%n", killedBy);
        } else {
            System.out.printf("Player: %d%n", playerHitPoints);
        }
        System.out.printf("Final position: %d, %d%n", playerX, playerY);
    }
}
