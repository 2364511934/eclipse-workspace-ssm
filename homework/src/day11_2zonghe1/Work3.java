package day11_2zonghe1;

import java.util.Scanner;

public class Work3 {

	public static boolean PrimeNumber(int num) {
		for(int i=2; i<num-1; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = scanner.nextInt();
		
		System.out.println(num + ": " + (PrimeNumber(num) ?  "����" : "��������"));
		
	}

}
