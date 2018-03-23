package day10;

import java.util.Scanner;

public class GetSubStringDemo {

	public static void main(String[] args) {
		Scanner  scanner= new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·û´®: ");
		
		String str1 = scanner.next();
		
		
		System.out.println(str1.substring(0, 3));
		
		System.out.println(str1.substring(str1.length()-3, str1.length()));

	}

}
