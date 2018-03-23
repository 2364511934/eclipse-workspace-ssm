package day17;

import java.util.concurrent.locks.ReentrantLock;

class Reported implements Runnable{

	private int num = 0;
	ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		
		try {
			lock.lock();
			System.out.println(Thread.currentThread().getName() + "����:" + ++num);
			Thread.sleep((long)(Math.random()*3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
		
		
		
	}
	
}

public class ReportedDemo {

	public static void main(String[] args) throws InterruptedException {
		Reported reported =  new Reported();
		Thread t1 = new Thread(reported, "С����1");
		Thread t2 = new Thread(reported, "С����2");
		Thread t3 = new Thread(reported, "С����3");
		Thread t4 = new Thread(reported, "С����4");
		Thread t5 = new Thread(reported, "С����5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
	}

}
