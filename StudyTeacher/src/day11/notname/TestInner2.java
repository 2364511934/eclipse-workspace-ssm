package day11.notname;
abstract class Parent{
	String s ;
	Parent(String s){
		this.s = s;
	}
	public abstract void fa();//���󷽷�
	public abstract void fb();//���󷽷�
}
class Demo1{
	//������ static��
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
	//������abstract �ģ�����Ҫʵ�� ���еĳ��󷽷�
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
