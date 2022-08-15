package com.test.sample;

import com.test.sample.models.Rectangle;

public class ShapeDrawer {

	public ShapeDrawer() {
		// TODO Auto-generated constructor stub
	}
	
	public static void drawRectangle(Rectangle rectangle) {
		System.out.println("Rectangle is drawn");
		System.out.println("The length is " + rectangle.getLength());
		System.out.println("The breadth is " + rectangle.getBreadth());
	}
}
