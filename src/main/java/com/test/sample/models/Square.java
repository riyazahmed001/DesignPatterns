package com.test.sample.models;

import com.test.sample.ShapeAdapter.SqareToRectangleAdapter;
import com.test.sample.bridge.IShapePainterBridge;
import com.test.sample.utils.ShapeDrawer;

public class Square implements IShape, IDrawShapes {
	
	private int side;
	private IShapePainterBridge painter;

	public void setPainter(IShapePainterBridge painter) {
		this.painter = painter;
	}

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Sqare";
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("*****");
		System.out.println("Square is converted to Rectangle");
		ShapeDrawer.drawRectangle(SqareToRectangleAdapter.createRectangleFromSquare(this));
		paint();
		System.out.println("*****");
	}
	
	public void paint() {
		painter.paint();
	}
}
