package com.deepstech.factorypattern;

public class ShapeFactory {

	public Shape getShape(String shape) {

		if (shape.equalsIgnoreCase("circle")) {

			return new Circle();
		}
		if (shape.equalsIgnoreCase("rectangle")) {

			return new Rectangle();
		}
		if (shape.equalsIgnoreCase("square")) {

			return new Square();
		}
		return null;

	}
}
