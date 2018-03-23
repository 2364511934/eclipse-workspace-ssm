package dao;

import java.util.List;

import bean.User;

public class UserDao extends BaseDao {
	
	// 查询一个用户名和密码是否存在 
	public int QueryOne(String name, String pwd) {
		String sql = "select * from user_list where user_name = ? and user_password = ?";
		Object[] params= {name, pwd};
		List<User> lists =  executeQuery(sql, params, User.class) ;
		if(lists.isEmpty()) {
			return 0;
		}
		return 1;
	}
	
	// 删除一个用户名
	public int DeleteOneUser(String name, String pwd) {
		String sql = "delete from user_list where user_name = ? and user_password = ?";
		Object[] params= {name, pwd};
		  
		return executeUpdate(sql, params);
	}
	
	// 插入一个用户
	public int InsertOneUser(User user) {
		String sql = "insert into user_list(user_name, user_password, user_date) values(?, ?, ?)";
		Object[] params= {user.getUser_name(), user.getUser_password(), user.getUser_date()};
		return executeUpdate(sql, params);
	}
	
	// 查询全部用户信息
	public List<User> QueryAll() {
			String sql = "select * from user_list";
			Object[] params= {};
			
			return executeQuery(sql, params, User.class) ;
	}
}
