package com.ghgj.mazh.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午7:22:05 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class TestAtomic {

	/**
	 * 原子量
	 */
	public static AtomicInteger numb = new AtomicInteger(0);

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 100; i++) {

			new Thread(new Runnable() {

				@Override
				public void run() {
					for (int i = 0; i < 1000; i++) {
						numb.incrementAndGet();
					}
				}
			}).start();

		}

		Thread.sleep(2000);
		System.out.println(numb);
	}

}
