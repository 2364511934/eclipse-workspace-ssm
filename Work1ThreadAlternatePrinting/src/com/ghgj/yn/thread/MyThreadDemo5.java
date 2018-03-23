package com.ghgj.yn.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author Administrator
 * 
 */
class MyRunnable5 implements Runnable {
	private int count = 0;
	private volatile boolean isAllow = true;
	// ´æ´¢Ïß³ÌµÈ´ýID
	private long[] threadWaitIds = new long[] { 0L, 0L, 0L };
	private Lock lock = new ReentrantLock();

	private void clearWaitId() {
		lock.lock();
		String threadName = Thread.currentThread().getName();
		switch(threadName) {
			case "mythread1":threadWaitIds[0] = 0; break;
			case "mythread2":threadWaitIds[1] = 0; break;
			case "mythread3": threadWaitIds[2] = 0; break;
		}
		lock.unlock();
	}

	private long findWaitId() {
		long waitId = 0;
		lock.lock();
		for (int i = 0; i < threadWaitIds.length; i++) {
			if (Thread.currentThread().getId() == threadWaitIds[i]) {
				waitId = threadWaitIds[i];
			}
		}
		lock.unlock();

		return waitId;
	}

	private void setWaitId() {

		if (0 != findWaitId()) {
			return;
		}
		lock.lock();
		for (int i = 0; i < threadWaitIds.length; i++) {
			if (threadWaitIds[i] == 0) {
				threadWaitIds[i] = Thread.currentThread().getId();
			}
		}
		lock.unlock();
	}

	private boolean isNotifyMe() {
		boolean bRet = false;
		lock.lock();
		if (Thread.currentThread().getId() == threadWaitIds[0]) {
			bRet = true;
		}
		lock.unlock();

		return bRet;
	}

	public MyRunnable5() {

	}

	@Override
	public synchronized void run() {
		while (true) {
			if (isAllow) {
				clearWaitId();
				isAllow = false;
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Thread.currentThread().getId();
				System.out.println("[" + Thread.currentThread().getName() + "]running" + ":count:" + count++);
				isAllow = true;
				notifyAll();
			}

			try {
				setWaitId();
				wait();
				while (true) {
					if (!isNotifyMe()) {
						notifyAll();
						wait();
					}
					else
					{
						//clearWaitId();
						break;
					}
				}
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

}

public class MyThreadDemo5 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable5 myRunnable5 = new MyRunnable5();
		Thread myThread1 = new Thread(myRunnable5, "mythread1");
		Thread myThread2 = new Thread(myRunnable5, "mythread2");
		Thread myThread3 = new Thread(myRunnable5, "mythread3");
		myThread1.start();
		myThread2.start();
		myThread3.start();

		myThread1.join();
		myThread2.join();
		myThread3.join();

	}

}
