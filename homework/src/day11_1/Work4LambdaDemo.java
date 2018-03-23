package day11_1;

interface ITaste{
	void taste();
	
}

interface IDrive{
	void drive(String wheather);
}

interface IAdd{
	int add(int a,int b);
}


class TestLa{
	
	void testITaste(ITaste itaste) {
		itaste.taste();
	}
	
	void testIDrive(IDrive idrive, String wheather) {
		idrive.drive(wheather);
	}
	
	void testIAdd(IAdd iadd, int a, int b) {
		int sum = iadd.add(a, b);
		System.out.println("�����:" + sum );
	}
	
}

public class Work4LambdaDemo {

	public static void main(String[] args) {
		
		TestLa testLa = new TestLa();
		
		testLa.testITaste(new ITaste() {
			@Override
			public void taste() {
				System.out.println("���ƻ��ζ������");
			}
			
		});
		
		testLa.testITaste(()-> System.out.println("���ƻ��ζ������"));
			
			
		testLa.testIDrive(new IDrive() {
			@Override
			public void drive(String wheather) {
				System.out.println(wheather);
			}
			
		}, "������������");
		
		testLa.testIDrive((wheather)->{System.out.println(wheather);}, "������������");
		
		testLa.testIAdd(new IAdd() {
			@Override
			public int add(int a,int b) {
				return a+b;
			}
		}, 10, 20);
		
		testLa.testIAdd((a,b)->{return a+b;}, 10, 20);


	}

}
