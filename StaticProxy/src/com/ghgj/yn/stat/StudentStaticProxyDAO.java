package com.ghgj.yn.stat;

public class StudentStaticProxyDAO implements DAO {
	private StudentDAO studentDAO;
	public StudentStaticProxyDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	@Override
	public void insert(Object object) {
		studentDAO.insert(object);
		System.out.println("proxy:插入成功了一条记录");
	}

}
