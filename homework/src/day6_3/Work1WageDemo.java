package day6_3;

public class Work1WageDemo {

	public static void main(String[] args) {
		Work1Wage wage = new Work1Wage();
		
		System.out.println(wage.CalWage(100));
		System.out.println(wage.CalWage(100, 30));
		System.out.println(wage.CalWage(100, 20, 30));

	}

}
