package day17_thread;

class MyStudyThread implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+"�ú�ѧϰ����������");
		}
	}
	
}

public class Work1 {

	public static void main(String[] args) {
		MyStudyThread myStudyThread = new MyStudyThread();
		Thread t1 = new Thread(myStudyThread, "����");
		Thread t2 = new Thread(myStudyThread, "����");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}
