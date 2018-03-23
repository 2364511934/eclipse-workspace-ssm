package com.ghgj.jdbc.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ghgj.jdbc.pojo.Student;

public class ResultSetUtil {
	
	/**
	 * 封装一个打印ResultSet的方法
	 */
	public static void printResultSet(ResultSet resultSet) throws SQLException {
		/**
		 * 怎么封装？ 问题有二： 1、怎么知道有多少条记录，这个好说，直接resultSet.next()循环取下一条
		 * 2、怎么知道有多少个字段值，，，
		 */
		while (resultSet.next()) {
			System.out.println(resultSet.getString("id") + "\t" + resultSet.getString("name") + "\t" + resultSet.getString("sex") + "\t"
					+ resultSet.getString("age") + "\t" + resultSet.getString("department"));
		}
	}

	/**
	 * 直接把student的resultSet转换成List<Student> 但是存在一个问题：不通用，假如是List<Score>呢
	 */
	public static List<Student> transformResultSetToList(ResultSet resultSet) {
		List<Student> studentList = new ArrayList<Student>();
		try {
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String sex = resultSet.getString("sex");
				int age = resultSet.getInt("age");
				String department = resultSet.getString("department");
				Student student = new Student(id, name, sex, age, department);
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	/**
	 * 怎么把ResultSet变成List<Object>，这个Object类，其实就是clazz参数这个类 参数含义
	 * 1、resultSet:待转换的resultSet 
	 * 2、clazz:表示resultSet集合中的一条记录转换成什么样的对象， 比如clazz的参数是 Student.class
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws InstantiationException 
	 */
	public static List<Object> transformResultSetToList(ResultSet resultSet, Class clazz) throws IllegalArgumentException, IllegalAccessException, InstantiationException {

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

		Field[] declaredFields = clazz.getDeclaredFields();
		List<Object> objectList = new ArrayList<Object>();
		try {
			// 循环遍历查询出来的结果集，把每一条记录的结果值通过反射存储在一个对象当中
			while (resultSet.next()) {
				// 存储结果的对象
				Object	newInstance = clazz.newInstance();
				
				// clazz参数有多少个字段
				for(Field f : declaredFields){
					// 类中的成员变量为private,故必须进行此操作  
					f.setAccessible(true);
					for(String type : types){
						// 判断每个字段的类型
						if(f.getType().getName().equals(type)){
							// 判断出字段的类型了之后，开始赋值
							switch(type){
							case "char" : f.set(newInstance, resultSet.getCharacterStream(f.getName())); break;
							case "byte" : f.set(newInstance, resultSet.getByte(f.getName())); break;
							case "short" : f.set(newInstance, resultSet.getShort(f.getName())); break;
							case "int" : f.set(newInstance, resultSet.getInt(f.getName())); break;
							case "long" : f.set(newInstance, resultSet.getLong(f.getName())); break;
							case "float" : f.set(newInstance, resultSet.getFloat(f.getName())); break;
							case "double" : f.set(newInstance, resultSet.getDouble(f.getName())); break;
							case "boolean" : f.set(newInstance, resultSet.getBoolean(f.getName())); break;
							case "java.lang.String" : f.set(newInstance, resultSet.getString(f.getName()));break;
							default:f.set(newInstance, resultSet.getString(f.getName()));break;
							}
						}
					}
				}
				// 把每一个对象都加入到一个集合当中
				objectList.add(newInstance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 返回的结果集
		return objectList;
	}

	/**
	 * 打印学生信息
	 */
	public static void print(List<Object> objectList) {
		for (Object s : objectList) {
			System.out.println(s);
		}
	}
}
