package day7;

public class Work1Student {
	private int id;
	private String sex;
	private String name;
	public int getId() {
		return id;
	}
	public Work1Student setId(int id) {
		this.id = id;
		return this;
	}
	public String getSex() {
		return sex;
	}
	public Work1Student setSex(String sex) {
		this.sex = sex;
		return this;
	}
	public String getName() {
		return name;
	}
	public Work1Student setName(String name) {
		this.name = name;
		return this;
	}
	
	public static int mark(int day) {
		return 1000 - day*3;
	}
	
}
