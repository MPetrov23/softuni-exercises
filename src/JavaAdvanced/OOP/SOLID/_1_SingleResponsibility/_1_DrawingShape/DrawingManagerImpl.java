package JavaAdvanced.OOP.SOLID._1_SingleResponsibility._1_DrawingShape;


import JavaAdvanced.OOP.SOLID._1_SingleResponsibility._1_DrawingShape.interfaces.DrawingManager;
import JavaAdvanced.OOP.SOLID._1_SingleResponsibility._1_DrawingShape.interfaces.DrawingRepository;
import JavaAdvanced.OOP.SOLID._1_SingleResponsibility._1_DrawingShape.interfaces.Rengerer;
import JavaAdvanced.OOP.SOLID._1_SingleResponsibility._1_DrawingShape.interfaces.Shape;

public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Rengerer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Rengerer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
        shape.draw(this.renderer, this.drawingRepository);
    }
}
