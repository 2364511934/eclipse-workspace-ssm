package com.ghgj.jdbc.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JBDC_INSERT {

	private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1704?characterEncoding=utf-8";
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "root";

	public static void main(String[] args) {

		Connection connection = null;
		Statement createStatement = null;
		ResultSet resultSet = null;

		try {
			// 第一步：注册驱动类
			Class.forName(DRIVER_CLASS);
			// 第二步：通过驱动管理类，获取数据库链接
			connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

			// 准备插入的sql
			String insert = "insert into student (name, sex, age, department) values ('huangbo','M',22,'bigdata')";
			// 设置不让自动提交，手动提交事务
			connection.setAutoCommit(false);

			// 第三步：获取执行SQL的statement
			// 普通方式
//			createStatement = connection.createStatement();
			// 预编译方式（最好采用这种方式，能预防 SQL 注入）
			createStatement = connection.prepareStatement(insert);
			int executeUpdate = createStatement.executeUpdate(insert);

			// 第四步：提交事务
			connection.commit();
			System.out.println(executeUpdate);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 第五步：释放资源
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (createStatement != null) {
				try {
					createStatement.close();
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
}