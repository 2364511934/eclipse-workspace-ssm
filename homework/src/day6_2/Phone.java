package day6_2;

public class Phone {
	private String color;
	
	Phone(String color){
		this.color = color;
	}
	public String downLoadMusic() {
		return "����-�ɶ�";
	}
	
	public void playMusic(String music) {
		System.err.println("���ڲ���" + music + "����");
		return ;
	}
	
	public void charge(Battery battery) {
		battery.powerStorage();
		return  ;
	}
}
