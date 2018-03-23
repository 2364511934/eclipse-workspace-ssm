package day6_2;

public class Phone {
	private String color;
	
	Phone(String color){
		this.color = color;
	}
	public String downLoadMusic() {
		return "赵雷-成都";
	}
	
	public void playMusic(String music) {
		System.err.println("正在播放" + music + "音乐");
		return ;
	}
	
	public void charge(Battery battery) {
		battery.powerStorage();
		return  ;
	}
}
