package JavaAdvanced.OOP.WorkingWithAbstraction.Lab._2_PointInRectangle;

public class Rectangle {
    private Point bottomLeftPoint;
    private Point topRightPoint;

    public Rectangle(Point bottomLeft, Point topRight){
        this.bottomLeftPoint=bottomLeft;
        this.topRightPoint=topRight;

    }

    public Point getBottomLeftPoint() {
        return bottomLeftPoint;
    }

    public Point getTopRightPoint() {
        return topRightPoint;
    }

    public boolean contains(Point point){
        boolean isXinRect = this.getBottomLeftPoint().getX()<= point.getX() &&
                this.getTopRightPoint().getX() >= point.getX();

        boolean isYinRect = this.getBottomLeftPoint().getY() <= point.getY() &&
                this.getTopRightPoint().getY() >= point.getY();

        return isXinRect && isYinRect;
    }
}
