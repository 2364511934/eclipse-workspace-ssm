package day7;

public class Work1StudentDemo {

	public static void main(String[] args) {
		Work1Student Student1  = new Work1Student().setId(1).setName("yn").setSex("��");
		Work1Student Student2  = new Work1Student().setId(2).setName("yk").setSex("Ů");
		
		System.out.println(Student1.getName() + "���"+ 10 + "��ʣ����� "+ Student1.mark(10));
		System.out.println(Student2.getName() + "���"+ 29 + "��ʣ����� "+ Student2.mark(29));
		

	}

}
