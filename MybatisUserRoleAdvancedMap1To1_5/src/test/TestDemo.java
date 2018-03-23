package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Role;
import entity.User;
import mapper.UserMapper;
import util.MybatisUtils;

public class TestDemo {

	// ��ѯ���н�ɫ
	@Test
	public void testMybatisQueryRoleAndUser() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> queryUserAndRole = mapper.queryUserAndRole();
		System.out.println(queryUserAndRole);
		MybatisUtils.closeSession();
	}

}
