package JavaAdvanced.OOP.Polymorphism.Lab._2_Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 5);
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());

        Shape circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
