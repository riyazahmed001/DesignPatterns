package com.test.sample.ShapeAdapter;

import com.test.sample.Factory.ShapeFactory;
import com.test.sample.Factory.ShapesEnum;
import com.test.sample.models.Rectangle;
import com.test.sample.models.Square;

public class SqareToRectangleAdapter {

	public SqareToRectangleAdapter() {
		// TODO Auto-generated constructor stub
	}
	
	public static Rectangle createRectangleFromSquare(Square square) {
		Rectangle rectangle = (Rectangle) ShapeFactory.getShape(ShapesEnum.RECTANGLE);
		rectangle.setBreadth(square.getSide());
		rectangle.setLength(square.getSide());
		return rectangle;
	}

}
