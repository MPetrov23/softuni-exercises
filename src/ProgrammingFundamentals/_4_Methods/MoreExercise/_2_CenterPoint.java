package ProgrammingFundamentals._4_Methods.MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _2_CenterPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] points = new int[4];
        for(int i=0; i<points.length; i++){
            points[i]=Integer.parseInt(sc.nextLine());
        }
        int[] closest=closestPoint(points);
        System.out.printf("("+closest[0]+", "+closest[1]+")");

    }
    private static int[] closestPoint(int[] array){
        int[] closestPoint =new int[2];
        if(array[0]+array[1]<array[2]+array[3]){
            closestPoint[0]=array[0];
            closestPoint[1]=array[1];
        }else{
            closestPoint[0]=array[2];
            closestPoint[1]=array[3];
        }
        return closestPoint;
    }
}
