package day7;
/**
 * 学生类
 * @author Administrator
 *
 */
public class Work3Student {
	/**
	 * 学生名字
	 */
	private String name;
	private int water;
	{
		water = 0;
	}
	/**
	 * 饮水机
	 */
	private static int drinkingFountains;
	static {
		drinkingFountains = 1000;
	}
	public Work3Student(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	
	public static int getDrinkingFountains() {
		return drinkingFountains;
	}
	
	public int drink() {
		if(water < 0)
			return 0;
		water -=10;
		return water;
	}
	
	public void receiveWater() {
		drinkingFountains -=100;
		water = 100;
	}
	
}
