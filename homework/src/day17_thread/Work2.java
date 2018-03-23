package day17_thread;

class Apple implements Runnable{
	private int count = 6;
	synchronized public void take() {
		System.out.println(Thread.currentThread().getName() + "��ʣ " + (--count)+ "ƻ��");
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			take();
			try {
				Thread.sleep((long)(Math.random()*1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Work2 {

	public static void main(String[] args) {
		Apple app = new Apple();
		Thread t1 = new Thread(app, "����");
		Thread t2 = new Thread(app, "����");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();

	}

}
