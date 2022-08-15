package com.test.sample;

import java.util.ArrayList;
import java.util.List;

import com.test.sample.Factory.ShapeFactory;
import com.test.sample.Factory.ShapesEnum;
import com.test.sample.models.BluePainter;
import com.test.sample.models.IShape;
import com.test.sample.models.IShapePainterBridge;
import com.test.sample.models.Rectangle;
import com.test.sample.models.RedPainter;
import com.test.sample.models.ShapeBoxComposite;
import com.test.sample.models.Square;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	IShapePainterBridge bluePainter = new BluePainter();
    	IShapePainterBridge redPainter = new RedPainter();
    	
    	Square square1 = (Square) ShapeFactory.getShape(ShapesEnum.SQUARE);
    	square1.setSide(20);
    	square1.setPainter(redPainter);

    	Square square2 = (Square) ShapeFactory.getShape(ShapesEnum.GOLDSQUARE);
    	square2.setSide(10);
    	square2.setPainter(bluePainter);
    	
    	Square square3 = (Square) ShapeFactory.getShape(ShapesEnum.DIAMONDSQUARE);
    	square3.setSide(30);
    	square3.setPainter(redPainter);
    	
    	ShapeBoxComposite squareComposite = new ShapeBoxComposite();
    	squareComposite.addShapes(square1);
    	squareComposite.addShapes(square2);
    	squareComposite.addShapes(square3);

    	Rectangle rectangle1 = (Rectangle) ShapeFactory.getShape(ShapesEnum.RECTANGLE);
    	rectangle1.setBreadth(10);
    	rectangle1.setLength(10);
    	
    	Rectangle rectangle2 = (Rectangle) ShapeFactory.getShape(ShapesEnum.RECTANGLE);
    	rectangle2.setBreadth(11);
    	rectangle2.setLength(10);
    	
    	Rectangle rectangle3 = (Rectangle) ShapeFactory.getShape(ShapesEnum.RECTANGLE);
    	rectangle3.setBreadth(12);
    	rectangle3.setLength(10);
    	
    	ShapeBoxComposite rectangleComposite = new ShapeBoxComposite();
    	rectangleComposite.addShapes(rectangle1);
    	rectangleComposite.addShapes(rectangle2);
    	rectangleComposite.addShapes(rectangle3);
    	
    	
    	ShapeBoxComposite allShapes = new ShapeBoxComposite();
    	allShapes.addShapes(squareComposite);
    	allShapes.addShapes(rectangleComposite);
    	allShapes.draw();
    }
}
