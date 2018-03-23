package com.ghgj.jdbc.api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC_BATCH_INSERT {

	private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1704?characterEncoding=utf-8";
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "root";
	
	/**
	 * 拼装一组SQL
	 */
	public static List<String> getStudentInsertSQLList(String filePath) throws Exception{
		List<String> sqlList = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = null;
		while( (line = br.readLine()) != null){
			sqlList.add(line);
		}
		br.close();
		return sqlList;
	}

	public static void main(String[] args) throws Exception {

		Connection connection = null;
		Statement createStatement = null;
		ResultSet resultSet = null;

		try {
			// 第一步：注册驱动类
			Class.forName(DRIVER_CLASS);
			// 第二步：通过驱动管理类，获取数据库链接
			connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);

			String fileName = "D:\\bigdata\\student\\student.txt";
			// 准备sql
			List<String> lineList = getStudentInsertSQLList(fileName);
			
			// 设置不让自动提交，手动提交事务
			connection.setAutoCommit(false);

			String insert = "insert into student (id, name, sex, age, department) values (?,?,?,?,?)";
			// 第三步：获取执行SQL的statement
			PreparedStatement pstmt = connection.prepareStatement(insert);
			
			for(String line : lineList){
				String[] split = line.split(",");
				int id = Integer.parseInt(split[0]);
				String name = split[1];
				String sex = split[2];
				int age = Integer.parseInt(split[3]);
				String department = split[4];
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, sex);
				pstmt.setInt(4, age);
				pstmt.setString(5, department);
				
				pstmt.addBatch();
			}
			int[] executeBatch = pstmt.executeBatch();

			// 第四步：提交事务
			connection.commit();
			System.out.println(executeBatch.length +" - "+ executeBatch[0]);

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
