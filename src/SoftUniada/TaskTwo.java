package SoftUniada;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        draw(n);
    }

    public static void draw(int n) {
        int width = 5 * n;

        int row =0;

        // 1
        for (int i =0 ; i < n / 2; i++) {
            String dots = ".".repeat(n+i);
            String hashtags = "#".repeat(n*3-i*2);
            System.out.println(dots + hashtags + dots);
            row=i;
        }

        // 2
        int rowsTwo = n/2+1+row+1;
        for (int i = row+1; i < rowsTwo; i++) {
            String dots = ".".repeat(n+i);
            String hashtags = "#";
            String dotsMiddle = ".".repeat(n*3-2-2*i);
            System.out.println(dots + hashtags + dotsMiddle + hashtags + dots);
            row=i;
        }

        //3
        System.out.println(".".repeat(n*2) + "#".repeat(n) + ".".repeat(n*2));
        row++;

        //4
        int rowsFour = n/2+row+1;
        for (int i = row+1; i<rowsFour; i++) {
            String dots = ".".repeat(n*2-2);
            String hash = "#".repeat(n+4);
            System.out.println(dots + hash+ dots);
            row=i;
        }

        //5
        System.out.println(".".repeat(width / 2-5) + "D^A^N^C^E^" + ".".repeat(width / 2-5));
        row++;

        // 6
        int rowsSix = n/2+1+row+1;
        for (int i = row +1; i <rowsSix; i++) {
            String dots = ".".repeat(n*2-2);
            String hash = "#".repeat(n+4);
            System.out.println(dots + hash+ dots);
        }
    }

}