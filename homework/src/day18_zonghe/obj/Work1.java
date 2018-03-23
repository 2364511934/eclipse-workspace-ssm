package day18_zonghe.obj;

import java.util.Scanner;

public class Work1 {

	// 奇数
	public static double oddNnumber (int n) {
		double sum = 0.0;
		for(int i=1; i<=n; i+=2) {
			sum+=(1.0/i);
		}
		
		return sum;
	}
	
	// 偶数
	public static double evenNumber (int n) {
		double sum = 0.0;
		for(int i=2; i<=n; i+=2) {
			sum+=(1.0/i);
		}
		return sum;
	}
	
	public static  double number(int n) {
		if(n %2 == 0) {
			return evenNumber(n);
		}
		return oddNnumber(n);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int n = scanner.nextInt();
		if(n > 0) {
			System.out.println(number(n));
		}
		
	}

}
