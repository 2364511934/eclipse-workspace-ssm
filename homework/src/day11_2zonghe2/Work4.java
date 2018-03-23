package day11_2zonghe2;

interface Vehicle{
	void start();
	void stop();
}

class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("自行车  开始");
		
	}

	@Override
	public void stop() {
		System.out.println("自行车  结束");
		
	}
	
}

class Bus implements Vehicle{

	@Override
	public void start() {
		System.out.println(" 公家车  开始");
		
	}

	@Override
	public void stop() {
		System.out.println("公交车  结束");
		
	}

}

public class Work4 {

	public static void main(String[] args) {
		Vehicle bus = new Bus ();
		Vehicle bike = new Bike ();
		bus.start();
		bus.start();
		bike.start();
		bike.stop();

	}

}
