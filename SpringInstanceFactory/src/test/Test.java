package test;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class Test {
	
	@org.junit.Test
	public void testInstanceFactory() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User user= ac.getBean("createuser", User.class);
		System.out.println(user);
		//ac.getClass().getMethod("close").invoke(ac);
	}
}
