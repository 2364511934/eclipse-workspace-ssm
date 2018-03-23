package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;

public class TestUserDao {
	@Test
	public void testUserDaoImpl() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		UserDao userDao = ac.getBean("userdao", UserDao.class);
		userDao.addUser();
		userDao.deleteUser();
	}
}
