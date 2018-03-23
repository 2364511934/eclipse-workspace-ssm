package com.ghgj.yn.stat;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAO();
		StudentDynamicProxyDAO studentDynamicProxyDAO = new StudentDynamicProxyDAO(studentDAO);
		
		DAO  proxy =(DAO) Proxy.newProxyInstance(studentDAO.getClass().getClassLoader(), 
				StudentDAO.class.getInterfaces(), 
				studentDynamicProxyDAO);
		proxy.insert(new Object());
		
		/*DAO  proxy2 =(DAO) Proxy.newProxyInstance(studentDAO.getClass().getClassLoader(), 
				DAO.class.getInterfaces(), 
				studentDynamicProxyDAO);
		proxy2.insert(new Object());*/
		
	}
}
