package day6_2;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone  phone = new Phone("��ɫ");
		Battery  battery = new Battery("��ë��");
		
		phone.playMusic(phone.downLoadMusic());
		phone.charge(battery);

	}

}
