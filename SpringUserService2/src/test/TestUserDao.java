package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.UserDao;
import service.UserService;

public class TestUserDao {
	@Test
	public void testUserServiceImpl() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContextxml.xml");
		/*UserDao userDao = ac.getBean("userdao", UserDao.class);
		userDao.addUser();
		userDao.deleteUser();*/
		UserService bean = ac.getBean("userservice", UserService.class);
		bean.addUser();
		bean.deleteUser();
	}
}
