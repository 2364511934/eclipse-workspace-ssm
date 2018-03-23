package com.ghgj.jdbc.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * JDBC编码流程
 * 1、注册驱动类
 * 2、获取数据库连接
 * 3、获取Statement
 * 4、执行SQL语句
 * 5、释放资源
 * 
 * 存在问题
 * 1、存在重复问题，每个JDBC程序都需要写一次，当然这是可以封装的； 存在硬编码问题，驱动类写死，假如换成Oracle数据库，就会出现需要重新改写代码的困扰，不方便
 * 2、获取数据库连接，每次拿到数据库连接只执行一次sql就释放资源，很容易造成资源浪费，频繁的获取数据库资源是数据来说是非常大的消耗
 * 3、获取Statement的问题，存在硬编码的问题，每个JDBC程序中的sql语句都被写死了。 不通用
 * 4、执行sql语句，结果集不友好。
 * 5、释放资源，同2
 */
public class JBDC_SELECT {

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

			// 第三步：获取执行SQL的statement
			String select = "select id,name,sex,age,department from student";
//			String select = "select id,name,sex,age,department from student where name = ?";
			prepareStatement = connection.prepareStatement(select);
//			prepareStatement.setString(1, "王一");  	// 注意此处设置参数的序号是从1开始的

			// 第四步：获取结果集
			resultSet = prepareStatement.executeQuery();

			// 打印结果集
			while (resultSet.next()) {
				// 以下两种获取数据的方式均可，注意序号是从1开始的
//				System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3) + "\t" + resultSet.getString(4) + "\t" + resultSet.getString(5));
				System.out.println(resultSet.getInt("id") + "\t" + 
						resultSet.getString("name") + "\t" + 
						resultSet.getString("sex") + "\t" +
						resultSet.getInt("age") + "\t" +
						resultSet.getString("department"));
			}

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
