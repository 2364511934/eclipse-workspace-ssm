package jdbc_exam;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExam {

	// ��� emp һ�����
	public static int insertEmp() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		// ��д ���Բ������ֶ� �˴�û��ʱ�� ��д��
		String sql = "insert into emp(empno) values(90000)";
		// ���ǲ���һ�����
		int ret = stmt.executeUpdate(sql);
		if (ret > 0) {
			System.out.println("����һ�����ݳɹ�");
		}
		else
		{
			System.out.println("����һ������ʧ��");
		}
		stmt.close();
		conn.close();

		return 0;
	}

	// ��ѯ emp ����
	public static int queryEmp() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd1711", "root", "root");
		Statement stmt = conn.createStatement();
		String sql = "select * from emp";
		// ����ִ�в�ѯ
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
