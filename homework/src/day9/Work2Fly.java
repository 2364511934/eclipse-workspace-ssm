package day9;

interface IFly{
	void fly();
}

class Plane implements IFly{

	@Override
	public void fly() {
		System.out.println("我是飞行员 我在高空飞翔");
		
	}
	
}

class Spadger  implements IFly{

	@Override
	public void fly() {
		System.out.println("我是麻雀，飞机特别怕我");
	}
	
}

class FlyTest {
	public static void testIFly(IFly fly) {
		fly.fly();
	}
}


public class Work2Fly {

	public static void main(String[] args) {
		Plane plane = new Plane();
		Spadger spadger = new Spadger();
		FlyTest.testIFly(plane);
		FlyTest.testIFly(spadger);
	}

}
