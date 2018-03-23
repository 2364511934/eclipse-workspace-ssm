package jdbc_exam;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExam {

	// 添加 emp 一条语句
	public static int insertEmp() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		// 简写 可以插入多个字段 此处没有时间 简写了
		String sql = "insert into emp(empno) values(90000)";
		// 这是插入一条语句
		int ret = stmt.executeUpdate(sql);
		if (ret > 0) {
			System.out.println("插入一条数据成功");
		}
		else
		{
			System.out.println("插入一条数据失败");
		}
		stmt.close();
		conn.close();

		return 0;
	}

	// 查询 emp 内容
	public static int queryEmp() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		String sql = "select * from emp";
		// 这是执行查询
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job= rs.getString("job");
			int mgr = rs.getInt("mgr");
			java.sql.Date hiredate = rs.getDate("hiredate");
			BigDecimal  sal = rs.getBigDecimal("sal");
			BigDecimal  comm = rs.getBigDecimal("comm");
			int deptno = rs.getInt("deptno");
			System.out.println("empno:"+empno+"\tename:"+ename+"\tjob:"+job+
					           "\tmgr:"+mgr+"\thiredate:"+hiredate + "\tsal:"+sal+
					             "\tcomm:"+comm+"\tdeptno:"+deptno);
		}

		rs.close();
		stmt.close();
		conn.close();

		return 0;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insertEmp();
		queryEmp();

	}

}
