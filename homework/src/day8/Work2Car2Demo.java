package day8;


class Car2{
	private String engine; 
	private String wheel;
	
	public Car2(String engine, String wheel) {
		this.engine = engine;
		this.wheel = wheel;
	}

	public void driving() {
		System.out.println("��������ʻ��...");
	}

	public void brake() {
		System.out.println("��������ɲ��...");
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
		System.out.println("��������ʻ��...");
	}
	@Override
	public void brake() {
		System.out.println("������ɲ��...");
	}
	public void pullGoods() {
		System.out.println("����������");
	}
	public void discharge() {
		System.out.println("����ж����");
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
		System.out.println("����˺öడ,����������ʻ��������˾�����˵��...");
	}

	@Override
	public void brake() {
		System.out.println("���ȷ��ã����ҳ�����ɲ���� ");
	}

	public void reportStation () {
		System.out.println("��ֱ��վ����");
	}
	
	public void stopsStation () {
		System.out.println("���³�, ��Ҫб������");
	}

}



public class Work2Car2Demo {

	public static void main(String[] args) {
		Car2 car2 = new Car2("����", "������");
		car2.driving();
		car2.brake();
		
		Bus2 bus2 = new Bus2("����", "������", "�����", 10000);
		bus2.driving();
		bus2.brake();
		bus2.reportStation();
		bus2.stopsStation();
		
		Truck2 truck2 = new Truck2("����","������", "����", 30 );
		truck2.driving();
		truck2.brake();
		truck2.pullGoods();
		truck2.discharge();

	}

}
