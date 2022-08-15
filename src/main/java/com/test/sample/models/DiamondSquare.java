package com.test.sample.models;

import com.test.sample.ShapeDrawer;
import com.test.sample.ShapeAdapter.SqareToRectangleAdapter;

public class DiamondSquare extends Square {

	public DiamondSquare() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return "Diamond Sqare";
	}
	
	@Override
	public void draw() {
		System.out.println("*****");
		System.out.println("Diamond Square is converted to Rectangle");
		ShapeDrawer.drawRectangle(SqareToRectangleAdapter.createRectangleFromSquare(this));
		super.paint();
		System.out.println("*****");
	}
}
