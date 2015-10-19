package src.shapes;

public class Trapez {
	private double base, top, height;
	
	public Trapez(double base, double top, double height){
		this.base = base;
		this.top = top;
		this.height = height;
	}
	
	public double getArea(){
		return 1/2 * height*(top + base);
	}
	
	public double getPerimeter(){
		double triangleA = ((top - base)/2);
		double triangleB = height;
		
		double sideLength = Math.sqrt(Math.pow(triangleA, 2) + Math.pow(triangleB, 2));  
		return sideLength * 2;
	}
}
