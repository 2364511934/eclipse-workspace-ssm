package day11_2zonghe1;

import java.util.Scanner;

public class Work5 {

	public static void outputAllFactor(int num) {
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i+",");
			}
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.print("请输入一个整数:");
		int num = scanner.nextInt();
		outputAllFactor(num);
	}

}
