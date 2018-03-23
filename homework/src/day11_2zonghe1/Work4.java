package day11_2zonghe1;

public class Work4 {

	public static boolean PrimeNumber(int num) {
		for(int i=2; i<num-1; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		for(int i=101; i<=200; i++) {
			if(PrimeNumber(i))
			{
				System.out.print(i+",");
			}
		}
		System.out.print("\n");
	}

}
