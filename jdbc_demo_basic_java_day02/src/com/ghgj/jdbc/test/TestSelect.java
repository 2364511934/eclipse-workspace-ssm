package com.ghgj.jdbc.test;

import java.util.List;

import com.ghgj.jdbc.pojo.Student;
import com.ghgj.jdbc.util.JDBCUtil;
import com.ghgj.jdbc.util.JDBCUtil2;
import com.ghgj.jdbc.util.JDBCUtil3;
import com.ghgj.jdbc.util.ResultSetUtil;

/**
 * 此测试类，只测试查询方法
 */
public class TestSelect {

	public static void main(String[] args) throws Exception {
		
		/**
		 * 第一次，直接使用原声的JDBC API，并且使用最简单直接的方式查询数据, 也就是直接跑JDBC_SELECT程序
		 */
		
		/**
		 * 第二次，封装拿数据库连接和释放资源的代码，解决代码重复编写的问题
		 */
		JDBCUtil.testSelect();
		
		/**
		 * 第三次，解决SQL语句的硬编码问题, 现在已经可以指定从那张表查询那些字段了。 但是还不可以指定条件
		 */
		// select id, name, sex, age, department from student;
		JDBCUtil2.testSelectColumns("student", "id","name", "department");
		
		/**
		 * 第四次，解决查询的时候不能添加查询条件的问题, 但是结果集不爽。依然需要从ResultSet中进行遍历获取
		 */
//		JDBCUtil2.testSelectWithParams(0, null, null, 0, null);
		JDBCUtil2.testSelectWithParams(0, null, "女", 0, "CS");
		
		// 基本上实现了 MyBatis的封装思想，最好的方式还应该把SQL提取放置在配置文件
		
		/**
		 * 第五次，解决参数复杂性的问题
		 */
		Student student = new Student();
		student.setDepartment("CS");
		JDBCUtil2.testSelectWithParams(student);
		
		/**
		 * 第六次，解决结果集的问题,通过掉用ResultSetUtil.transformResultSetToList方法把ResultSet转换成List<Object>
		 * 这其中用到了表和类型的映射，也就是表名 对应 类名， 表字段 对应 类属性
		 * 问题：参数问题
		 */
		Student student1 = new Student();
		student1.setDepartment("CS");
		List<Object> selectResultSetWithParams = JDBCUtil2.getSelectResultSetWithParams(student1);
		ResultSetUtil.print(selectResultSetWithParams);
		
		/**
		 * 第七次 解决参数问题
		 * 问题：但是只能操作Student表，不通用
		 */
		Student student2 = new Student();
//		student2.setDepartment("CS");
		List<Object> selectStudent = JDBCUtil3.selectStudent(student2);
//		ResultSetUtil.print(selectStudent);
		
		/**
		 * 第八次，解决代码的通用问题
		 * 最大的好处就是：可以根据参数自动按条件从对应的表中查出所需要的数值，并且提供一个友好的结果集
		 */
		// 按条件查询student表
		Student student3 = new Student();
		student3.setDepartment("MA");
		student3.setSex("女");
		List<Object> selectStudent2 = JDBCUtil3.select(student3);
		ResultSetUtil.print(selectStudent2);
		
		// 完整实现了hibernate的封装思想
		
		// 按条件查询course表
//		Course course = new Course();
//		course.setTeacher("zoulaoshi");
//		course.setCourse("math");
//		List<Object> selectCourse = JDBCUtil3.select(course);
//		ResultSetUtil.print(selectCourse);
		
		/**
		 * 还遗留的问题：
		 * 1、jdbc链接的问题。每个方法执行一次就获取一次，方法执行完就释放，
		 * 	    容易造成频繁的资源获取和释放，消耗服务器性能----通过连接池解决
		 * 2、只能做简单事务控制，没法做复杂事务控制----改造代码
		 * 3、表名 和 类名 只能一样 ---- 把映射做成可自定义，提高通用性
		 * 4、表字段名 和 类属性名 只能一致 ---- 把映射做成可自定义，提高通用性
		 * 5、无法解决复杂类型的映射 ---- 完善代码的复杂度
		 * 6、无法解决一对一，一对多，多对多的复杂关系查询 ---- 完善代码的复杂度
		 */
		
		/**
		 * 继续改造 ........
		 */
	}
}
