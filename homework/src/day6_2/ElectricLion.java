package day6_2;
/**
 * �綯ʨ����
 * @author Administrator
 *
 */
public class ElectricLion {
	private String color;
	private String brand;
	private double price;
	ElectricLion(String color, String brand, double price){
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	public void run() {
		System.out.println(color + ":" + brand + ":" + price + "��");
	}
	public void call() {
		System.out.println("��������");
	}
}
