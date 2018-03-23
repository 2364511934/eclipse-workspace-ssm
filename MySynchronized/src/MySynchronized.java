

/**
 * 作�?�： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期�? 2017�?04�?21�? 下午10:02:09 
 * 
 * 描述: 
 */
public class MySynchronized {
	
	public static void main(String[] args) {
		final MySynchronized mySynchronized = new MySynchronized();
		final MySynchronized mySynchronized2 = new MySynchronized();
		
		new Thread("thread1") {
			public void run() {
				synchronized ("sb") {
					System.out.println(this.getName() + " start");
					int i = 1 / 0; // 如果发生异常，jvm会将锁释�?
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(this.getName() + "醒了");
					System.out.println(this.getName() + " end");
					/*try {
						System.out.println(this.getName() + " start");
						int i = 1 / 0; // 如果发生异常，jvm会将锁释�?
						Thread.sleep(5000);
						System.out.println(this.getName() + "醒了");
						System.out.println(this.getName() + " end");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}*/
				}
			}
		}.start();
		
		new Thread("thread2") {
			public void run() {
				synchronized ("sb") { // 争抢同一把锁时，线程1没释放之前，线程2只能等待
					// synchronized (mySynchronized2) { //如果不是�?把锁，可以看到两句话同时打印
					System.out.println(this.getName() + " start");
					System.out.println(this.getName() + " end");

				}
			}
		}.start();
	}
}