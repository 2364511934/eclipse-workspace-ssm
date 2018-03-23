package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import org.gjt.mm.mysql.Driver;

import com.mysql.jdbc.Driver;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {
	// 1. ������DriverManagerʵ��������ע��
	DriverManager.registerDriver(new Driver());  // ������new Driver() �ǵ��� com.mysql.jdbc.Driver;
	// 2. ��������
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:bd1711", "root", "root");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711","root" , "root");
	System.out.println(conn);
	//Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
	
	// 3.  ������ Statement ���� ����ָ��
	String sql = "select * from emp";
	// ����Statement��ʵ����Ķ���
	Statement stmt = conn.createStatement();
	
	// ����sql��� ���ؽ����
	ResultSet rs =  stmt.executeQuery(sql);
	
	// 4 .������Ĵ���(�α�Ĵ���ʽ)
	while(rs.next()) { //����ÿһ�е�����
		// һ�λ�ȡÿһ�е�����  
		int empno = rs.getInt("empno");  // ����  rs.getInt(1)
		String ename = rs.getString("ename");
		System.out.println("empno:" + empno + " ename:"+ename);
	}
	// 5.�ͷ���Դ
	rs.close();
	stmt.close();
	conn.close();
	
	
	
	}

}
