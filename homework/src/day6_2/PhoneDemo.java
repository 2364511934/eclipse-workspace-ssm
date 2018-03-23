package day6_2;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone  phone = new Phone("ºìÉ«");
		Battery  battery = new Battery("·ÉÃ«ÍÈ");
		
		phone.playMusic(phone.downLoadMusic());
		phone.charge(battery);

	}

}
