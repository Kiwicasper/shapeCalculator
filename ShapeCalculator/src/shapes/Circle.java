package src.shapes;

public class Circle {
	
	double radius = 0;
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getArea(){
		double area = Math.pow(radius, 2)*Math.PI;
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}

}
