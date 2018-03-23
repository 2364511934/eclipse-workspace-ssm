package com.ghgj.mazh.collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.ghgj.mazh.pojo.User;
import com.ghgj.mazh.reflect.Student;

public class TestTreeSet {

	public static void main(String[] args) {
		
		Set<User> userTreeSet = new TreeSet<User>(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				
				return o1.getId() - o2.getId();
			}
			
		});
		// 编译器不能识别TreeSet中的元素是否具有比较大小的规则
		Set<Student> studentTreeSet = new TreeSet<Student>();
		
		
		User user1 = new User(2, "huangbo");
		User user2 = new User(3, "xuzheng");
		User user3 = new User(1, "wangbaoqiang");
		
		/**
		 * 如果User类没有实现Comparable接口的话， 那么在调用TreeSet的add方法的时候就会报错。
		 * 因为TreeSet会保持加入元素的顺序，所以加入TreeSet中的所有元素必须能够相互之间比较大小
		 * 从而保持有序
		 */
		userTreeSet.add(user1);
		userTreeSet.add(user2);
		userTreeSet.add(user3);
		
		for(User u : userTreeSet){
			System.out.println(u);
		}
	}
}
