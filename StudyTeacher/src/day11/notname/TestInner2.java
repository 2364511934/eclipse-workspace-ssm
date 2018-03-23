package day11.notname;
abstract class Parent{
	String s ;
	Parent(String s){
		this.s = s;
	}
	public abstract void fa();//抽象方法
	public abstract void fb();//抽象方法
}
class Demo1{
	//可以是 static的
	static Parent p1 = new Parent("hello") {
		@Override
		public void fa() {
			System.out.println("fa");
		}
		@Override
		public void fb() {
			System.out.println("fb");
			
		}	
	};
	//不能是abstract 的，必须要实现 所有的抽象方法
	Parent p2 = new Parent("tom") {
		@Override
		public void fa() {
			System.out.println("faa");
		}

		@Override
		public void fb() {
			System.out.println("fb");
			
		}	
		
		
	};
	
	
}
public class TestInner2 {

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.p1.fa();
		demo1.p1.fb();
		demo1.p2.fa();
		demo1.p2.fb();

	}

}
