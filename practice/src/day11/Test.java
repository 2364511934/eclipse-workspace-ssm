package day11;
interface IA{
	void fv();
}
interface IB{
	void fv();
}
class Demo3 implements IA,IB{
	
	
	@Override
	public void fv() {
		System.out.println("fv");
	}
	
	IA ia = new IA() {
		public void fv() {
		System.out.println("ia_fv");
		}
	};
	IB ib = new IB() {
		public void fv() {
		System.out.println("ib_fv");
		}
	};	
	public void show() {
		new IA() {
			public void fv() {
				System.out.println("ia_fv");
			}
		}.fv();
		
		new IB() {
			public void fv() {
				System.out.println("ib_fv");
			}
		}.fv();
	}
}
public class Test {
	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
		demo3.ia.fv();
		demo3.ib.fv();
		demo3.show();
		
		new Demo3() {
			public void fv() {
				System.out.println("ia_fv");
			}
		}.fv();

	}

}
