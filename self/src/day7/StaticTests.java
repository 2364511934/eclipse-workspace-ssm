package day7;


class StaticSuper {
	static {
		System.out.println("super static block");   // 第一步运行
	}
	
	StaticSuper(){
		System.out.println("super constructor");    // 第四步运行
	}

}
public class StaticTests extends StaticSuper {
//public class StaticTests  {
	static int rand;
	
	static {
		rand = (int)(Math.random() * 6);
		System.out.println("static block " +rand);   // 第二步运行
	}
	
	StaticTests(){
		System.out.println("constructor");           // 第五步运行
	}
	
	public static void main(String[] args) {
		System.out.println("in main");                // 第三步运行
		StaticTests st = new StaticTests();
		
		/* 最后运行结果
		 * super static block
			static block 1
			in main
			super constructor
			constructor
		 * */
	}
}


