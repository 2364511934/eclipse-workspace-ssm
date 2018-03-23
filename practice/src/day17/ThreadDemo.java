package day17;

class MyThread extends Thread{

	public MyThread(String name) {
		super(name);
	}
	

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread thead1 = new MyThread("t1");
		MyThread thead2 = new MyThread("t2");
		thead1.start();
		thead2.start();
		thead1.join();
		thead2.join();
		

	}

}
