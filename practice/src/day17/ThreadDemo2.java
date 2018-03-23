package day17;

// 票
class Tick implements Runnable{
	private int total = 40;
	
	synchronized public void saleOne(int t) {
		System.out.println(Thread.currentThread().getName()+"卖了一张票"+"还剩" + t +"  "+--total);
		//total--;
	}
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	 public void run() {
		int t = 10;
		while(t>0) {
			synchronized (this){
				saleOne(--t);
			}
			try {
				//Thread.sleep(Math.random()*(1000));
				Thread.sleep((long)(Math.random()*(2000)+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		/*int t = 10;
		while(t>0) {
			System.out.println(Thread.currentThread().getName()+"卖了一张票"+"还剩" + --t);
			total--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	}
	
}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {
		Tick tick = new Tick();
		Thread t1 = new Thread(tick, "t1");
		Thread t2 = new Thread(tick, "t2");
		Thread t3 = new Thread(tick, "t3");
		Thread t4 = new Thread(tick, "t4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
	}

}
