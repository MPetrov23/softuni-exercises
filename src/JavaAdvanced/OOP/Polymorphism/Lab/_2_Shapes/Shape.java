package JavaAdvanced.OOP.Polymorphism.Lab._2_Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    abstract double calculatePerimeter();
     abstract double calculateArea();


}
