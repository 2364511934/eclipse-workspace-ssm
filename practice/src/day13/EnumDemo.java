package day13;


enum Color{
	RED(1,"红色") {
		@Override
		void f() {
			// TODO  Auto-generated method stub
			
		}
	},GREEN(2,"绿色") {
		@Override
		void f() {
			// TODO Auto-generated method stub
			
		}
	},BLUE(3,"蓝色") {
		@Override
		void f() {
			// TODO Auto-generated method stub
			
		}
	};
	
	private Color(int no, String name) {
		this.no = no;
		this.name = name;
	}
	private int no;
	private String name;
	//抽象方法
	abstract void f();
}


public class EnumDemo {

	public static void main(String[] args) {
		Color c = Color.valueOf("RED");
		System.out.println(c);
		String str = 1+"";
		String str2 = ""+3;
		/*char[] ch1 = str.toCharArray();
		char[] ch2 = str2.toCharArray();*/
		
		System.out.println(Color.RED.getClass().getName());
		System.out.println(Color.BLUE.getClass().getName());
		System.out.println(Color.GREEN.getClass().getName());
		
		//System.out.println(ch1.toString());
	}

}
