package day11_2zonghe1;

public class Work2 {

	public static void outputFibonacci() {
		int n1 = 1;
		int n2 = 1;
		int n3  = 0;
		
		System.out.print(n1+",");
		System.out.print(n2+",");
		for(int i=3; i<=20; i++) {
			n3 = n1 + n2;
			System.out.print(n3+",");
			n1 = n2;
			n2 = n3;
			
		}
	}
	public static void main(String[] args) {
		outputFibonacci();

	}

}
