package com.ghgj.mazh.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午7:08:41 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class ThreadPoolWithRunable {

	/**
	 * 通过线程池执行线程
	 */
	public static void main(String[] args) throws InterruptedException {

		// 创建一个线程池
//		ExecutorService pool = Executors.newCachedThreadPool();
		
		// 创建一个修改了 等待时长的线程池
		ExecutorService pool = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());

		for (int i = 1; i < 50; i++) {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("thread name: " + Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}

//		Thread.sleep(15000);
		Thread.sleep(8000);
		System.out.println("------------------------------------------------");

		for (int i = 1; i < 50; i++) {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println("thread name: " + Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}

		pool.shutdown();
	}

}
