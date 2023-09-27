package ProgrammingBasics._2_Conditional.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();


        double area=0;
       if(choice.equals("square")) {
           double side = Double.parseDouble(scanner.nextLine());
           area = side * side;

       } else if (choice.equals("rectangle")) {
           double a = Double.parseDouble(scanner.nextLine());
           double b = Double.parseDouble(scanner.nextLine());
           area = a * b;
       } else if (choice.equals("circle")) {
           double radius = Double.parseDouble(scanner.nextLine());
           area = radius*radius*Math.PI;
       } else if (choice.equals("triangle")) {
           double sideTriangle = Double.parseDouble(scanner.nextLine());
           double height = Double.parseDouble(scanner.nextLine());
           area= (sideTriangle*height)/2;
       }
        System.out.println(area);

    }

}

