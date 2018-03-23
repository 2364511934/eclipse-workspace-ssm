package day13;

import java.util.Arrays;
import java.util.Comparator;

class Employee {
	private String name;
	private int age;

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

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "名字: " + name + "," + "年龄 : " + age;
	}

}

class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		}

		return o1.getAge() - o2.getAge();
	}

}

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee employee1 = new Employee("aa", 60);
		Employee employee2 = new Employee("aa", 30);
		Employee employee3 = new Employee("ab", 20);
		Employee employee4 = new Employee("ac", 20);
		Employee employee5 = new Employee("bc", 440);
		Employee[] emps = new Employee[] { employee1, employee2, employee3, employee4, employee5 };

		EmployeeComparator employeeComparator = new EmployeeComparator();

		// 方法一
		Arrays.sort(emps, employeeComparator);

		// 方法二
		Arrays.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if (o1.getName().compareTo(o2.getName()) > 0) {
					return 1;
				} else if (o1.getName().compareTo(o2.getName()) < 0) {
					return -1;
				}

				return o1.getAge() - o2.getAge();
			}
		});

		// 方法三
		Arrays.sort(emps, (o1, o2) -> {
			if (o1.getName().compareTo(o2.getName()) > 0) {
				return 1;
			} else if (o1.getName().compareTo(o2.getName()) < 0) {
				return -1;
			}
			return o1.getAge() - o2.getAge();
		});

		// 方法三
		Arrays.sort(emps, (o1, o2) -> {
			int n = o1.getName().compareTo(o2.getName());
			if( 0 == n) {
				n = o1.getAge() - o2.getAge();
			}
			return n;
		});

		/*
		 * if(o1.getName().compareTo(o2.getName()) > 0 ) { return 1; } else
		 * if(o1.getName().compareTo(o2.getName()) <0){ return -1; }
		 * 
		 * return o1.getAge() - o2.getAge(); } });
		 */

		/*
		 * for(Employee e : emps) { System.out.println(e); }
		 */
		Arrays.stream(emps).forEach(System.out::println);
	}

}
