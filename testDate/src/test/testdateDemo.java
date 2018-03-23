package test;

import java.sql.Date;

public class testdateDemo {

	public static void main(String[] args) {
		
		
		java.util.Date d = new java.util.Date();
		
		System.out.println(d.getTime());
		Date date = new Date(d.getTime());
		System.out.println(date);
		

	}

}
