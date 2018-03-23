package day13;

class Apple<T extends Number>{
	private T n;

	public Apple(T n) {
		this.n = n;
	}

	public T getN() {
		return n;
	}

	public void setN(T n) {
		this.n = n;
	}
	
}


class Apple2<T>{
	private T n;

	public Apple2(T n) {
		this.n = n;
	}

	public T getN() {
		return n;
	}

	public void setN(T n) {
		this.n = n;
	}
	
}

public class AppleDemo {
	
	public static void getApple2(Apple2<? extends Number> a2) {
		System.out.println(a2.getN());
	}
	
	public static void getApple3(Apple2<? super String> a3) {
		System.out.println(a3.getN());
	}
	
	
	public static void main(String[] args) {
		Apple<Integer> a1 = new Apple<>(10);
		Apple<Double> a2 = new Apple<>(10.99);
		a1.setN(22222);
		a2.setN(32434.4545);
		System.out.println(a1.getN());
		System.out.println(a2.getN());
		
		Apple2<Integer> a3 = new Apple2<>(10);
		getApple2(a3);
		
		Apple2<String> a4 = new Apple2<>("eeee");
		getApple3(a4);
	}
	
	
}
