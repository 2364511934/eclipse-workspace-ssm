package day6_2;
/**
 * 电池
 * @author Administrator
 *
 */
public class Battery {
	private String brand;
	Battery(String brand){
		this.brand = brand;
	}
	
	public void powerStorage() {
		System.out.println("正在充电中....");
	}
}
