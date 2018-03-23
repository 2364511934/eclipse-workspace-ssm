package com.ghgj.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ghgj.jdbc.pojo.Student;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年7月13日 上午8:13:24 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class JDBCUtil2 {

	private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1704?characterEncoding=utf-8";
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "root";

	public static Connection connection = null;
	public static PreparedStatement prepareStatement = null;

	/**
	 * 根据设置的参数插入数据到固定的student表中
	 * student表 插入 工具方法
	 */
	public static void testInsertWithParams(int id, String name, String sex, int age, String department) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		// 准备插入的sql
		String insert = "insert into student (id, name, sex, age, department) values (?,?,?,?,?)";
		// 设置不让自动提交，手动提交事务
		connection.setAutoCommit(false);
		PreparedStatement prepareStatement = connection.prepareStatement(insert);
		prepareStatement.setInt(1, id);
		prepareStatement.setString(2, name);
		prepareStatement.setString(3, sex);
		prepareStatement.setInt(4, age);
		prepareStatement.setString(5, department);
		int executeUpdate = prepareStatement.executeUpdate();

		System.out.println(executeUpdate);
		// 提交事务
		connection.commit();
		// 释放资源
		JDBCUtil.close(null, prepareStatement, connection);
	}

	/**
	 * 根据设置的参数值去修改student表数据
	 * 根据ID修改该条记录的其他字段值
	 */
	public static void testUpdateWithParams(int id, String name, String sex, int age, String department) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();
		// 设置事务手动提交
		connection.setAutoCommit(false);

		// 拼装SQL
		StringBuilder updateSQL = new StringBuilder("update student set ");
		if (!"".equals(name) && null != name) {
			updateSQL.append(" name = ?").append(",");
		}
		if (!"".equals(sex) && null != sex) {
			updateSQL.append(" sex = ?").append(",");
		}
		if (age != 0) {
			updateSQL.append(" age = ?").append(",");
		}
		if (!"".equals(department) && null != department) {
			updateSQL.append(" department = ?").append(",");
		}
		String subUpdate = updateSQL.toString().substring(0, updateSQL.toString().length() - 1); // 截取掉最后一个逗号
		String newUpdateSQL = subUpdate + " where id = ?";
		System.out.println("拼装的修改SQL：" + newUpdateSQL);
		PreparedStatement prepareStatement = connection.prepareStatement(newUpdateSQL);
		prepareStatement.setString(1, name); // 注意此处设置参数的序号是从1开始的
		prepareStatement.setString(2, sex);
		prepareStatement.setInt(3, age);
		prepareStatement.setString(4, department);
		prepareStatement.setInt(5, id);

		// 执行sql语句
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("该程序更新了 " + executeUpdate + " 条数据");

		// 提交事务
		connection.commit();
		// 释放资源
		JDBCUtil.close(null, prepareStatement, connection);
	}

	/**
	 * 根据设置的参数取删除某些记录
	 * 根据给定条件删除数据
	 */
	public static void testDeleteWithParams(int id, String name, String sex, int age, String department) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();
		// 设置手动提交事务
		connection.setAutoCommit(false);

		// 拼装SQL
		StringBuilder deleteSQL = new StringBuilder("delete from student where 1 = 1");
		if (id != 0) {
			deleteSQL.append(" and id = " + id);
		}
		if (!"".equals(name) && null != name) {
			deleteSQL.append(" and name = '" + name + "'");
		}
		if (!"".equals(sex) && null != sex) {
			deleteSQL.append(" and sex = '" + sex + "'");
		}
		if (age != 0) {
			deleteSQL.append(" and age = " + age);
		}
		if (!"".equals(department) && null != department) {
			deleteSQL.append(" and department = '" + department + "'");
		}

		String newDeleteSQL = deleteSQL.toString();
		System.out.println("拼装的删除SQL：" + newDeleteSQL);

		// 获取PreparedStatement 并设置参数
		PreparedStatement prepareStatement = connection.prepareStatement(newDeleteSQL);
		// 执行SQL语句
		int executeUpdate = prepareStatement.executeUpdate();
		System.out.println("该程序删除了 " + executeUpdate + " 条数据");

		// 提交事务
		connection.commit();
		// 释放资源
		JDBCUtil.close(null, prepareStatement, connection);
	}

	/**
	 * 第三次封装：从某个表中  查询所有记录的某些特定的字段值
	 * 查询:参数是字段名称列表
	 */
	public static void testSelectColumns(String tableName, String... columns) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		StringBuilder sql = new StringBuilder("select ");
		for (String column : columns) {
			sql.append(column).append(",");
		}
		String subSelect = sql.toString().substring(0, sql.toString().length() - 1); // 截取掉最后一个逗号

		String select = subSelect + " from " + tableName;
		System.out.println("拼装的查询SQL语句：" + select);
		PreparedStatement prepareStatement = connection.prepareStatement(select);
		ResultSet resultSet = prepareStatement.executeQuery();

		// 打印结果集
		while (resultSet.next()) {
			for (String column : columns) {
				String value = resultSet.getString(column);
				System.out.print(value + "\t");
			}
			System.out.println();
		}
		JDBCUtil.close(resultSet, prepareStatement, connection);
	}

	/**
	 * 第四次查询方法封装：查询固定表中指定参数条件的数据
	 * student表查询带条件的工具方法
	 */
	public static void testSelectWithParams(int id, String name, String sex, int age, String department) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		// 拼装查询SQL
		StringBuilder selectSQL = new StringBuilder("select id,name,sex,age,department from student where 1 = 1");
		if (id != 0) {
			selectSQL.append(" and id = " + id);
		}
		if (!"".equals(name) && null != name) {
			selectSQL.append(" and name = '" + name + "'");
		}
		if (!"".equals(sex) && null != sex) {
			selectSQL.append(" and sex = '" + sex + "'");
		}
		if (age != 0) {
			selectSQL.append(" and age = " + age);
		}
		if (!"".equals(department) && null != department) {
			selectSQL.append(" and department = '" + department + "'");
		}

		System.out.println("拼装的查询SQL语句：" + selectSQL.toString());
		PreparedStatement prepareStatement = connection.prepareStatement(selectSQL.toString());
		ResultSet resultSet = prepareStatement.executeQuery();

		// 打印结果集 。。。 这个地方不爽。。。。
		while (resultSet.next()) {
			System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") + "\t" + resultSet.getString("sex") + "\t"
					+ resultSet.getString("age") + "\t" + resultSet.getString("department"));
		}

		// 释放资源
		JDBCUtil2.close(resultSet, prepareStatement, connection);
	}
	
	/**
	 * 第五次查询方法封装：参数复杂。做ORM映射，把所有参数都封装在一个对象里
	 */
	public static void testSelectWithParams(Student student) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();
		
		int id = student.getId();
		String name = student.getName();
		String sex = student.getSex();
		int age = student.getAge();
		String department = student.getDepartment();

		// 拼装查询SQL
		StringBuilder selectSQL = new StringBuilder("select id,name,sex,age,department from student where 1 = 1");
		if (id != 0) {
			selectSQL.append(" and id = " + id);
		}
		if (!"".equals(name) && null != name) {
			selectSQL.append(" and name = '" + name + "'");
		}
		if (!"".equals(sex) && null != sex) {
			selectSQL.append(" and sex = '" + sex + "'");
		}
		if (age != 0) {
			selectSQL.append(" and age = " + age);
		}
		if (!"".equals(department) && null != department) {
			selectSQL.append(" and department = '" + department + "'");
		}

		System.out.println("拼装的查询SQL语句：" + selectSQL.toString());
		PreparedStatement prepareStatement = connection.prepareStatement(selectSQL.toString());
		ResultSet resultSet = prepareStatement.executeQuery();

		// 打印结果集 。。。 这个地方不爽。。。。
		while (resultSet.next()) {
			System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") + "\t" + resultSet.getString("sex") + "\t"
					+ resultSet.getString("age") + "\t" + resultSet.getString("department"));
		}

		// 释放资源
		JDBCUtil2.close(resultSet, prepareStatement, connection);
	}
	
	/**
	 * 第六次查询方法的封装：把结果集进行封装，返回成一个 固定对象的 List集合
	 * 该方法返回一个ResultSet结果集
	 */
	public static List<Object> getSelectResultSetWithParams(int id, String name, String sex, int age, String department) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		// 拼装查询SQL
		StringBuilder selectSQL = new StringBuilder("select id,name,sex,age,department from student where 1 = 1");
		if (id != 0) {
			selectSQL.append(" and id = " + id);
		}
		if (!"".equals(name) && null != name) {
			selectSQL.append(" and name = '" + name + "'");
		}
		if (!"".equals(sex) && null != sex) {
			selectSQL.append(" and sex = '" + sex + "'");
		}
		if (age != 0) {
			selectSQL.append(" and age = " + age);
		}
		if (!"".equals(department) && null != department) {
			selectSQL.append(" and department = '" + department + "'");
		}

		System.out.println("拼装的查询SQL语句：" + selectSQL.toString());
		PreparedStatement prepareStatement = connection.prepareStatement(selectSQL.toString());
		ResultSet resultSet = prepareStatement.executeQuery();

		List<Object> objectList = ResultSetUtil.transformResultSetToList(resultSet, Student.class);
		
		// 释放资源
		JDBCUtil2.close(resultSet, prepareStatement, connection);

		return objectList;
	}
	
	/**
	 * 第七次查询方法的封装：把结果集进行封装，返回成一个 固定对象的 List集合
	 * 该方法返回一个ResultSet结果集
	 */
	public static List<Object> getSelectResultSetWithParams(Student student) throws Exception {
		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();

		int id = student.getId();
		String name = student.getName();
		String sex = student.getSex();
		int age = student.getAge();
		String department = student.getDepartment();
		
		// 拼装查询SQL
		StringBuilder selectSQL = new StringBuilder("select id,name,sex,age,department from student where 1 = 1");
		if (id != 0) {
			selectSQL.append(" and id = " + id);
		}
		if (!"".equals(name) && null != name) {
			selectSQL.append(" and name = '" + name + "'");
		}
		if (!"".equals(sex) && null != sex) {
			selectSQL.append(" and sex = '" + sex + "'");
		}
		if (age != 0) {
			selectSQL.append(" and age = " + age);
		}
		if (!"".equals(department) && null != department) {
			selectSQL.append(" and department = '" + department + "'");
		}

		System.out.println("拼装的查询SQL语句：" + selectSQL.toString());
		PreparedStatement prepareStatement = connection.prepareStatement(selectSQL.toString());
		ResultSet resultSet = prepareStatement.executeQuery();

		List<Object> objectList = ResultSetUtil.transformResultSetToList(resultSet, Student.class);
		
		// 释放资源
		JDBCUtil2.close(resultSet, prepareStatement, connection);

		return objectList;
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
	public static void close(ResultSet resultSet, PreparedStatement statement, Connection connection) {
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
