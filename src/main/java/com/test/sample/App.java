package com.test.sample;

import com.test.sample.composite.ShapeBoxComposite;
import com.test.sample.models.IDrawShapes;
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
    	
    	IDrawShapes starDecoratedSquare = GetShapeListUtils.getStarDecoratedSquare();
    	
    	ShapeBoxComposite allShapes = new ShapeBoxComposite();

    	allShapes.addShapes(squareComposite);
    	allShapes.addShapes(rectangleComposite);
    	allShapes.addShapes(starDecoratedSquare);
    	
    	allShapes.draw();
    	
    }
}
