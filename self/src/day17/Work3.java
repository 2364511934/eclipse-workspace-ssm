package day17;

import java.util.concurrent.locks.ReentrantLock;

class Apple2 implements Runnable{
	private int count = 6;
	
   synchronized	public void take()   {
		
		System.out.println(Thread.currentThread().getName() + "还剩 " + (--count)+ "苹果");
		try {
			if(Thread.currentThread().getName().equals("张三"))
				wait(100);
				//wait();
			if(Thread.currentThread().getName().equals("李四"))
			{
				Thread.sleep(5000);
				//this.notify();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ "**********************");
		//System.out.println("我醒了");
		
	}
	
	@Override
	public void run()  {
		take();
	}
}

public class Work3 {

	public static void main(String[] args) throws InterruptedException {
		Apple2 app = new Apple2();
		Thread t1 = new Thread(app, "张三");
		Thread t2 = new Thread(app, "李四");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		//Thread.sleep(1000);
		//t1.interrupt();
		//t2.interrupt();

	}

}


