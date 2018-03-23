package com.ghgj.yn.reflect;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
	// ����һ�����
	private static int insertInternal(String sql) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1700", "root", "root");
		Statement stmt = conn.createStatement();
		int ret = stmt.executeUpdate(sql);
		if (ret > 0) {
			System.out.println("����һ�����ݳɹ�");
		} else {
			System.out.println("����һ������ʧ��");
		}
		stmt.close();
		conn.close();
		return 0;
	}

	public static boolean insert(Object obj)
			throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class objclass = obj.getClass();
		System.out.println(objclass);
		// �����õ�Book
		System.out.println(objclass.getSimpleName());
		System.out.println(objclass.getSimpleName().toLowerCase());

		StringBuffer sqlHead = new StringBuffer("insert into ");
		sqlHead.append(objclass.getSimpleName().toLowerCase() + "(");
		StringBuffer sqlTail = new StringBuffer("values(");
		String sql = "";
		Field[] fields = objclass.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
			sqlHead.append(f.getName());
			sqlHead.append(",");
			// ������� ��������
			System.out.println(f.getType());
			System.out.println(f.getType().toString());
			// ��ȡֵ
			f.setAccessible(true);
			System.out.println(f.get(obj));
			// ������ַ������� ��""
			if (f.getType().toString().equals("class java.lang.String")) {
				sqlTail.append(new String("\"" + f.get(obj) + "\"" + ","));
			} else {
				sqlTail.append(new String(f.get(obj) + ","));
			}
		}

		int index = sqlHead.lastIndexOf(",");
		sqlHead.setCharAt(index, ')');

		index = sqlTail.lastIndexOf(",");
		sqlTail.setCharAt(index, ')');

		/*
		 * System.out.println(sqlHead); System.out.println(sqlTail);
		 */

		sql = sqlHead + " " + sqlTail;
		System.out.println(sql);

		// ����һ�����
		insertInternal(sql);
		return true;
	}

	/*public static boolean select(Object obj) {
		Class objclass = obj.getClass();
		System.out.println(objclass);
		// �����õ�Book
		System.out.println(objclass.getSimpleName());
		System.out.println(objclass.getSimpleName().toLowerCase());

		StringBuffer sqlHead = new StringBuffer("insert into ");
		sqlHead.append(objclass.getSimpleName().toLowerCase() + "(");
		StringBuffer sqlTail = new StringBuffer("values(");
		String sql = "";
		Field[] fields = objclass.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f);
			sqlHead.append(f.getName());
			sqlHead.append(",");
			// ������� ��������
			System.out.println(f.getType());
			System.out.println(f.getType().toString());
			// ��ȡֵ
			f.setAccessible(true);
			System.out.println(f.get(obj));
			// ������ַ������� ��""
			if (f.getType().toString().equals("class java.lang.String")) {
				sqlTail.append(new String("\"" + f.get(obj) + "\"" + ","));
			} else {
				sqlTail.append(new String(f.get(obj) + ","));
			}
		}

		int index = sqlHead.lastIndexOf(",");
		sqlHead.setCharAt(index, ')');

		index = sqlTail.lastIndexOf(",");
		sqlTail.setCharAt(index, ')');

		
		 * System.out.println(sqlHead); System.out.println(sqlTail);
		 

		sql = sqlHead + " " + sqlTail;
		System.out.println(sql);

		// ����һ�����
		insertInternal(sql);
		return true;
	}
*/
}
