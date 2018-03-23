package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class TestUserDao {
	// ≤‚ ‘ æ≤Ã¨π§≥ß
	@Test
	public void testStaticFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("staticfactory", User.class);
		System.out.println(bean);
	}
}
