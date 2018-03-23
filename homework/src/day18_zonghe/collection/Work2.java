package day18_zonghe.collection;

class Circle{
	private static Double PI = 3.1415926;
	private double Radius;
	public Circle(double radius) {
		Radius = radius;
	}
	public Circle() {
	}
	
	//����Բ�����
	double getArea() {
		return PI*Radius*Radius;
	}
	
	//����Բ���ܳ�
	double getPerimeter() {
		return PI*Radius*2;
	}
	//��Բ�İ뾶���ܳ�������������Ļ
	void show() {
		System.out.println(
				"�뾶:" + Radius 
				+ "\t�ܳ�:" + PI*Radius*2 
				+ "\t���:" + PI*Radius*Radius);
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
