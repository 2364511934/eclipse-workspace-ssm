package day18;
/**
 * 
 * @author Administrator
 * 生产者与消费者经典模型
 */
class QingFeng{
	private int count = 0;
	private boolean tag = false;   // 默认没有东西可卖 
	
	// 生产者 同步的实际是这个对象
	synchronized public void productor(String name,int count) {
		if(tag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.count = count;
		System.out.println(name+":生产了："+ count);
		tag = true;
		// 通知消费者可以消费
		notify();
	}
	
	// 消费者 同步的实际是这个对象
	synchronized public void consumers(String name) {
		if(!tag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(count > 0) this.count--;
		System.out.println(name+":消费者：消费了一个馒头 还剩 " + count);
		
		if (count == 0) {
			tag = false;
			notify();
		}
	}
}

class Productor implements Runnable {
	private String name;
	private QingFeng qingFeng = null;
	Productor(QingFeng qingFeng, String name){
		this.qingFeng = qingFeng;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			qingFeng.productor(name, (int)(Math.random()*100)+1);
		}
	}
}
class Consumer implements Runnable {
	private String name;
	private QingFeng qingFeng = null;
	Consumer(QingFeng qingFeng, String name){
		this.qingFeng = qingFeng;
		this.name = name;
	}
	
	@Override
	public void run() {
		while(true) {
			qingFeng.consumers(name);
		}
	}
}

public class ProducerConsumersDemo {

	public static void main(String[] args) throws InterruptedException {
		QingFeng qingFeng = new QingFeng();
		Productor productor1 = new Productor(qingFeng, "生产者1");
		Productor productor2 = new Productor(qingFeng, "生产者2");
		Productor productor3 = new Productor(qingFeng, "生产者3");
		Productor productor4 = new Productor(qingFeng, "生产者4");
		Consumer consumer1 = new Consumer(qingFeng, "消费者1");
		Consumer consumer2 = new Consumer(qingFeng, "消费者2");
		Consumer consumer3 = new Consumer(qingFeng, "消费者3");
		Consumer consumer4 = new Consumer(qingFeng, "消费者4");
		Thread tp1 = new Thread(productor1);
		Thread tp2 = new Thread(productor2);
		Thread tp3 = new Thread(productor3);
		Thread tp4 = new Thread(productor4);
		Thread tc1 = new Thread(consumer1);
		Thread tc2 = new Thread(consumer2);
		Thread tc3 = new Thread(consumer3);
		Thread tc4 = new Thread(consumer4);
		tp1.start();
		tp2.start();
		tp3.start();
		tp4.start();
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tp1.join();
		tp2.join();
		tp3.join();
		tp4.join();
		tc1.join();
		tc2.join();
		tc3.join();
		tc4.join();
	}

}
