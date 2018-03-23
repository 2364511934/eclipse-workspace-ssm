package com.ghgj.jdbc.homework;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年07月28日上午8:47:33
 * 
 * 描述：
 * 		一个通用的往对应数据库插入数据的insert方法
 * 		JDBCUtil_Homework.insert(Object o)
 */
public class JDBCUtil_Homework {
	
	private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1710?characterEncoding=utf-8";
	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "root";
	
	public static Connection connection = null;
	public static PreparedStatement prepareStatement = null;

	/**
	 * 通过类型获取表名
	 */
	public static String getTableNameByClassName(Object object) {
		String fullName = object.getClass().getName();

		// 这是获取类型，不包含包名
		String name = fullName.substring(fullName.lastIndexOf(".") + 1, fullName.length());

		String newName = name.substring(0, 1).toLowerCase() + name.substring(1, name.length());

		// 假如类名 和 表名 相同，那么直接返回即可
		return newName;
	}

	public static int insert(Object object) throws Exception {
		String[] types = { "java.lang.Integer", 
				"java.lang.Double", 
				"java.lang.Float", 
				"java.lang.Long", 
				"java.lang.Short", 
				"java.lang.Byte", 
				"java.lang.Boolean", 
				"java.lang.Character", 
				"java.lang.String", 
				"int", "double", "long", "short", "byte","boolean", "char", "float" };

		// 注册驱动。获取JDBC链接
		Connection connection = getJDBCConnection();

		// 获取表名
		String tableName = getTableNameByClassName(object);

		// 最精彩的拼装SQL的部分
		StringBuilder sql = new StringBuilder("insert into " + tableName + " (");
		
		// 获取这个对象的所有属性值
		Field[] declaredFields = object.getClass().getDeclaredFields();
		for (Field f : declaredFields) {
			f.setAccessible(true);
			sql.append(f.getName()).append(",");
		}
		
		// 截取掉最后一个逗号
		String subSelect = sql.toString().substring(0, sql.toString().length() - 1);

		StringBuilder newSQL = new StringBuilder(subSelect + ") values (");

		// 拼接查询条件， 因为是Object不知道有多少个字段，也不知道类型， 循环判断解决
		for (Field f : declaredFields) {
			f.setAccessible(true);
			// 判断参数对象中的f属性是不是有值
			String fieldType = f.getType().getName();
			for (String type : types) {
				if (type.equals(fieldType)) {
					// 判断出字段的类型了之后，开始赋值,  此处只写了用到了的两个类型的判断：int 和  string
					switch (type) {
					case "int":
						int fieldIntValue = f.getInt(object);
						if (fieldIntValue != 0) {
							newSQL.append(fieldIntValue).append(",");
						}
						break;
					case "double":
						double fieldDoubleValue = f.getDouble(object);
						if (fieldDoubleValue != 0) {
							newSQL.append(fieldDoubleValue).append(",");
						}
						break;
					case "java.lang.String":
						String fieldStringValue = (String) f.get(object);
						if (!"".equals(fieldStringValue) && null != fieldStringValue) {
							newSQL.append("'" + fieldStringValue + "'").append(",");
						}
						break;
					default:
						String fieldDefaultValue = (String) f.get(object);
						if (!"".equals(fieldDefaultValue) && null != fieldDefaultValue) {
							newSQL.append("'" + fieldDefaultValue + "'").append(",");
						}
						break;
					}
				}
			}
		}

		String lastSQL = newSQL.toString().substring(0, newSQL.toString().length() - 1) + ")";

		System.out.println("拼装的查询SQL语句：" + lastSQL);
		PreparedStatement prepareStatement = connection.prepareStatement(lastSQL);
		int executeUpdate = prepareStatement.executeUpdate();

		// 释放资源
		close(null, prepareStatement, connection);

		return executeUpdate;
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
	
	/**
	 * 获取数据库连接
	 */
	public static Connection getJDBCConnection() {

		try {
			// 第一步：注册驱动类
			Class.forName(DRIVER_CLASS);

			// 第二步：通过驱动管理类，获取数据库链接
			connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("请添加MySQL数据库JDBC驱动包");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("获取JDBC链接失败，请重试");
			e.printStackTrace();
		}
		return connection;
	}
}
