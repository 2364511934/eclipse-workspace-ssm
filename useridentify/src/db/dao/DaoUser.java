package db.dao;

import java.util.List;

import db.entity.User;

public class DaoUser extends BaseDao {
	// ���� ����
	protected int insertUser(String sql, Object[] param) {
		return executeUpdate(sql, param);
	}

	// �޸�����
	protected int updateUser(String sql, Object[] param) {
		return executeUpdate(sql, param);
	}

	// ɾ������
	protected int deleteUser(String sql, Object[] param) {
		return executeUpdate(sql, param);
	}

	// ��ѯ
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
 * // ���� ���� protected int insertUser(String sql, Object[] param) { return
 * executeUpdate(sql, param); }
 * 
 * // �޸����� protected int updateUser(String sql, Object[] param) { return
 * executeUpdate(sql, param); }
 * 
 * // ɾ������ protected int deleteUser(String sql, Object[] param) { return
 * executeUpdate(sql, param); }
 * 
 * // ��ѯ protected <User> List<User> queryUser(String sql, Object[] param,
 * Class<?> User) throws Exception { return executeQuery(sql, param, User); } }
 * 
 * class DaoUserCon extends DaoUser { // �����û��� public int insertUserCon(User b) {
 * String sql = "insert into User values(?, ?, ?, ?)"; Object[] param = new
 * Object[4]; param[0] = b.getCid(); param[1] = b.getCname(); param[2] =
 * b.getAuthor(); param[3] = b.getPrice(); return insertUser(sql, param); }
 * 
 * // �޸��û��� public int updateUserCon(int bid, double price) { String sql =
 * "update User set price = ? where bid = ?"; Object[] param = new Object[2];
 * param[0] = price; param[1] = bid; return updateUser(sql, param); }
 * 
 * // ɾ�� �û��� public int deleteUserCon(int bid) { String sql =
 * "delete from User  where bid = ?"; Object[] param = new Object[1]; param[0] =
 * bid; return deleteUser(sql, param); }
 * 
 * // ��ѯ�û��� public <User> List<User> queryUserCon(int bid) throws Exception {
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
 * public static void main(String[] args) throws Exception { // ��������û���
 * /*entity.User User1 = new entity.User(1, "��������", "�޹���", 20.5); entity.User
 * User2 = new entity.User(2, "���μ�", "��ж�", 20); entity.User User3 = new
 * entity.User(3, "ˮ䰴�", "ʩ����", 20.5);
 * 
 * entity.User[] Users = new entity.User[] { User1, User2, User3 };
 * 
 * DaoUserCon daoUserCon = new DaoUserCon(); for (entity.User User : Users) {
 * System.out.println(daoUserCon.insertUserCon(User)); }
 */

// ��ѯ���Ϊ3���û���
/*
 * DaoUserCon daoUserCon = new DaoUserCon(); List<User> lists =
 * daoUserCon.queryUserCon(3);
 * 
 * for(entity.User User : lists) { System.out.println(User); }
 */

// ��ѯ���е��û���
/*
 * DaoUserCon daoUserCon = new DaoUserCon(); List<User> lists =
 * daoUserCon.QueryUserCon();
 * 
 * for(entity.User User : lists) { System.out.println(User); }
 */

// �޸�bid = 3 �ļ۸�
/*
 * DaoUserCon daoUserCon = new DaoUserCon();
 * System.out.println(daoUserCon.updateUserCon(3, 55.5));
 */

// ɾ��bid = 2 ��ͼ�û���
/*
 * DaoUserCon daoUserCon = new DaoUserCon();
 * System.out.println(daoUserCon.deleteUserCon(2));
 */

// ��ѯ���������û���
/*
 * DaoUserCon daoUserCon = new DaoUserCon(); List<User> lists =
 * daoUserCon.QueryUserCon("%��%");
 * 
 * for (entity.User User : lists) { System.out.println(User); }
 */
