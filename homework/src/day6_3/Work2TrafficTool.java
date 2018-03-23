package day6_3;
/**
 * 
 * @author Administrator
 *
 */
public class Work2TrafficTool {
	private int speed; 
	private int size;
	
	Work2TrafficTool(int speed,int size){
		this.size = size;
		this.speed = speed;
	}
	
	public void run() {
		System.out.println(size + "的交通工具以" + speed +"的速度行驶");
	}
	
	public int accelerate (int speed) {
		this.speed += speed;
		return this.speed;
	}
	public int deceleration (int speed) {
		this.speed -= speed;
		if(this.speed < 0) {
			this.speed = 0;
		}
		return this.speed;
	}
	

}
