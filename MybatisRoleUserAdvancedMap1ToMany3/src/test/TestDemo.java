package test;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import entity.Role;
import mapper.RoleMapper;
import util.MybatisUtils;

public class TestDemo {

	// 查询所有角色
	@Test
	public void testMybatisQueryRoleAndUser() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		RoleMapper mapper = session.getMapper(RoleMapper.class);
		List<Role> queryRoleAndUser = mapper.queryRoleAndUser();
		System.out.println(queryRoleAndUser);
		MybatisUtils.closeSession();
	}

}
