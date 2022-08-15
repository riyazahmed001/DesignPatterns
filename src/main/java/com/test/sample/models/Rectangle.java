package com.test.sample.models;

import com.test.sample.ShapeDrawer;

public class Rectangle implements IShape, IDrawShapes {
	
	private int length;
	private int breadth;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("*****");
		ShapeDrawer.drawRectangle(this);
		System.out.println("*****");
	}


}
