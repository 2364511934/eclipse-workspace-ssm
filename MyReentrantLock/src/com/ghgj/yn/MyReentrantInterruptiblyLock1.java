package com.ghgj.yn;

import java.util.concurrent.locks.ReentrantLock;

class MyRunnalbe implements Runnable {

	ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				reentrantLock.lockInterruptibly();
			} catch (InterruptedException e1) {
				// 中断锁的使用
				System.out.println(Thread.currentThread().getName());
				e1.printStackTrace();
				break;
			}
			System.out.println(Thread.currentThread().getName() + ":running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName());
				e.printStackTrace();
			}
			reentrantLock.unlock();
		}
	}

}

public class MyReentrantInterruptiblyLock1 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnalbe myRunnalbe = new MyRunnalbe();
		Thread thread1 = new Thread(myRunnalbe);
		Thread thread2 = new Thread(myRunnalbe);
		Thread thread3 = new Thread(myRunnalbe);
		
		thread1.start();
		thread2.start();
		thread3.start();
		Thread.sleep(1000);
		thread3.interrupt();
	}

}
