/** 
* 
*/
package com.ghgj.mazh.reflect;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:20:54 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class Person {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Person(int salary) {
		super();
		this.salary = salary;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [salary=" + salary + "]";
	}
	
}
