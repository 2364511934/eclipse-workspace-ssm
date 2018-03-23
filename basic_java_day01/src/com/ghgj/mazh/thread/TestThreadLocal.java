package com.ghgj.mazh.thread;

public class TestThreadLocal {

	//在上面的例子中首先利用匿名类覆盖ThreadLocal的initialValue()方法指定初始值
	private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};

	public static void main(String[] args) {
		//创建三个线程共享seqNum各自产生序列号
		TestThreadLocal sn = new TestThreadLocal();
		new TestThread(sn).start();
		new TestThread(sn).start();
		new TestThread(sn).start();
	}
	
	private static class TestThread extends Thread {
		private TestThreadLocal sn;

		public TestThread(TestThreadLocal sn) {
			this.sn = sn;
		}

		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("thread -" + Thread.currentThread().getName() + " -> " + sn.getNextNum());
			}
		}
	}

	//通过getNextNum获取下一个序列值
	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}
}
