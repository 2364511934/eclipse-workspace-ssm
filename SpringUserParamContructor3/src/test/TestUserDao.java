package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class TestUserDao {
	// 测试user set 赋值
	@Test
	public void testUserProperty() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("userproperty", User.class);
		System.out.println(bean);
	}

	// 测试user 构造函数赋值
	@Test
	public void testUserConstructor() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("userconstructor", User.class);
		System.out.println(bean);
	}

	// 测试user 构造函数赋值 另外一种做法 使用索引方法
	@Test
	public void testUserConstructorIndex() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("userconstructorindex", User.class);
		System.out.println(bean);
	}
}
