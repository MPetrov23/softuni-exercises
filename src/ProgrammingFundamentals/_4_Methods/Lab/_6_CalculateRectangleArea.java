package ProgrammingFundamentals._4_Methods.Lab;

import java.util.Scanner;

public class _6_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width=Double.parseDouble(sc.nextLine());
        double height=Double.parseDouble(sc.nextLine());
        double area=calculateArea(width,height);
        System.out.printf("%.0f",area);
    }
    private static double calculateArea(double width, double height){
        return width*height;
    }
}
