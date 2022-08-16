package com.test.sample;

import com.test.sample.Factory.ShapeFactory;
import com.test.sample.Factory.ShapesEnum;
import com.test.sample.bridge.BluePainter;
import com.test.sample.bridge.IShapePainterBridge;
import com.test.sample.bridge.RedPainter;
import com.test.sample.composite.ShapeBoxComposite;
import com.test.sample.models.Rectangle;
import com.test.sample.models.Square;
import com.test.sample.utils.GetShapeListUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ShapeBoxComposite squareComposite = GetShapeListUtils.getSquareList();

    	ShapeBoxComposite rectangleComposite = GetShapeListUtils.getRectangleList();

    	ShapeBoxComposite allShapes = new ShapeBoxComposite();
    	allShapes.addShapes(squareComposite);
    	allShapes.addShapes(rectangleComposite);
    	allShapes.draw();
    	
    }
}
