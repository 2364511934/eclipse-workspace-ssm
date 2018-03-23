package com.ghgj.mazh.thread;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午6:38:48 
 * 
 * 描述: 观察现象：一个线程获得锁后，另一个线程取不到锁，不会一直等待
 */
public class MyTryLock {

	private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	static Lock lock = new ReentrantLock(); // 注意这个地方

	public static void main(String[] args) throws Exception {

		new Thread() {
			public void run() {
				Thread thread = Thread.currentThread();
				boolean tryLock = lock.tryLock(); // 非阻塞式的
				System.out.println(thread.getName() + " " + tryLock);
				if (tryLock) {
					try {
						System.out.println(thread.getName() + "得到了锁");
						for (int i = 0; i < 5; i++) {
							arrayList.add(i);
							System.out.println(thread.getName()+"--"+i);
						}
					} catch (Exception e) {
						// TODO: handle exception
					} finally {
						System.out.println(thread.getName() + "释放了锁");
						lock.unlock();
					}
				}
			};
		}.start();

		new Thread() {
			public void run() {
				Thread thread = Thread.currentThread();
				boolean tryLock = lock.tryLock();
				System.out.println(thread.getName() + " " + tryLock);
				if (tryLock) {
					try {
						System.out.println(thread.getName() + "得到了锁");
						for (int i = 0; i < 5; i++) {
							arrayList.add(i);
							System.out.println(thread.getName()+"--"+i);
						}
					} catch (Exception e) {
						// TODO: handle exception
					} finally {
						System.out.println(thread.getName() + "释放了锁");
						lock.unlock();
					}
				}

			};
		}.start();
		
	}
}
