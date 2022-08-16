package com.test.sample.bridge;

public class BluePainter implements IShapePainterBridge {

	public BluePainter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint() {
		System.out.println("Painted Blue");
	}

}
