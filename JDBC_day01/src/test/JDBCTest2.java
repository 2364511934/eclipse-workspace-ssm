package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCTest2 {

	public static void main(String[] args) throws Exception {

		// insert(1, "classroom1");
		// update(1, "classroom2");
		// update(2, "classroom2");
		// update(3, "classroom2");
		// delete (1);
		qurey();
	}

	public static void login(String name, String pwd) {
		//Class.forName("com.mysql.jdbc.Driver");
		//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://188.188.8.65:3306/bd1711", "root",
		// "root");
		//Statement stmt = conn.createStatement();
		// String sql = "insert into classroom values(" +cid+ ",'" + cname + "')";
		//int rows = stmt.executeUpdate(sql);
		//System.out.println("rows : " + rows);
		//stmt.close();
		//conn.close();
	}

	// ²åÈë
	public static void insert(int cid, String cname) throws Exception {
		// DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://188.188.8.65:3306/bd1711", "root",
		// "root");
		Statement stmt = conn.createStatement();
		String sql = "insert into classroom values(" + cid + ",'" + cname + "')";
		int rows = stmt.executeUpdate(sql);
		System.out.println("rows : " + rows);
		stmt.close();
		conn.close();

	}

	// ÐÞ¸Ä
	public static void update(int cid, String cname) throws Exception {
		// DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		String sql = "update classroom set cname='" + cname + "' where cid=" + cid + "";
		int rows = stmt.executeUpdate(sql);
		System.out.println("rows : " + rows);
		stmt.close();
		conn.close();

	}

	// É¾³ý
	public static void delete(int cid) throws Exception {
		// DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		String sql = "delete from classroom  where cid = " + cid + "";
		int rows = stmt.executeUpdate(sql);
		System.out.println("rows : " + rows);
		stmt.close();
		conn.close();

	}

	public static void qurey() throws ClassNotFoundException, SQLException {
		// DriverManager.registerDriver(new Driver());
		Class.forName("com.mysql.jdbc.Driver");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root",
		// "root");
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://188.188.8.65:3306/bd1711", "root",
		// "root");
		Connection conn = DriverManager.getConnection("jdbc:mysql://188.188.8.59:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		String str = "select * from emp";
		ResultSet rs = stmt.executeQuery(str);
		while (rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			System.out.println("empno:" + empno + " ename: " + ename);
		}

		rs.close();
		stmt.close();
		conn.close();
	}

}
