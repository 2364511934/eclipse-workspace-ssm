package day15;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue1 {

	public static void main(String[] args) {
		// Queue����
		Queue<String> q = new LinkedList<>();
		//���β���
		q.add("aa");//ʧ�� ���쳣
		q.add("bb");
		q.offer("cc");//���ʧ�� false
//		q.offer(null);���� ������ ��� nullֵ ��LinkedList���� ����� ��Ҫ�� Null
		System.out.println(q);
		//ģ����� ����������
	/*	System.out.println(q.poll());//
		System.out.println(q.poll());
		System.out.println(q.poll());*/
		//ѭ��
/*		for(;;) {
			String s = q.poll();
			
			if(s == null) {
				break;
			}
			System.out.println(s);
		}*/
		while(q.size() > 0) {
			//�Ƴ� ����
//			System.out.println(q.poll());
			//ֻ  ��ò����Ƴ�
//			System.out.println(q.peek());
		}
		
	}

}
