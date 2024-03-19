package JavaAdvanced.OOP.Polymorphism.Lab._2_Shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        super.setPerimeter(2*(width+height));
        return super.getPerimeter();
    }

    @Override
    double calculateArea() {
        super.setArea(width*height);
        return super.getArea();
    }
}
