package com.test.sample.decorator;

import com.test.sample.models.IDrawShapes;

public class StarDecorator implements IDrawShapes {
	
	private IDrawShapes shape;
	
	public void setShape(IDrawShapes shape) {
		this.shape = shape;
	}

	public StarDecorator() {
		// TODO Auto-generated constructor stub
	}
	
	public StarDecorator(IDrawShapes shape) {
		this.shape = shape;
	}

	@Override
	public void draw() {
		shape.draw();
		System.out.println("@@@@@");
		System.out.println("Decorated with Stars");
		System.out.println("@@@@@");
	}

}
