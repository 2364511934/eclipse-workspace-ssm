package factory;

import entity.User;

public class InstanceFactory {
	// ����һ���û�
	User createUser() {
		return new User(1, "zs");
	}
}
