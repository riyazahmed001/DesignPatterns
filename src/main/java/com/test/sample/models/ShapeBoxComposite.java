package com.test.sample.models;

import java.util.ArrayList;
import java.util.List;

public class ShapeBoxComposite implements IDrawShapes {
	
	private List<IDrawShapes> shapeList = new ArrayList<IDrawShapes>();
	
	public ShapeBoxComposite() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		
		for(IDrawShapes shape:shapeList)
        {
			shape.draw();
        }
		
	}
	
	public void addShapes(IDrawShapes shape) {
		shapeList.add(shape);
	}

}
