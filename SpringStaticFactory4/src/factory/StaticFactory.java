package factory;

import entity.User;

public class StaticFactory {
	// ����һ���û�
	static User createUser() {
		return new User(1, "zs");
	}
}
