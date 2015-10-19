package src;
import java.util.logging.Logger;

import src.shapes.Circle;

public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(13.4); //Radius
		log(c.getArea()); 
		log(c.getPerimeter());
		
		Trapez t = new Trapez(234.4,456.5, 32.4);//Base, top, height
		log(t.getArea());
		log(t.getPerimeter());
		
		Ellipse e = new ellipse(23.4,56.4);
		log(e.getArea); //Major axis, minor axis
		log(e.getPerimeter); //Width, height
		
		Prism p = new Prism(123.4,new Trapez(123.5,235.1));//Height and base/top
		log(p.get.SurfaceArea());
		log(p.getVolume());
		
		Sphere s = new Sphere(12.6); //Radius
		log(s.getSurfaceArea());
		log(s.getVolume());

	}
	private static void log(double i){
		System.out.println(i);
	}

}
