package com.ghgj.mazh.reflect;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午6:47:37 
 * 
 * 描述: 用来做反射的通用pojo类
 */
public class Student extends Person implements Male, Female{

	// 私有 long 类型成员属性
	private long id;
	// 共有 string 类型成员属性
	public String name;

	/**
	 * getter 和  setter 方法
	 */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	/**
	 * 公开的 带 int 和  string 类型参数的 构造方法
	 */
	public Student(long id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("************");
	}
	
	/**
	 * 公开的带 long 类型参数的 构造方法
	 */
	public Student(long id) {
		this.id = id;
	}
	
	/**
	 * 私有的带 string 类型参数的构造方法
	 */
	private Student(String name) {
		this.name = name;
		this.id = 222;
	}

	/**
	 * 无参构造
	 */
	public Student() {
		super();
		this.id = 100;
	}
	
	/**
	 * 普通私有方法，  不带参数
	 */
	private String getSomeThing() {
		return name;
	}
	
	/**
	 * 普通私有方法，带参数
	 */
	private String getSomeThing(String name) {
		return "hello :"+ name;
	}
}
