package factory;

import entity.User;

public class StaticFactory {
	// 产生一个用户
	static User createUser() {
		return new User(1, "zs");
	}
}
