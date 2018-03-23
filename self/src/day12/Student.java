package day12;

class Stu{
	int age = 10;
	{
		age = 20;
		dummy();
	}
	
	public void dummy() {
		System.out.println("HHHHHHHHHHHHHHH");
	}
}

public class Student {

	public static void main(String[] args) {
		Stu stu = new Stu();
		//stu.dummy();
	}

}
