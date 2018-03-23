package day9;

interface Usb{
	void dataTrans();
}

class Tel implements Usb{

	@Override
	public void dataTrans() {
		System.out.println("给手机传数据");
		
	}
	
}

class Computer implements Usb{

	@Override
	public void dataTrans() {
		System.out.println("给电脑传数据");
		
	}
	
}


public class UsbDemo {

	public static void main(String[] args) {
		Usb tel = new Tel ();
		Usb computer = new Computer();
		
		tel.dataTrans();
		computer.dataTrans();

	}

}
