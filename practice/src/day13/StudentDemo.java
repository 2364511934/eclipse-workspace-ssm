package day13;

import java.util.Arrays;

class Student implements Comparable<Student>
{
	private String name ;
	private int score;
	
	
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Student(int score) {
		this.score = score;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public int compareTo(Student o) {
		
		return o.score - this.score;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "姓名:"+ name + " 分数: "+score;
	}
	
	
	
}

public class StudentDemo {

	public static void main(String[] args) {
		Student st1 = new Student("张三", 300);
		Student st2 = new Student("张四", 302);
		Student st3 = new Student("张五", 340);
		
		Student[] stus = new Student[]{st1, st2, st3};
		
		Arrays.sort(stus);
		/*for(Student st: stus) {
			System.out.println(st.toString());
		}*/
		
		Arrays.stream(stus).forEach(System.out::println);
		

	}

}
