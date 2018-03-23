package day12;


class Triangle{
	
	public Triangle() {
		
	}

	public void isTriangle(int a,int b,int c) {
		if(a +b > c && a-b < c) {
			;
		}
		else {
			throw new IllegalArgumentException("三角形边长不能组成三角形");
		}
	}
}

public class Work3 {
	
	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		try {
			triangle.isTriangle(10, 20, 40);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
