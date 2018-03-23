package day20;

class A implements Runnable{
	public int tickets = 500;
	String str = new String("haha");
	@Override
	public void run() {
		while(true) {
			synchronized (str) {
				if(tickets > 0) {
					System.out.printf("%s线程正在卖%d票\n", Thread.currentThread().getName(), tickets);
					--tickets;
				}
				else
				{
					break;
				}
			}
		}
		
	}
	
}

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		Thread t3 = new Thread(a);
		Thread t4 = new Thread(a);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
