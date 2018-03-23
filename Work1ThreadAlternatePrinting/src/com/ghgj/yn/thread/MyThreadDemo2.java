package com.ghgj.yn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyRunnable2 implements Runnable {
	private int count = 0;

	public MyRunnable2() {

	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("[" + Thread.currentThread().getName() + "]running" + ":count:" + count++);
			}
		}
	}

}

public class MyThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable2 myRunnable2 = new MyRunnable2();
		Thread myThread1 = new Thread(myRunnable2, "mythread1");
		Thread myThread2 = new Thread(myRunnable2, "mythread2");
		myThread1.start();
		myThread2.start();

		myThread1.join();
		myThread2.join();

	}

}
