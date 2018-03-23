package day11_1;

interface ILa{
	void show();
}

class ILaIml{
	ILa ila = new ILa() {
		public void show() {
			System.out.println("This is a Lambda expression");
		}
	};
}

public class Work2Lambda {

	public static void main(String[] args) {
		ILaIml ilaIml = new ILaIml();
		ilaIml.ila.show();
		ILa ila = ()->{System.out.println("This is a Lambda expression");};
		ila.show();
		ILa ila2 = ()->System.out.println("This is a Lambda expression");
		ila.show();

	}

}
