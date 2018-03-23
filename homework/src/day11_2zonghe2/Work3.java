package day11_2zonghe2;

class Rect{
	protected int width, height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	

	public Rect() {
		width = height = 10;
	}



	public int area() {
		return width*height;
	}
	
	public int  perimeter() {
		return 2*(width+height);
	}
}
public class Work3 {

	public static void main(String[] args) {
		Rect rect1 = new Rect(20, 30);
		System.out.println("面积:"+rect1.area()+ "\t周长"+rect1.perimeter());
		Rect rect2 = new Rect();
		System.out.println("面积:"+rect2.area()+ "\t周长"+rect2.perimeter());
		

	}

}
