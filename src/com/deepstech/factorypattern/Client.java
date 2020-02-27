package com.deepstech.factorypattern;

public class Client {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape = shapeFactory.getShape("rectangle");
		shape.draw();
	}
}
