package com.ghgj.mazh.thread;

import java.util.Random;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日上午8:58:40
 * 
 * 描述：TODO
 */
public class MyThreadWithExtends extends Thread {
	String flag;

	public MyThreadWithExtends(String flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		// 获取当前线程的线程名
		String tname = Thread.currentThread().getName();
		System.out.println(tname + "线程的run方法被调用……");
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(random.nextInt(50) * 50);
				System.out.println(tname + "...." + flag);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new MyThreadWithExtends("a");
		Thread thread2 = new MyThreadWithExtends("b");
		
		/**
		 * 调度线程开始运行是  start 方法， 而不是 run 方法
		 */
		thread1.start();
		thread2.start();
		
		/**
		 * 如果是调用thread的run方法，则只是一个普通的方法调用，不会开启新的线程
		 */
//		thread1.run();
//		thread2.run();
	}
}
