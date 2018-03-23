package com.ghgj.yn.stat;

public class Test {
	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		StudentStaticProxyDAO studentStaticProxyDAO = new StudentStaticProxyDAO(studentDAO);
		studentStaticProxyDAO.insert(new Object());
	}
}
