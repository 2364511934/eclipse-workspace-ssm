package day6;

class Constrotor2{
	public Constrotor2(String str) {
		System.out.println("Constrotor2" +str);
	}
}


class Constrotor1{
	private static int c = 3;
	private int a =10;
	private String b=new String("eeeee");
	private Constrotor2 c2 = new Constrotor2("non static ");
	
	private  static Constrotor2 c3 = new Constrotor2("static");
	
	private static void printDemo() {
		System.out.println("ffffffffff");
		c = 4;
	}
	
	public Constrotor1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	
	
}

public class ConstrotorDemo1 {

	public static void main(String[] args) {
		Constrotor1 constrotor1 = new Constrotor1();

	}

}
