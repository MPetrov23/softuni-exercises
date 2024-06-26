package JavaAdvanced.OOP.SOLID._2_Open_Colosed._2_DrawingShape;


import JavaAdvanced.OOP.SOLID._2_Open_Colosed._2_DrawingShape.interfaces.DrawingManager;
import JavaAdvanced.OOP.SOLID._2_Open_Colosed._2_DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {


    @Override
    public void draw(Shape shape) {
        if (shape instanceof Circle)
        {
            this.drawCircle((Circle)shape);
        }
            else if (shape instanceof Rectangle)
        {
            this.drawRectangle(((Rectangle)shape));
        }
    }
    public void drawCircle(Circle circle)
    {
        // Draw Circle
    }

    public void drawRectangle(Rectangle rectangle)
    {
        // Draw Rectangle
    }
}
