package com.ghgj.mazh.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午6:45:13 
 * 
 * 描述:  
 * 		观察现象：如果thread-0得到了锁，阻塞。。。
 * 		thread-1尝试获取锁，如果拿不到，会等待，但是可以被中断等待
 */
public class MyLockInterruptibly {

	/**
	 *  lock锁
	 */
	private Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		MyLockInterruptibly test = new MyLockInterruptibly();
		MyThread thread0 = new MyThread(test);
		MyThread thread1 = new MyThread(test);
		thread0.start();
		thread1.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 调用中断方法来测试能否中断等待中的线程
		thread1.interrupt();
		System.out.println("=====================");
	}

	public void insert(Thread thread) throws InterruptedException {
		// 注意，如果需要正确中断等待锁的线程，必须将获取锁放在外面，然后将InterruptedException抛出
		lock.lockInterruptibly(); 
		try {
			System.out.println(thread.getName() + "得到了锁");
			long startTime = System.currentTimeMillis();
			for (;;) {
				if (System.currentTimeMillis() - startTime >= Integer.MAX_VALUE)
					break;
				// 插入数据
			}
		} finally {
			System.out.println(Thread.currentThread().getName() + "执行finally");
			lock.unlock();
			System.out.println(thread.getName() + "释放了锁");
		}
	}
}

class MyThread extends Thread {
	private MyLockInterruptibly test = null;

	public MyThread(MyLockInterruptibly test) {
		this.test = test;
	}

	@Override
	public void run() {

		try {
			test.insert(Thread.currentThread());
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + "被中断");
		}
	}

}
