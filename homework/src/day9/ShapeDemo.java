package day9;

interface Shape{
	double area();
}
class Triangle implements Shape{
	private double height;
	private double length;
	public Triangle(double height, double length) {
		this.height = height;
		this.length = length;
	}
	@Override
	public double area() {
		
		return height * length/2;
	}
	
}

class Circle implements Shape{
	public final static double PI = 3.1415926;
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		
		return PI * radius* radius ;
	}
}

public class ShapeDemo {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		Circle circle = new Circle(32);
		
		System.out.println(triangle.area());
		System.out.println(circle.area());
	}

}
