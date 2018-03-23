package day13;

class Gc{

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("*******************************");
	}
	
}

public class GcDemo {

	public static void main(String[] args) {
		Gc gc = new Gc();
		gc = null;

	}

}
