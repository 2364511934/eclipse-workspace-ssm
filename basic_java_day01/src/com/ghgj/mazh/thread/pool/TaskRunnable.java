package com.ghgj.mazh.thread.pool;

import java.util.Random;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午7:07:47 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class TaskRunnable implements Runnable {

	private int s;
	Random r = new Random();

	public TaskRunnable(int s) {
		this.s = s;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(name + " 启动时间：" + currentTimeMillis / 1000);

		int rint = r.nextInt(3);
		try {
			Thread.sleep(rint * 1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(name + " is working..." + s);
	}
}
