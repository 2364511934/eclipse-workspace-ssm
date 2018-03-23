package day15;

import java.util.ArrayList;
import java.util.List;

class Grade {
	private String name;
	private int age;
	private double score;
	private int classNum;

	public Grade(String name, int age, double score, int classNum) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.classNum = classNum;
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

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", age=" + age + ", score=" + score + ", classNum=" + classNum + "]";
	}

}

public class ClassDemo {

	public static void main(String[] args) {
		Grade g1 = new Grade("class1_name1", 10, 3434.9, 1);
		Grade g2 = new Grade("class1_name1", 14, 34334.9, 1);
		Grade g3 = new Grade("class1_name1", 1213, 2323.9, 1);
		Grade g4 = new Grade("class1_name1", 12, 2323.9, 1);
		
		Grade g5 = new Grade("class1_name2", 10, 3434.9, 2);
		Grade g6 = new Grade("class1_name2", 14, 34334.9, 2);
		Grade g7 = new Grade("class1_name2", 1213, 2323.9, 2);
		Grade g8 = new Grade("class1_name2", 12, 2323.9, 2);
		
		List<Grade>  gradeList = new ArrayList<>();
		gradeList.add(g1);
		gradeList.add(g2);
		gradeList.add(g3);
		gradeList.add(g4);
		gradeList.add(g5);
		gradeList.add(g6);
		gradeList.add(g7);
		gradeList.add(g8);
		
		int sum  = 0;
		for(int i=0; i<gradeList.size(); i++) {
			sum += gradeList.get(i).getAge();
		}
		
		System.out.println("平均年龄: "+ sum/gradeList.size());
		
		int sum1  = 0;
		for(int i=0; i<gradeList.size(); i++) {
		if (gradeList.get(i).getClassNum() == 1) 
				sum1 += gradeList.get(i).getScore();
		}
		System.out.println("1班平均成绩: "+ sum1/gradeList.size());
		
		int sum2  = 0;
		for(int i=0; i<gradeList.size(); i++) {
		if (gradeList.get(i).getClassNum() == 2) 
				sum1 += gradeList.get(i).getScore();
		}
		System.out.println("2班平均成绩: "+ sum1/gradeList.size());

	}

}
