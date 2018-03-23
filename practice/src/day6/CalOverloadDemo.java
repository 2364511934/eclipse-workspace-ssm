package day6;
/**
 * 
 * @author Administrator
 *
 */
public class CalOverloadDemo {
	public static void main(String[] args) {
		CalOverload calOverload = new CalOverload();
		//calOverload.CalOverload();
		System.out.println(calOverload.add(1, 2));
		System.out.println(calOverload.add(1, 2, 3));
		System.out.println(calOverload.add(1, 2, 3, 4));
		System.out.println(calOverload.add(1, new int[] {2, 3, 4, 5}));
		System.out.println(calOverload.add(1.0, 2.0));
		System.out.println(calOverload.add(1.0, 2.0, 3.0));
		System.out.println(calOverload.add(1.0, 2.0, 3.0, 4.0));
	}
}
