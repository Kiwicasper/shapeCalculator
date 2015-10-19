package src.shapes;

public class Sphere {
	public double radius;

	public Sphere(double radius){
		this.radius = radius;
	}
	public double SurfaceArea(){
		return 4*Math.PI*Math.pow(radius, 2);
	}
	public double Volume(){
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}
}
