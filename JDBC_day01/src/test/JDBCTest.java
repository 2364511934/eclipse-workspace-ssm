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
	// 1. 借助于DriverManager实现驱动的注册
	DriverManager.registerDriver(new Driver());  // 仅仅是new Driver() 是调用 com.mysql.jdbc.Driver;
	// 2. 建立连接
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:bd1711", "root", "root");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
	//Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711","root" , "root");
	System.out.println(conn);
	//Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
	
	// 3.  借助于 Statement 发送 发送指定
	String sql = "select * from emp";
	// 创建Statement的实现类的对象
	Statement stmt = conn.createStatement();
	
	// 发送sql语句 返回结果集
	ResultSet rs =  stmt.executeQuery(sql);
	
	// 4 .结果集的处理(游标的处理方式)
	while(rs.next()) { //遍历每一行的数据
		// 一次获取每一列的数据  
		int empno = rs.getInt("empno");  // 可以  rs.getInt(1)
		String ename = rs.getString("ename");
		System.out.println("empno:" + empno + " ename:"+ename);
	}
	// 5.释放资源
	rs.close();
	stmt.close();
	conn.close();
	
	
	
	}

}
