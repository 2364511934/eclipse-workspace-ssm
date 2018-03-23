package com.ghgj.yn.reflect;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;

public class Test {
	@Before
	public void init() {
		System.out.println("init");
	}
	
	@org.junit.Test
	public void testInserBook() throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, SQLException {
		Book book =  new Book(30, "hadoop", "dog cutting", 300.344);
		
		JDBCUtil.insert(book);
	}
	
	@org.junit.Test
	public void testInsertStudent() throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, SQLException {
		Student student = new Student(1, "张三", 20, 344.324);
		
		JDBCUtil.insert(student);
	}
	
	@org.junit.Test
	public void testSelectBook() throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, SQLException {
		Book book =  new Book(30, "hadoop", "dog cutting", 300.344);
		
		JDBCUtil.insert(book);
	}
	
	@org.junit.Test
	public void testSelectStudent() throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, SQLException {
		Student student = new Student(1, "张三", 20, 344.324);
		
		JDBCUtil.insert(student);
	}
	

	@After
	public void destroy() {
		System.out.println("destroy");
	}
}
