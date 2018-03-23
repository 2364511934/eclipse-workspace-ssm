package day7;

public class Work1StudentDemo {

	public static void main(String[] args) {
		Work1Student Student1  = new Work1Student().setId(1).setName("yn").setSex("男");
		Work1Student Student2  = new Work1Student().setId(2).setName("yk").setSex("女");
		
		System.out.println(Student1.getName() + "请假"+ 10 + "天剩余分数 "+ Student1.mark(10));
		System.out.println(Student2.getName() + "请假"+ 29 + "天剩余分数 "+ Student2.mark(29));
		

	}

}
