package day11_2zonghe1;

public class Work6 {

	public static boolean outputAllFactor(int num) {
		int total = 0;
		for(int i=1; i<num; i++) {
			if(num % i == 0) {
				total +=i;
			}
		}
		if(total == num) {
			return true;
		}
		return false;
	}
	public static void findFinish(int range) {
		for(int i=1; i<=range; i++) {
			if(outputAllFactor(i)) {
				System.out.print(i+",");
			}
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		findFinish(1000);

	}

}
