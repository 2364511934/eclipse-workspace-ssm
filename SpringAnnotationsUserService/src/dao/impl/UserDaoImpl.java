package dao.impl;

import org.springframework.stereotype.Component;

import dao.UserDao;

@Component("userdao")
public class UserDaoImpl implements UserDao {

	@Override
	public void addUser() {
		System.out.println("�����û�");
	}

	@Override
	public void deleteUser() {
		System.out.println("ɾ���û�");
	}
	
}