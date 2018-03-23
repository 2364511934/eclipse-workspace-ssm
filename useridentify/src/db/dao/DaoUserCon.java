package db.dao;

import java.util.List;

import db.entity.User;


public class DaoUserCon extends DaoUser {
	// 插入用户名
	public int insertUserCon(User b) {
		String sql = "insert into `user` values(?, ?)";
		Object[] param = new Object[2];
		param[0] = b.getName();
		param[1] = b.getPassword();
		
		return insertUser(sql, param);
	}

	// 修改用户名
	public int updateUserCon(String name, String password) {
		String sql = "update `user` set password=? where name = ?";
		Object[] param = new Object[2];
		param[0] = password;
		param[1] = name;
		return updateUser(sql, param);
	}

	// 删除 用户名
	public int deleteUserCon(String name) {
		String sql = "delete from `user`  where name = ?";
		Object[] param = new Object[1];
		param[0] = name;
		return deleteUser(sql, param);
	}

	// 查询用户名
	public <User> List<User> queryUserCon(String name) throws Exception {
		String sql = "select *  from `user`  where name = ?";
		Object[] param = new Object[1];
		param[0] = name;
		return queryUser(sql, param, db.entity.User.class);
	}

	public <User> List<User> QueryUserCon() throws Exception {
		String sql = "select *  from `user`";
		Object[] param = new Object[0];
		return queryUser(sql, param, db.entity.User.class);
	}

}