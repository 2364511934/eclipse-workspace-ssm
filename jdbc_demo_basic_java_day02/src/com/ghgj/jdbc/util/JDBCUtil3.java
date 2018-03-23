package com.ghgj.jdbc.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ghgj.jdbc.pojo.Student;

/**
 * 经过多次改造：现有的通用查询方法比前两次的查询方法更通用了，主要表现在三点：
 * 1、能够做到根据参数自动判断去那张表查询那些数据----不需要指定表
 * 2、而且参数对象中的各个属性值其实就是查询条件----避免因参数过多提高了方法的复杂度
 * 3、返回的结果就是跟参数类型一致的对象的集合----返回结果拿到即可用，无需复杂的从结果集遍历
 *
 * 但是还存在很多的问题：
 * 1、jdbc链接的问题。每个方法执行一次就获取一次，方法执行完就释放
 *    容易造成频繁的资源获取和释放，消耗服务器性能----通过连接池解决
 * 2、只能做简单事务控制，没法做复杂事务控制----改造代码
 * 3、表名 和 类型 只能一样 ---- 把映射做成可自定义，提高通用性
 * 4、表字段名 和 类属性名 只能一致 ---- 把映射做成可自定义，提高通用性
 * 5、无法解决复杂类型的映射 ---- 完善代码的复杂度
 * 6、无法解决一对一，一对多，多对多的复杂关系查询 ---- 完善代码的复杂度
 * 7、无法完成链接查询
 * .....
 * 
 * 问题太多......  所以就不要自己重复造轮子，去了解轮子，然后使用好轮子
 */
public class JDBCUtil3 {

	/**
	 * 该参数就是一个查询条件的组合体
	 * @throws Exception 
	 */
	public static List<Object> selectStudent(Student student) throws Exception {

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

		// 把获取到的resultSet通过工具方法转换成
		List<Object> objectList = ResultSetUtil.transformResultSetToList(resultSet, student.getClass());

		// 释放资源
		JDBCUtil3Common.close(resultSet, prepareStatement, connection);

		return objectList;
	}
	
	// 通过类型获取表名
	public static String getTableNameByClassName(Object object){
		String fullName = object.getClass().getName();
		
		// 这是获取类型，不包含包名
		String name = fullName.substring(fullName.lastIndexOf(".")+1, fullName.length());
		
		String newName = name.substring(0, 1).toLowerCase() + name.substring(1, name.length());
		
		// 假如类名 和 表名 相同，那么直接返回即可
		return newName;
	}
	
	/**
	 * 通用的查询方法 ： 第八次封装
	 * 注意事项：
	 * 1、表明的映射规则，由方法getTableNameByClassName指定
	 * 2、字段的映射规则，通过反射获取确定
	 * （限制条件：如果表名的字段名称 和  类的属性名称一样 并且 类型名称 和 表名一样， 那么此方法是通用的查询方法）
	 */
	public static List<Object> select(Object object) throws Exception {
		String[] types = { "java.lang.Integer", 
				"java.lang.Double", 
				"java.lang.Float", 
				"java.lang.Long", 
				"java.lang.Short", 
				"java.lang.Byte",
				"java.lang.Boolean", 
				"java.lang.Character", 
				"java.lang.String", 
				"int", "double", "long", "short", "byte", "boolean", "char", "float" };

		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();
		
		// 最精彩的拼装SQL的部分
		StringBuilder sql = new StringBuilder("select ");
		// 获取这个对象的所有属性值
		Field[] declaredFields = object.getClass().getDeclaredFields();
		for(Field f : declaredFields){
			f.setAccessible(true);
			sql.append(f.getName()).append(",");
		}
		// 截取掉最后一个逗号
		String subSelect = sql.toString().substring(0, sql.toString().length() - 1); 
		// "select id, name, sex, age, department "
		
		// 获取表名
		String tableName = getTableNameByClassName(object);
		
		StringBuilder newSQL = new StringBuilder(subSelect + " from "+ tableName + " where 1 = 1 ");
		
//		"select id, name, sex, age, department  from student where 1 = 1"
		
		// 拼接查询条件， 因为是Object不知道有多少个字段，也不知道类型， 循环判断解决
		for(Field f : declaredFields){
			f.setAccessible(true);
			// 判断参数对象中的f属性是不是有值
			String fieldName = f.getName();	
			String fieldType = f.getType().getName();
			for(String type : types){
				if(type.equals(fieldType)){
					// 判断出字段的类型了之后，开始赋值,  此处只写了用到了的两个类型的判断：int 和  string
					switch(type){
					case "int" : 
						int fieldIntValue = f.getInt(object);
						if(fieldIntValue != 0){
							newSQL.append(" and "+ fieldName + "=" +fieldIntValue);
						}
						break;
					case "java.lang.String" : 
						String fieldStringValue = (String) f.get(object);
						if (!"".equals(fieldStringValue) && null != fieldStringValue) {
							newSQL.append(" and "+ fieldName + "='" +fieldStringValue+"'");
						}
						break;
					default:
						String fieldDefaultValue = (String) f.get(object);
						if (!"".equals(fieldDefaultValue) && null != fieldDefaultValue) {
							newSQL.append(" and "+ fieldName + "='" +fieldDefaultValue+"'");
						}
						break;
					}
				}
			}
		}
		
		/**
		 * 最后得出的sql语句其实是通过 Student类进行反射得到表名，和字段名，
		 *  并且把参数对象student中的属性值不是默认的空值或者0值当做查询条件
		 */
		
		System.out.println("拼装的查询SQL语句：" + newSQL.toString());
		PreparedStatement prepareStatement = connection.prepareStatement(newSQL.toString());
//		connection.setAutoCommit(false);
		ResultSet resultSet = prepareStatement.executeQuery();

		// 把获取到的resultSet通过工具方法转换成
		List<Object> objectList = ResultSetUtil.transformResultSetToList(resultSet, object.getClass());

//		connection.commit();
		// 释放资源
		JDBCUtil3Common.close(resultSet, prepareStatement, connection);

		return objectList;
	}
	
	/**
	 * 通用的插入方法
	 * 注意事项：
	 * 1、表明的映射规则，由方法getTableNameByClassName指定
	 * 2、字段的映射规则，通过反射获取确定
	 * （限制条件：如果表名的字段名称 和  类的属性名称一样 并且 类型名称 和 表名一样， 那么此方法是通用的查询方法）
	 */
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
				"int", "double", "long", "short", "byte", "boolean", "char", "float" };

		// 注册驱动。获取JDBC链接
		Connection connection = JDBCUtil.getJDBCConnection();
		
		// 获取表名
		String tableName = getTableNameByClassName(object);
		
		// 最精彩的拼装SQL的部分
		StringBuilder sql = new StringBuilder("insert into "+ tableName + " (");
		// 获取这个对象的所有属性值
		Field[] declaredFields = object.getClass().getDeclaredFields();
		for(Field f : declaredFields){
			f.setAccessible(true);
			sql.append(f.getName()).append(",");
		}
		// 截取掉最后一个逗号
		String subSelect = sql.toString().substring(0, sql.toString().length() - 1);
		
		StringBuilder newSQL = new StringBuilder(subSelect + ") values (");
		
		// 拼接查询条件， 因为是Object不知道有多少个字段，也不知道类型， 循环判断解决
		for(Field f : declaredFields){
			f.setAccessible(true);
			// 判断参数对象中的f属性是不是有值
			String fieldType = f.getType().getName();
			for(String type : types){
				if(type.equals(fieldType)){
					// 判断出字段的类型了之后，开始赋值,  此处只写了用到了的两个类型的判断：int 和  string
					switch(type){
					case "int" : 
						int fieldIntValue = f.getInt(object);
						if(fieldIntValue != 0){
							newSQL.append(fieldIntValue).append(",");
						}
						break;
					case "java.lang.String" : 
						String fieldStringValue = (String) f.get(object);
						if (!"".equals(fieldStringValue) && null != fieldStringValue) {
							newSQL.append("'"+fieldStringValue+"'").append(",");
						}
						break;
					default:
						String fieldDefaultValue = (String) f.get(object);
						if (!"".equals(fieldDefaultValue) && null != fieldDefaultValue) {
							newSQL.append("'"+fieldDefaultValue+"'").append(",");
						}
						break;
					}
				}
			}
		}
		
		String lastSQL = newSQL.toString().substring(0, newSQL.toString().length()-1) + ")";
		
		System.out.println("拼装的查询SQL语句：" + lastSQL);
		PreparedStatement prepareStatement = connection.prepareStatement(lastSQL);
		int executeUpdate = prepareStatement.executeUpdate();

		// 释放资源
		JDBCUtil3Common.close(null, prepareStatement, connection);

		return executeUpdate;
	}

	// 一个普通的拿JDBC 和 释放资源的 工具内部类
	static class JDBCUtil3Common {
		
		private static final String JDBC_URL = "jdbc:mysql://hadoop02:3306/jdbc_test1704?characterEncoding=utf-8";
		private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
		private static final String JDBC_USERNAME = "root";
		private static final String JDBC_PASSWORD = "root";

		public static Connection connection = null;
		public static PreparedStatement prepareStatement = null;

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
}
