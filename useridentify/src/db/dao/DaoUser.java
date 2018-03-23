package db.dao;

import java.util.List;

import db.entity.User;

public class DaoUser extends BaseDao {
	// 插入 数据
	protected int insertUser(String sql, Object[] param) {
		return executeUpdate(sql, param);
	}

	// 修改数据
	protected int updateUser(String sql, Object[] param) {
		return executeUpdate(sql, param);
	}

	// 删除数据
	protected int deleteUser(String sql, Object[] param) {
		return executeUpdate(sql, param);
	}

	// 查询
	protected <User> List<User> queryUser(String sql, Object[] param, Class<?> User) throws Exception {
		return executeQuery(sql, param, User);
	}
}



/*
 * package dao;
 * 
 * import java.util.List;
 * 
 * import entity.User;
 * 
 * class DaoUser extends BaseDao {
 * 
 * // 插入 数据 protected int insertUser(String sql, Object[] param) { return
 * executeUpdate(sql, param); }
 * 
 * // 修改数据 protected int updateUser(String sql, Object[] param) { return
 * executeUpdate(sql, param); }
 * 
 * // 删除数据 protected int deleteUser(String sql, Object[] param) { return
 * executeUpdate(sql, param); }
 * 
 * // 查询 protected <User> List<User> queryUser(String sql, Object[] param,
 * Class<?> User) throws Exception { return executeQuery(sql, param, User); } }
 * 
 * class DaoUserCon extends DaoUser { // 插入用户名 public int insertUserCon(User b) {
 * String sql = "insert into User values(?, ?, ?, ?)"; Object[] param = new
 * Object[4]; param[0] = b.getCid(); param[1] = b.getCname(); param[2] =
 * b.getAuthor(); param[3] = b.getPrice(); return insertUser(sql, param); }
 * 
 * // 修改用户名 public int updateUserCon(int bid, double price) { String sql =
 * "update User set price = ? where bid = ?"; Object[] param = new Object[2];
 * param[0] = price; param[1] = bid; return updateUser(sql, param); }
 * 
 * // 删除 用户名 public int deleteUserCon(int bid) { String sql =
 * "delete from User  where bid = ?"; Object[] param = new Object[1]; param[0] =
 * bid; return deleteUser(sql, param); }
 * 
 * // 查询用户名 public <User> List<User> queryUserCon(int bid) throws Exception {
 * String sql = "select *  from User  where bid = ?"; Object[] param = new
 * Object[1]; param[0] = bid; return queryUser(sql, param, entity.User.class); }
 * 
 * public <User> List<User> QueryUserCon() throws Exception { String sql =
 * "select *  from User"; Object[] param = new Object[0]; return queryUser(sql,
 * param, entity.User.class); }
 * 
 * public <User> List<User> QueryUserCon(String cname) throws Exception { String
 * sql = "select *  from User where bname like ? "; Object[] param = new
 * Object[1]; param[0] = cname; return queryUser(sql, param, entity.User.class);
 * } }
 * 
 * public class DaoUserDemo {
 * 
 * public static void main(String[] args) throws Exception { // 添加三本用户名
 * /*entity.User User1 = new entity.User(1, "三国演义", "罗贯中", 20.5); entity.User
 * User2 = new entity.User(2, "西游记", "吴承恩", 20); entity.User User3 = new
 * entity.User(3, "水浒传", "施耐庵", 20.5);
 * 
 * entity.User[] Users = new entity.User[] { User1, User2, User3 };
 * 
 * DaoUserCon daoUserCon = new DaoUserCon(); for (entity.User User : Users) {
 * System.out.println(daoUserCon.insertUserCon(User)); }
 */

// 查询编号为3的用户名
/*
 * DaoUserCon daoUserCon = new DaoUserCon(); List<User> lists =
 * daoUserCon.queryUserCon(3);
 * 
 * for(entity.User User : lists) { System.out.println(User); }
 */

// 查询所有的用户名
/*
 * DaoUserCon daoUserCon = new DaoUserCon(); List<User> lists =
 * daoUserCon.QueryUserCon();
 * 
 * for(entity.User User : lists) { System.out.println(User); }
 */

// 修改bid = 3 的价格
/*
 * DaoUserCon daoUserCon = new DaoUserCon();
 * System.out.println(daoUserCon.updateUserCon(3, 55.5));
 */

// 删除bid = 2 的图用户名
/*
 * DaoUserCon daoUserCon = new DaoUserCon();
 * System.out.println(daoUserCon.deleteUserCon(2));
 */

// 查询带有三的用户名
/*
 * DaoUserCon daoUserCon = new DaoUserCon(); List<User> lists =
 * daoUserCon.QueryUserCon("%三%");
 * 
 * for (entity.User User : lists) { System.out.println(User); }
 */
