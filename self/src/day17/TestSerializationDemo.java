package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int no;
	String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + "]";
	}
	
}

public class TestSerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream os = new FileOutputStream("D:/student.txt"); 
		ObjectOutputStream oos = new ObjectOutputStream(os);
		Student[] stuArr = new Student[2];
		Student student = new Student(200, "ÄãºÃÂð");
		Student student2 = new Student(300, "ÄãºÃ");
		/*stuArr[0] = student;
		stuArr[1] = student2;
		oos.writeObject(stuArr);*/
		oos.writeObject(student);
		oos.writeObject(student2);
		oos.close();
		
		FileInputStream is = new FileInputStream("D:/student.txt"); 
		ObjectInputStream ois = new ObjectInputStream(is);
		
		student = null;
		student = (Student)ois.readObject();
		System.out.println(student);
//		student2 = (Student)ois.readObject();
		System.out.println(ois.readObject().getClass().getName());
		System.out.println(student2);
		
		
		//Student[] stuArr = new Student[2];
		/*stuArr[0] = null;
		stuArr[1] = null;
		stuArr = (Student[])ois.readObject();
		System.out.println(stuArr[0]);
		System.out.println(stuArr[1]);*/
		ois.close();

	}

}
