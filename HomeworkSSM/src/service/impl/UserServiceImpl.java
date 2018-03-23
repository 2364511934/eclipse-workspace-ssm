package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import mapper.UserMapper;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper mapper;

	@Override
	public List<User> queryOne(String name, String password) {
		return mapper.queryOne(name, password);
	}
	
	
}
