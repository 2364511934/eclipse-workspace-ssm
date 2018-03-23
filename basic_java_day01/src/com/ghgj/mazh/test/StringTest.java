package com.ghgj.mazh.test;

public class StringTest {

	public static void main(String[] args) {
		
		
		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
