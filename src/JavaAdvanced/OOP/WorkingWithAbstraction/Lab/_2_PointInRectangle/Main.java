package JavaAdvanced.OOP.WorkingWithAbstraction.Lab._2_PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[] rectCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Point bottomLeft = new Point(rectCoordinates[0], rectCoordinates[1]);
        Point topRight = new Point(rectCoordinates[2], rectCoordinates[3]);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int num = Integer.parseInt(sc.nextLine());

        for (int i=0; i<num;i++) {
            int[] pointCoordinates = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            Point point = new Point(pointCoordinates[0], pointCoordinates[1]);

            if(rectangle.contains(point)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}