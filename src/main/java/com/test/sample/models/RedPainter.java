package com.test.sample.models;

public class RedPainter implements IShapePainterBridge {

	public RedPainter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint() {
		System.out.println("Painted Red");
	}

}
