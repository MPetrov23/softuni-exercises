package JavaAdvanced.OOP.Polymorphism.Lab._2_Shapes;

import JavaAdvanced.Advanced.IteratorsAndComparators._5_ComparingObjects.Main;

public class Circle extends  Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public final double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        super.setPerimeter(2*Math.PI*radius);
        return super.getPerimeter();
    }

    @Override
    double calculateArea() {
        super.setArea(Math.PI*Math.pow(radius,2));
        return super.getArea();
    }
}
