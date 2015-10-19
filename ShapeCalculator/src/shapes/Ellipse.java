package src.shapes;

public class Ellipse {

private double width;
private double height; 

public Ellipse(double width, double height)	{
	this.width = width;
	this.height = height; 
}
public double getPerimeter(){
	 double perimeter = 2*Math.PI*Math.sqrt(0.5*(Math.pow(width, 2)+Math.pow(height, 2)));
	return perimeter;
}
public double getArea() {
double area = Math.PI*width*height;
return area;	
}
}
