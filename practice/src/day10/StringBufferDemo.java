package day10;

import java.util.Scanner;

public class StringBufferDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		StringBuffer strf= null;
		System.out.print("������һ������: ");
		strf =  new StringBuffer(input.next());
		strf.reverse();
		System.out.println(strf.toString());
		
		

	}

}
