package day10;

import java.util.Scanner;

public class PalindromeDemo {

	public static boolean juddgePalindrom(String args) {
		if (args.length() %2 == 0) {
			return false;
		}
		int i = 0;
		for(; i<=args.length()/2; i++) {
			if (args.charAt(i) != args.charAt(args.length()-1-i)) {
				break;
			}
		}
		if (i == (args.length()/2)+1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new  Scanner(System.in);
		System.out.print("请输入一段回文 :");
		
		String str = input.next();
		
		System.out.println(juddgePalindrom(str));
		

	}

}
