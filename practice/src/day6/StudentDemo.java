package day6;

public class StudentDemo {
	//public static void main(String[] args) {
	public static void main(String ...args) {
		Student[] stu = new Student[3];
		stu[0] = new Student();
		stu[1] = new Student();
		stu[2] = new Student();
		
		StudentMgr smgr = new StudentMgr();
		
		smgr.average(stu);
	}
}
