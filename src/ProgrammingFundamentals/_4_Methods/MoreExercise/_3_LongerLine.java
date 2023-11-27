package ProgrammingFundamentals._4_Methods.MoreExercise;

import java.util.Scanner;

public class _3_LongerLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] points = new int[8];
        for(int i=0; i<points.length; i++){
            points[i]=Integer.parseInt(sc.nextLine());
        }
        double lineOne=calculateDistance(points[0], points[1],points[2],points[3]);
        double lineTwo=calculateDistance(points[4], points[5],points[6],points[7]);

        if (lineOne >= lineTwo) {
            printLine(points[0], points[1],points[2],points[3]);
        } else {
            printLine(points[4], points[5],points[6],points[7]);
        }
    }

    private static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    private static void printLine(int x1, int y1, int x2, int y2) {
        if(calculateDistance(x1,y1)<calculateDistance(x2,y2)) {
            System.out.printf("(%d, %d)(%d, %d)%n", x1, y1, x2, y2);
        }else{
            System.out.printf("(%d, %d)(%d, %d)%n", x2, y2, x1, y1);

        }
    }
    private static double calculateDistance(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
}
}
