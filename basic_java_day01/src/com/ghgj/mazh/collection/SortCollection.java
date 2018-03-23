/** 
* 
*/
package com.ghgj.mazh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ghgj.mazh.pojo.User;
import com.ghgj.mazh.util.PrintUtil;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午7:28:11 
 * 
 * 描述: 测试排序
 */
public class SortCollection {

	public static void main(String[] args) {
		
		List<User> userList = new ArrayList<User>();
		
		userList.add(new User(3, "c"));
		userList.add(new User(2, "d"));
		userList.add(new User(4, "b"));
		userList.add(new User(1, "a"));
	
		/**
		 * 未排序
		 */
		PrintUtil.printList(userList);
		System.out.println("----------------------");
		
		
		/**
		 * 按照User类实现的Comprable接口中的compareTo方法的比较规则来比较大小
		 * 
		 * 如果你只传入了一个参数 list 的话。 那么一定要给list中的对象， 要实现 Comparable 接口
		 */
		Collections.sort(userList);
		PrintUtil.printList(userList);
		System.out.println("----------------------");
		
		/**
		 * 按照自定义比较规则来实现对象之间的大小比较
		 */
		Collections.sort(userList, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		PrintUtil.printList(userList);
	}
}
