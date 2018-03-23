package day15;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue1 {

	public static void main(String[] args) {
		// Queue队列
		Queue<String> q = new LinkedList<>();
		//向队尾添加
		q.add("aa");//失败 抛异常
		q.add("bb");
		q.offer("cc");//添加失败 false
//		q.offer(null);队列 不允许 添加 null值 ，LinkedList特殊 ，最好 不要用 Null
		System.out.println(q);
		//模拟队列 操作：出队
	/*	System.out.println(q.poll());//
		System.out.println(q.poll());
		System.out.println(q.poll());*/
		//循环
/*		for(;;) {
			String s = q.poll();
			
			if(s == null) {
				break;
			}
			System.out.println(s);
		}*/
		while(q.size() > 0) {
			//移除 出队
//			System.out.println(q.poll());
			//只  获得不会移除
//			System.out.println(q.peek());
		}
		
	}

}
