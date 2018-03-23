package day17;

class MyThread2 extends Thread{

	@Override
	public void run() {
		for(int i = 10 ; i>=0; i--) {
			System.out.println(Thread.currentThread().getName() + ":"+i);
		}
	}

	public MyThread2(String name) {
		super(name);
	}
	
}

public class PrintNumberDemo {

	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2("Thread1");
		myThread2.start();
	}

}
