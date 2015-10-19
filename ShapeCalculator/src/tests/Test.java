package src.tests;

import src.shapes.Circle;

public class Test {

	public static void main(String[] args) {
		Circle c = new Circle(45.3);
		
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}

}
