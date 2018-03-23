package day9;


abstract class Employee{
	private int id;
	private String name;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public abstract void jobDes();
	
}

class ProjectManager extends Employee{
	private int bonus;  
	
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public void jobDes() {
		System.out.println(getId()+ ","+getName()+ "工资：" + 
	     getSalary()+"奖金" + getBonus()+","+"做管理工作");
		
	}

	public ProjectManager(int id, String name, int salary, int bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public void playFootball() {
		System.out.println("在踢足球");
	}
}

class Programmer extends Employee{
	public Programmer(int id, String name, int salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void jobDes() {
		System.out.println(getId()+ ","+getName()+ " 工资：" + 
			     getSalary()+" 做开发编码工作");
	}


	public void reading() {
		System.out.println("在看书");
	}
}

class Test{
	public void testJobDesc(Employee employee) {
		employee.jobDes();
	}
}

public class Work1EmployeeDemo {
	public static void main(String[] args) {
		Test test = new Test();
		ProjectManager projectManager = new ProjectManager(1, "王经理", 200000, 200);
		Programmer programmer = new Programmer(1, "小王", 200);
		test.testJobDesc(projectManager);
		test.testJobDesc(programmer);
		
	}
}
