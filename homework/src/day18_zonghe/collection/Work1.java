package day18_zonghe.collection;

import java.util.ArrayList;
import java.util.List;

class Worker{
	private String name;
	private int age;
	private double salary;
	
	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class Work1 {

	public static void main(String[] args) {
		Worker worker1 = new Worker("zhang3", 18, 3000);
		Worker worker2 = new Worker("li4", 25, 3500);
		Worker worker3 = new Worker("wang5", 22, 3200);
		List<Worker> list = new ArrayList<>();
		list.add(worker1);
		list.add(worker2);
		list.add(worker3);
		list.listIterator().forEachRemaining(System.out::println);
		
		System.out.println("******插入了赵六*********************");
		Worker worker4 = new Worker("zhao6", 24, 3300);
		list.add(list.indexOf(worker2), worker4);
		list.forEach(System.out::println);
		list.remove(worker3);
		System.out.println("**********移除了王五***********************");
		list.iterator().forEachRemaining(System.out::println);
		System.out.println("**********for遍历 ***********************");
		for(Worker worker:list) {
			System.out.println(worker);
		}

	}

}
