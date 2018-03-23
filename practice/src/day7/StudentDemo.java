package day7;

class Student{
	private String name;
	static int apple = 6;
	
	static {
		{
			apple = 66;
		}
	}
	
	{
		apple = 20;
	}
	public static void staticStudent() {
		System.out.println("public static void staticStudent() ");
	}
	public Student(String name) {
		this.name = name;
	}

	public int take() {
		return --apple;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class StudentDemo {

	public static void main(String[] args) {
		Student Student1 = new Student("����");
		Student Student2 = new Student("����");
		Student Student3 = new Student("�");
		
		System.out.println(Student1.getName()+ "����һ��ƻ����ʣ:" + Student1.take());
		System.out.println(Student2.getName()+"����һ��ƻ����ʣ:" + Student2.take());
		System.out.println(Student3.getName()+"����һ��ƻ����ʣ:" + Student3.take());

	}

}
