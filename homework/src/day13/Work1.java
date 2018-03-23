package day13;

class Box<T1 extends Object, T2 extends Object> {
	private T1 width;
	private T2 height;

	<E1 extends Object, E2 extends Object> Box(E1 e1, E2 e2) {
		System.out.println(e1);
		System.out.println(e2);
	}

	public T1 getWidth() {
		return width;
	}

	public void setWidth(T1 width) {
		this.width = width;
	}

	public T2 getHeight() {
		return height;
	}

	public void setHeight(T2 height) {
		this.height = height;
	}

}

public class Work1 {

	public static void main(String[] args) {
		Box<Double, Integer> box = new <String, Double>Box<Double, Integer>("444", 333.3);
		box.setHeight(300);
		box.setWidth(444.555);

		System.out.println("¸ß:" + box.getHeight());
		System.out.println("¿í:" + box.getWidth());

		Box<String, String> box2 = new <String, String>Box<String, String>("444", "333.3");
		box2.setHeight("300");
		box2.setWidth("444.555");

		System.out.println("¸ß:" + box2.getHeight());
		System.out.println("¿í:" + box2.getWidth());
	}

}
