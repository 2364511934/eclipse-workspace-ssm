package day10;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringBuffer strf= null;
		System.out.print("ÇëÊäÈëÒ»¶ÎÊı×Ö: ");
		strf =  new StringBuffer(input.next());
		strf.reverse();
		System.out.println(strf.toString());
		
		

	}

}
