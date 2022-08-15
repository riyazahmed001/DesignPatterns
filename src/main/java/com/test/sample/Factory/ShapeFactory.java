package com.test.sample.Factory;

import com.test.sample.models.DiamondSquare;
import com.test.sample.models.GoldSquare;
import com.test.sample.models.IShape;
import com.test.sample.models.Rectangle;
import com.test.sample.models.Square;

public class ShapeFactory {

	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public static IShape getShape(ShapesEnum shapeType) {
		switch(shapeType) {
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		case GOLDSQUARE:
			return new GoldSquare();
		case DIAMONDSQUARE:
			return new DiamondSquare();
		default:
			throw new Error("Unsupported Type");
		}
	}
}
