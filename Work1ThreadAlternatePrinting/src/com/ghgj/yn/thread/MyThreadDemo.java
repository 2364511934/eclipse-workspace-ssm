package com.ghgj.yn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyRunnable implements Runnable
{
	private int count = 0;
	private Lock lock;
	
	public MyRunnable(){
		lock = new ReentrantLock();
	}
	
	@Override
	public void run() {
		while(true) {
			lock.lock();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("["+Thread.currentThread().getName()+"]running" + ":count:"+count++);
			lock.unlock();
		}
	}
	
}

public class MyThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread1 = new Thread(myRunnable, "mythread1");
		Thread myThread2 = new Thread(myRunnable, "mythread2");
		myThread1.start();
		myThread2.start();
		
		myThread1.join();
		myThread2.join();
		
	}

}
