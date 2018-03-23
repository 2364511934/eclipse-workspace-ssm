package day18_zonghe.collection;

class Circle{
	private static Double PI = 3.1415926;
	private double Radius;
	public Circle(double radius) {
		Radius = radius;
	}
	public Circle() {
	}
	
	//计算圆的面积
	double getArea() {
		return PI*Radius*Radius;
	}
	
	//计算圆的周长
	double getPerimeter() {
		return PI*Radius*2;
	}
	//将圆的半径、周长、面积输出到屏幕
	void show() {
		System.out.println(
				"半径:" + Radius 
				+ "\t周长:" + PI*Radius*2 
				+ "\t面积:" + PI*Radius*Radius);
	}

	
	
}
public class Work2 {

	public static void main(String[] args) {
		Circle circle = new Circle(3.7);
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		circle.show();
	}

}
