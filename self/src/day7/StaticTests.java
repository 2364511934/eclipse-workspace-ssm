package day7;


class StaticSuper {
	static {
		System.out.println("super static block");   // ��һ������
	}
	
	StaticSuper(){
		System.out.println("super constructor");    // ���Ĳ�����
	}

}
public class StaticTests extends StaticSuper {
//public class StaticTests  {
	static int rand;
	
	static {
		rand = (int)(Math.random() * 6);
		System.out.println("static block " +rand);   // �ڶ�������
	}
	
	StaticTests(){
		System.out.println("constructor");           // ���岽����
	}
	
	public static void main(String[] args) {
		System.out.println("in main");                // ����������
		StaticTests st = new StaticTests();
		
		/* ������н��
		 * super static block
			static block 1
			in main
			super constructor
			constructor
		 * */
	}
}


