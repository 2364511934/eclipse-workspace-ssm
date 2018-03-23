package com.ghgj.jdbc.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JBDC_UPDATE {

	private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1704?characterEncoding=utf-8";
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "root";

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement prepareStatement = null;
		ResultSet resultSet = null;

		try {
			// 第一步：注册驱动类
			Class.forName(DRIVER_CLASS);

			// 第二步：通过驱动管理类，获取数据库链接
			connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

			connection.setAutoCommit(false);
			// 第三步：获取执行SQL的statement
			String update = "update student set name = ? where id = ?";
			prepareStatement = connection.prepareStatement(update);
			prepareStatement.setString(1, "mybatis");  	// 注意此处设置参数的序号是从1开始的
			prepareStatement.setInt(2, 95010);

			// 第四步：获取结果集
			int executeUpdate = prepareStatement.executeUpdate();
			System.out.println("该程序更新了 "+executeUpdate+" 条数据");
			connection.commit();

			// 打印结果集

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
			if (prepareStatement != null) {
				try {
					prepareStatement.close();
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
