package day9;

interface IA{
	public static void fs() {
		System.out.println("IA-fs 静态方法");
	}
	
	public default void fd() {
		System.out.println("IA-fd 默认方法");
	}
	
	void f();
}
interface IB{
	public static void fs() {
		System.out.println("IB-fs 静态方法");
	}
	
	public default void fd() {
		System.out.println("IB-fd 默认方法");
	}
	
	void f();
}


class CC implements IA, IB{

	@Override
	public void f() {
		System.out.println("f必须覆盖 ");		
	}
	
	IA ia = new IA(){
		@Override
		public void f() {
			System.out.println("fa必须覆盖 ");		
		}
	};
	
	IB ib = new IB(){
		@Override
		public void f() {
			System.out.println("fb必须覆盖 ");		
		}
	};
	public CC() {
		IA.fs();
		IB.fs();
	}

	@Override
	public void fd() {
		// TODO Auto-generated method stub
		IA.super.fd();
		IB.super.fd();
		System.out.println("CC 覆盖 IA IB 默认方法");
	}

}


public class AbstractDemo {

	public static void main(String[] args) {
		CC cc = new CC();
		cc.ia.f();
		cc.ib.f();
		cc.f();

	}

}
