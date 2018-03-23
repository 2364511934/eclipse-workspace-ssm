package day6_3;
/**
 * 
 * @author Administrator
 *
 */
public class Work3Student {
	private String no="2222";
	private String name;
	private int age;
	{
		no="0000";
	}
	
	public Work3Student(String no, String name, int  age){
		this(name,age);
		this.no= no;
	}
	
	public Work3Student(String name, int  age){
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(no + " " + name + " " + age );
	}
	
}
