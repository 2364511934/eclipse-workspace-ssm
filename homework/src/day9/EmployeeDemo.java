package day9;

import java.util.Scanner;

abstract class Employee1{
	private int id;
	private String sex;
	private String name;
	private String duty;
	private double salary;
	private int holidays;
	
	public abstract int getSubsidy(int day);
	
	public Employee1(int id, String sex, String name, String duty, double salary, int holidays) {
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
	

	public int getHolidays() {
		return holidays;
	}

	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}
	
	
	
}

class NormalEmployee extends Employee1{
	public NormalEmployee(int id, String sex, String name, String duty, double salary, int holidays) {
		super(id, sex, name, duty, salary, holidays);
	}

	@Override
	public int getSubsidy(int day) {
		if (day <= 3) {
			return  20*(30-day);
		}
	
		return 15*(30-day);		
	}
	
}
class Director extends Employee1{
	private String assistantName;

	public Director(int id, String sex, String name, String duty, double salary, int holidays, String assistantName) {
		super(id, sex, name, duty, salary, holidays);
		this.assistantName = assistantName;
	}

	@Override
	public int getSubsidy(int day) {
		if (day <= 3) {
			return  30*(30-day);
		}

		return 20*(30-day);		
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NormalEmployee normalEmployee = new NormalEmployee(1, "男", "张三", "大数据开发工程师", 10000.0, 3);
		normalEmployee.display();
		System.out.println("请输入正常员工的请假天数:");
		System.out.println("奖金为: " + normalEmployee.getSubsidy(input.nextInt()));
		
		
		Director director = new Director(12, "女", "鬼父", "架构师", 109000.0, 10, "小蜜");
		director.display();
		System.out.println("请输入管理者的请假天数:");
		System.out.println("奖金为: " + director.getSubsidy(input.nextInt()));
		
		
	}

}
