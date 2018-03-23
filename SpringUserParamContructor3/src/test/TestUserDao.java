package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;

public class TestUserDao {
	// ����user set ��ֵ
	@Test
	public void testUserProperty() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("userproperty", User.class);
		System.out.println(bean);
	}

	// ����user ���캯����ֵ
	@Test
	public void testUserConstructor() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("userconstructor", User.class);
		System.out.println(bean);
	}

	// ����user ���캯����ֵ ����һ������ ʹ����������
	@Test
	public void testUserConstructorIndex() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		User bean = ac.getBean("userconstructorindex", User.class);
		System.out.println(bean);
	}
}
