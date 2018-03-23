package com.ghgj.yn;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * ReentrantLock 中调用 lockInterruptibly 可被其他线程中断，
 * 但是可以再次调用lock 方法  此锁可以继续使用 不会有任何异常
 *
 */
class MyRunnalbe3 implements Runnable {

	ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void run() {
		while (true) {
			try {
				reentrantLock.lockInterruptibly();
			} catch (InterruptedException e1) {
				// 中断锁的使用
				System.err.println(Thread.currentThread().getName());
				e1.printStackTrace();
				reentrantLock.lock();
			}
			System.out.println(Thread.currentThread().getName() + ":running");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName());
				e.printStackTrace();
			}
			reentrantLock.unlock();
		}
	}
}

public class MyReentrantInterruptiblyLock2 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnalbe3 myRunnalbe3 = new MyRunnalbe3();
		Thread thread1 = new Thread(myRunnalbe3);
		Thread thread2 = new Thread(myRunnalbe3);
		Thread thread3 = new Thread(myRunnalbe3);
		
		thread1.start();
		thread2.start();
		thread3.start();
		Thread.sleep(1000);
		thread3.interrupt();
	}

}
