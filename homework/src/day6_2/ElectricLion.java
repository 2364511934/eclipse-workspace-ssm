package day6_2;
/**
 * 电动狮子类
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
		System.out.println(color + ":" + brand + ":" + price + "跑");
	}
	public void call() {
		System.out.println("听到叫声");
	}
}
