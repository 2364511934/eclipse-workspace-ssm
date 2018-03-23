package com.ghgj.mazh.thread;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午7:21:56 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class TestVolatile {

	public static volatile int numb = 0;

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 100; i++) {

			new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 1000; i++) {
						numb++;
					}
				}
			}).start();
		}

		Thread.sleep(2000);
		System.out.println(numb);
	}
}
