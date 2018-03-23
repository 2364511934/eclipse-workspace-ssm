package com.ghgj.yn;

import java.util.concurrent.locks.ReentrantLock;

class MyRunnalbe2 implements Runnable {

	ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			reentrantLock.lock();
			reentrantLock.lock();
			System.out.println(Thread.currentThread().getName() + ":running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			reentrantLock.unlock();
			reentrantLock.unlock();
		}
	}

}

public class MyReentrantLock {

	public static void main(String[] args) {
		MyRunnalbe2 myRunnalbe2 = new MyRunnalbe2();
		new Thread(myRunnalbe2).start();
		new Thread(myRunnalbe2).start();
	}

}
