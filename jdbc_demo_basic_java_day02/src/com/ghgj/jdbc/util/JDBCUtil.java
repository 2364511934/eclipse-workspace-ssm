package com.ghgj.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年7月13日 上午8:12:59 
 * 
 * 描述：
 * 在普通JDBC_SELECT程序上进行一次简单的封装，把拿数据库的链接 和 释放资源的重复代码给封装了。
 * CRUD测试
 */
public class JDBCUtil {

	private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1704?characterEncoding=utf-8";
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "root";
	
	public static Connection connection = null;
	public static PreparedStatement prepareStatement = null;

	/**
	 * 问题：
	 * 1、数据库的链接代码虽然被封装，但是依然是每拿一次，执行完sql语句就释放掉了
	 * 2、sql语句存在硬编码，被写死在代码中
	 * 3、结果集不友好
	 */
	public static void testSelect() throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		// 执行正常SQL逻辑代码
		String select = "select id,name,sex,age,department from student";
		PreparedStatement prepareStatement = connection.prepareStatement(select);
		ResultSet resultSet = prepareStatement.executeQuery();

		// 打印结果集
		while (resultSet.next()) {
			System.out.println(resultSet.getString("id") 
					+ "\t" + resultSet.getString("name") 
					+ "\t" + resultSet.getString("sex") 
					+ "\t" + resultSet.getString("age") 
					+ "\t" + resultSet.getString("department"));
		}
		
		// 释放资源
		JDBCUtil.close(resultSet, prepareStatement, connection);
	}

	public static void testInsert() throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		// 执行正常SQL逻辑代码
		// 准备插入的sql
		String insert = "insert into student (name, sex, age, department) values (?,?,?,?)";
		// 设置不让自动提交，手动提交事务
		connection.setAutoCommit(false);
		PreparedStatement prepareStatement = connection.prepareStatement(insert);
		prepareStatement.setString(1, "liutao");
		prepareStatement.setString(2, "F");
		prepareStatement.setInt(3, 22);
		prepareStatement.setString(4, "huanlesong");
		int executeUpdate = prepareStatement.executeUpdate();

		// 提交事务
		connection.commit();
		System.out.println(executeUpdate);
		
		JDBCUtil.close(null, prepareStatement, connection);
	}

	public static void testUpdate() throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		connection.setAutoCommit(false);
		// 第三步：获取执行SQL的statement
		String update = "update student set name = ? where id = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(update);
		prepareStatement.setString(1, "hadoop03");  	// 注意此处设置参数的序号是从1开始的
		prepareStatement.setInt(2, 14);

		// 第四步：获取结果集
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("该程序更新了 "+executeUpdate+" 条数据");
		connection.commit();
		
		JDBCUtil.close(null, prepareStatement, connection);
	}

	public static void testDelete() throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		connection.setAutoCommit(false);
		// 第三步：获取执行SQL的statement
		String delete = "delete from student where id = ?";
		PreparedStatement prepareStatement = connection.prepareStatement(delete);
		prepareStatement.setInt(1, 10);  	// 注意此处设置参数的序号是从1开始的

		// 第四步：获取结果集
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("该程序删除了 "+executeUpdate+" 条数据");
		
		// 提交事务
		connection.commit();
		
		JDBCUtil.close(null, prepareStatement, connection);
	}
	
	/**
	 * 帮助方法，为了获取JDBC链接
	 */
	public static Connection getJDBCConnection() {

		try {
			// 第一步：注册驱动类
			Class.forName(DRIVER_CLASS);

			// 第二步：通过驱动管理类，获取数据库链接
			connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("请添加mysql数据库JDBC驱动包");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("获取JDBC链接失败，请重试");
			e.printStackTrace();
		}
		return connection;
	}
	
	/**
	 * 释放资源
	 */
	public static void close(ResultSet resultSet, PreparedStatement statement, Connection connection){
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
