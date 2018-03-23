package day6;
/**
 * 
 * @author Administrator
 *
 */
public class CalOverload {
	{
		System.out.println("********************");
	}
	{
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	{
		{
			
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
			 add(0, 0);
		}
	}
	
	public CalOverload() {
		System.out.println("public CalOverload()");
	}
	public int add(int a, int b) {
		System.out.println("public int add(int a, int b)");
		return a+b;
	}
	public int add(int a, int b, int c) {
		System.out.println("public int add(int a, int b, int c)");
		return a+b+c;
	}
	
	public int add(int ...a) {
		int sum = 0;
		System.out.println("public int add(int ...a)");
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	public int add(int c, int[] a) {
		int sum = 0;
		System.out.println("public int add(int c, int[] a)");
		for(int i:a)
		{
			sum+=i;
		}
		return sum;
	}
	public double add(double b1, double b2) {
		System.out.println("public double add(double b1, double b2)");
		return b1+b2;
	}
	
	public double add(double b1, double b2, double b3) {
		System.out.println("public double add(double b1, double b2, double b3)");
		return b1+b2+b3;
	}
	
	public double add(double ...b) {
		double sum = 0;
		System.out.println("public double add(double ...b)");
		for(double i:b)
		{
			sum+=i;
		}
		return sum;
	}
}
