package day9;

interface IA{
	public static void fs() {
		System.out.println("IA-fs ��̬����");
	}
	
	public default void fd() {
		System.out.println("IA-fd Ĭ�Ϸ���");
	}
	
	void f();
}
interface IB{
	public static void fs() {
		System.out.println("IB-fs ��̬����");
	}
	
	public default void fd() {
		System.out.println("IB-fd Ĭ�Ϸ���");
	}
	
	void f();
}


class CC implements IA, IB{

	@Override
	public void f() {
		System.out.println("f���븲�� ");		
	}
	
	IA ia = new IA(){
		@Override
		public void f() {
			System.out.println("fa���븲�� ");		
		}
	};
	
	IB ib = new IB(){
		@Override
		public void f() {
			System.out.println("fb���븲�� ");		
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
		System.out.println("CC ���� IA IB Ĭ�Ϸ���");
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
