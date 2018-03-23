package service.impl;

import org.springframework.stereotype.Service;

import service.UserService;

@Service("userservice")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("Ìí¼Ó");
	}

	@Override
	public void deleteUser() {
		System.out.println("É¾³ý");
	}

}
