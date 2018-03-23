package factory;

import entity.User;

public class InstanceFactory {
	// 产生一个用户
	User createUser() {
		return new User(1, "zs");
	}
}
