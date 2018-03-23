package day8;


class Employee{
	private int id;
	private String sex;
	private String name;
	private String duty;
	private double salary;
	private int holidays;
	
	public Employee(int id, String sex, String name, String duty, double salary, int holidays) {
		this.id = id;
		this.sex = sex;
		this.name = name;
		this.duty = duty;
		this.salary = salary;
		this.holidays = holidays;
	}

	public void display() {
		System.out.println(name +": " + sex + " " + duty);
	}
	
	public int getDecMoney(int day) {
		if (day <= holidays) {
			return  30*day;
		}
		else {
			return 50*day;
		}
		
	}

	public int getHolidays() {
		return holidays;
	}

	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}
	
	
	
}

class Director extends Employee{
	private String assistantName;

	public Director(int id, String sex, String name, String duty, double salary, int holidays, String assistantName) {
		super(id, sex, name, duty, salary, holidays);
		this.assistantName = assistantName;
	}

	@Override
	public int getDecMoney(int day) {
		if (day <= getHolidays()) {
			return  50*day;
		}
		else {
			return 80*day;
		}
	}
	
}

public class Work3Employee {

	public static void main(String[] args) {
		Employee employee = new Employee(1, "男", "张三", "大数据开发工程师", 10000.0, 3);
		employee.display();
		System.out.println("扣款: "+ employee.getDecMoney(10));
		Director director = new Director(12, "女", "鬼父", "架构师", 109000.0, 10, "小蜜");
		director.display();
		System.out.println("扣款: "+ director.getDecMoney(20));
	}

}
