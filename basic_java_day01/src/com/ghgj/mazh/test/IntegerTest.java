package com.ghgj.mazh.test;

public class IntegerTest {

	public static void main(String[] args) {
		
		int a = 11;
		int b = 11;
		int c = new Integer(11);  // 拆箱操作
		
		Integer d = new Integer(12);
		Integer e = new Integer(12);
		Integer f = new Integer(130);
		Integer h = new Integer(130);
		
		Integer a1 = Integer.valueOf(120);
		Integer a2 = Integer.valueOf(120);
		Integer b1 = Integer.valueOf(130);
		Integer b2 = Integer.valueOf(130);
		
//		System.out.println(a == b);
//		System.out.println(a == c);
//		System.out.println(d == e);
//		System.out.println(f == h);
		
		System.out.println(a1 == a2);
		System.out.println(b1 == b2);
	}
}
