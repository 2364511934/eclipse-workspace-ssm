package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	private static final long serialVersionUID = 1L;
	String score;
	int no;
	//String name;
	int sss;
	
	public Student1(String score, int no, String name) {
		this.no = no;
		//this.name = name;
	}
	/*public Student1(int no, String name) {
		this.no = no;
		this.name = name;
	}*/
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	@Override
	public String toString() {
		return "Student [no=" + no + "]";
	}
	
}

public class TestSerializationDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*FileOutputStream os = new FileOutputStream("D:/student1.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(os);
		Student1 student = new Student1(200, "ÄãºÃÂð");
		oos.writeObject(student);
		oos.close();*/
		
		FileInputStream is = new FileInputStream("D:/student1.txt"); 
		ObjectInputStream ois = new ObjectInputStream(is);
		
		Student1 student = null;
		student = (Student1)ois.readObject();
		System.out.println(student);
	
		ois.close();

	}

}
