package com.ghgj.mazh.proxy;

import com.ghgj.mazh.reflect.Student;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:42:08 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class StudentStaticProxyDAO {

	private StudentDAO studentDAO;
	
	public StudentStaticProxyDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	public int insertStudent(Student student) {
		
		Logger.info("开始插入一个学生记录： " + student.toString());
		int number = studentDAO.insertStudent(student);
		Logger.info("插入 " + number + " 条学生记录");
		return number;
	}
}
