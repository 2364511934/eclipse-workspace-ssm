/** 
* 
*/
package com.ghgj.mazh.proxy;

import java.lang.reflect.Proxy;

import com.ghgj.mazh.reflect.Student;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:48:58 
 * 
 * 描述: 代理测试类
 */
public class ProxyTest {

	public static void main(String[] args) {
		
		/**
		 * 基础组件准备
		 */
		StudentDAO studentDao = new StudentDAO();
		PersonDAO personDAO = new PersonDAO();
		Student student = new Student(100000);
		StudentStaticProxyDAO studentProxyDAO = new StudentStaticProxyDAO(studentDao);
		
		
		/**
		 * 测试委托类的功能
		 */
		System.out.println(studentDao.insertStudent(student));
		
		
		/**
		 * 测试静态代理类的功能
		 */
		System.out.println(studentProxyDAO.insertStudent(student));
		
		
		/**
		 * 测试动态代理类的功能
		 */
		StduentInterface newProxyInstance = (StduentInterface)Proxy.newProxyInstance(studentDao.getClass().getClassLoader(),	
				studentDao.getClass().getInterfaces(), 
				new LoggerDynamicProxy(studentDao));
		int insertStudent = newProxyInstance.insertStudent(student);
		System.out.println(insertStudent);
		
		PersonInterface personInstance = (PersonInterface)Proxy.newProxyInstance(personDAO.getClass().getClassLoader(),	
				personDAO.getClass().getInterfaces(), 
				new LoggerDynamicProxy(personDAO));
		int personNumber = personInstance.insertStudent(student);
		System.out.println(personNumber);
	}
}
