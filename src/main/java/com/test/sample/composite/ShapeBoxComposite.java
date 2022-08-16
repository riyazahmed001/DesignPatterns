package com.test.sample.composite;

import java.util.ArrayList;
import java.util.List;

import com.test.sample.models.IDrawShapes;

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
