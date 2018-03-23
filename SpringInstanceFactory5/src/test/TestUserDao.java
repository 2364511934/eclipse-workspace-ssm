package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class TestUserDao {
	// ²âÊÔ ÊµÀý¹¤³§
	@Test
	public void testInstanceFactory() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("user", User.class);
		System.out.println(bean);
	}
}
