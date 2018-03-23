package day6;
/**
 * 
 * @author Administrator
 *
 */
public class Flour {
	private String type;
	private int weight;
	private String soup;
	{
		type="酸辣面";
		weight = 2;
		soup = "带汤的";
	}
	
	public Flour(String type, int weight, boolean soup){
		this(type, weight);
		this.soup = soup ? "带汤的" : "不带汤";
	}
	
	public Flour(String type, int weight){
		this.type=type;
		this.weight = weight;
	}
	
	public Flour(){
		
	}
	
	public void show() {
		System.out.println(type + ", " + weight + ", " + soup);
	}
}
