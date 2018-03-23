package day8;


class Car2{
	private String engine; 
	private String wheel;
	
	public Car2(String engine, String wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}

	public void driving() {
		System.out.println("汽车在行驶中...");
	}

	public void brake() {
		System.out.println("汽车正在刹车...");
	}
}


class Truck2 extends Car2 {
	
	private String Warehouse;
	private int Load;
	
	
	public Truck2(String engine, String wheel, String warehouse, int load) {
		super(engine, wheel);
		Warehouse = warehouse;
		Load = load;
	}
	@Override
	public void driving() {
		System.out.println("货车在行驶中...");
	}
	@Override
	public void brake() {
		System.out.println("货车在刹车...");
	}
	public void pullGoods() {
		System.out.println("正在拉货呢");
	}
	public void discharge() {
		System.out.println("正在卸货呢");
	}
}

class Bus2 extends Car2 {
	private String Cabin;
	private int capacity;
	
	public Bus2(String engine, String wheel, String cabin, int capacity) {
		super(engine, wheel);
		Cabin = cabin;
		this.capacity = capacity;
	}

	@Override
	public void driving() {
		System.out.println("妈的人好多啊,公交车在行驶，请勿与司机大哥说话...");
	}

	@Override
	public void brake() {
		System.out.println("坐稳扶好，公家车正在刹车中 ");
	}

	public void reportStation () {
		System.out.println("西直门站到了");
	}
	
	public void stopsStation () {
		System.out.println("请下车, 不要斜穿猛跑");
	}

}



public class Work2Car2Demo {

	public static void main(String[] args) {
		Car2 car2 = new Car2("三菱", "美琪琳");
		car2.driving();
		car2.brake();
		
		Bus2 bus2 = new Bus2("三菱", "美琪琳", "大货仓", 10000);
		bus2.driving();
		bus2.brake();
		bus2.reportStation();
		bus2.stopsStation();
		
		Truck2 truck2 = new Truck2("奔驰","美琪琳", "金龙", 30 );
		truck2.driving();
		truck2.brake();
		truck2.pullGoods();
		truck2.discharge();

	}

}
