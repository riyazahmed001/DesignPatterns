package com.test.sample.utils;

import com.test.sample.Factory.ShapeFactory;
import com.test.sample.Factory.ShapesEnum;
import com.test.sample.bridge.BluePainter;
import com.test.sample.bridge.IShapePainterBridge;
import com.test.sample.bridge.RedPainter;
import com.test.sample.composite.ShapeBoxComposite;
import com.test.sample.models.Rectangle;
import com.test.sample.models.Square;

public class GetShapeListUtils {

	public GetShapeListUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static ShapeBoxComposite getRectangleList() {
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
    	
    	return rectangleComposite;
	}

	public static ShapeBoxComposite getSquareList() {
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
    	
    	return squareComposite;
	}
}
