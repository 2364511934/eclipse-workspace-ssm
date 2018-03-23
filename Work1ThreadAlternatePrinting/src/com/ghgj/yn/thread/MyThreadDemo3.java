package com.ghgj.yn.thread;
/**
 * 
 * @author Administrator
 * 可以实现2个线程轮流访问 A-B-A-B
 */
class MyRunnable3 implements Runnable {
	private int count = 0;
	private volatile boolean isAllow = true;

	public MyRunnable3() {

	}

	@Override
	public synchronized void run() {
		while (true) {
			if(isAllow) {
				isAllow = false;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("[" + Thread.currentThread().getName() + "]running" + ":count:" + count++);
				isAllow = true;
				notify();
			}
			
			try {
				wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

}

public class MyThreadDemo3 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable3 myRunnable3 = new MyRunnable3();
		Thread myThread1 = new Thread(myRunnable3, "mythread1");
		Thread myThread2 = new Thread(myRunnable3, "mythread2");
		myThread1.start();
		myThread2.start();

		myThread1.join();
		myThread2.join();

	}

}
