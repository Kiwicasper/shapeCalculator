package src.tests;

import src.shapes.*;

public class Test {

	public static void main(String[] args) {
		Circle c = new Circle(45.3);
		Ellipse e = new Ellipse(10, 20);
		Trapez t = new Trapez(12,13,14.3);
		
		// Cirkel
		System.out.println("Cirkel Areal" + c.getArea());
		System.out.println("Cirkel Perimeter " + c.getPerimeter());
		// Ellipse
		System.out.println("Ellipse Areal "+ e.getArea());
		System.out.println("Ellipse Perimeter" + e.getPerimeter());
		// Trapez
		System.out.println("Trapez Areal " + t.getArea());
		System.out.println("Trapez Perimeter " + t.getPerimeter());
		// 
		
		
	}

}
