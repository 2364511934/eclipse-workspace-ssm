package com.ghgj.yn;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class MyReadThread implements Runnable {

	ReentrantReadWriteLock rrw = null;

	public MyReadThread(ReentrantReadWriteLock rrw) {
		this.rrw = rrw;
	}
	
	@Override
	public void run() {
		while (true) {
			rrw.readLock().lock();
			
			System.out.println(Thread.currentThread().getName() + ":running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rrw.readLock().unlock();
		}
	}

}

class MyWriteThread implements Runnable {

	ReentrantReadWriteLock rrw = null;

	public MyWriteThread(ReentrantReadWriteLock rrw) {
		this.rrw = rrw;
	}
	
	@Override
	public void run() {
		while (true) {
			rrw.writeLock().lock();
			
			System.out.println(Thread.currentThread().getName() + ":running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			rrw.writeLock().unlock();
		}
	}

}


public class MyReentrantReadWriteLock {

	public static void main(String[] args) {
		ReentrantReadWriteLock rrw = new ReentrantReadWriteLock();
		MyReadThread myReadThread = new MyReadThread(rrw);
		MyWriteThread myWriteThread = new MyWriteThread(rrw);
		new Thread(myReadThread).start();
		new Thread(myReadThread).start();
		new Thread(myReadThread).start();
		new Thread(myWriteThread).start();

	}

}
