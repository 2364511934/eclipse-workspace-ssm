package dao;

import java.util.List;

import bean.User;

public class UserDao extends BaseDao {
	
	// ��ѯһ���û����������Ƿ���� 
	public int QueryOne(String name, String pwd) {
		String sql = "select * from user_list where user_name = ? and user_password = ?";
		Object[] params= {name, pwd};
		List<User> lists =  executeQuery(sql, params, User.class) ;
		if(lists.isEmpty()) {
			return 0;
		}
		return 1;
	}
	
	// ɾ��һ���û���
	public int DeleteOneUser(String name, String pwd) {
		String sql = "delete from user_list where user_name = ? and user_password = ?";
		Object[] params= {name, pwd};
		  
		return executeUpdate(sql, params);
	}
	
	// ����һ���û�
	public int InsertOneUser(User user) {
		String sql = "insert into user_list(user_name, user_password, user_date) values(?, ?, ?)";
		Object[] params= {user.getUser_name(), user.getUser_password(), user.getUser_date()};
		return executeUpdate(sql, params);
	}
	
	// ��ѯȫ���û���Ϣ
	public List<User> QueryAll() {
			String sql = "select * from user_list";
			Object[] params= {};
			
			return executeQuery(sql, params, User.class) ;
	}
}
