package day18_zonghe.collection;

import java.util.Arrays;

class Student{
	private int sNO;
	private String sName;
	private String sSex;
	private int sAge;
	private double sJava;
	public Student(int sNO, String sName, String sSex, int sAge, double sJava) {
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	public int getsNO() {
		return sNO;
	}
	public void setsNO(int sNO) {
		this.sNO = sNO;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsSex() {
		return sSex;
	}
	public void setsSex(String sSex) {
		this.sSex = sSex;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public double getsJava() {
		return sJava;
	}
	public void setsJava(double sJava) {
		this.sJava = sJava;
	}
	@Override
	public String toString() {
		return "Student [sNO=" + sNO + ", sName=" + sName + ", sSex=" + sSex + ", sAge=" + sAge + ", sJava=" + sJava
				+ "]";
	}
	
}
public class Work4 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "name1", "��", 20, 3434.9);
		Student student2 = new Student(2, "name2", "Ů", 40, 334.9);
		Student student3 = new Student(3, "name3", "��", 70, 3.9);
		Student student4 = new Student(4, "name4", "Ů", 20, 34.9);
		Student student5 = new Student(5, "name5", "��", 70, 64.9);
		
		Student[] stuArray = new Student[] {student1, student2, student3, student4, student5};
		
		double sum =0.0;
		double min = stuArray[0].getsJava();
		double max = stuArray[0].getsJava();
		for(Student s:stuArray) {
			if(min>s.getsJava()) {
				min = s.getsJava();
			}
			if(max < s.getsJava()) {
				max = s.getsJava();
			}
			sum += s.getsJava();
		}
		
		Arrays.stream(stuArray).forEach(System.out::println);
		System.out.println("���:" + max);
		System.out.println("��С:" + min);
		System.out.println("ƽ����:" + sum/stuArray.length);
	}
	

}
