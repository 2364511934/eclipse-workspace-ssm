package com.ghgj.yn.thread;
/**
 * 
 * @author Administrator
 * 三个线程不能按照 A-B-C-A-B-C 顺序执行
 */
class MyRunnable4 implements Runnable {
	private int count = 0;
	private volatile boolean isAllow = true;

	public MyRunnable4() {

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
				notifyAll();
			}
			
			try {
				wait();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

}

public class MyThreadDemo4 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable4 myRunnable4 = new MyRunnable4();
		Thread myThread1 = new Thread(myRunnable4, "mythread1");
		Thread myThread2 = new Thread(myRunnable4, "mythread2");
		Thread myThread3 = new Thread(myRunnable4, "mythread3");
		myThread1.start();
		myThread2.start();
		myThread3.start();

		myThread1.join();
		myThread2.join();
		myThread3.join();

	}

}
