package com.ghgj.mazh.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2018年2月25日下午5:48:50
 * 
 * 描述： 测试LinkedHashSet
 */
public class TestLinkedHashSet {

	public static void main(String[] args) {
		
		/**
		 * LinkedHashSet 会保存集合中的元素放入顺序
		 */
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		linkedHashSet.add("b");
		linkedHashSet.add("c");
		linkedHashSet.add("a");
		linkedHashSet.add("a");
		
		Iterator<String> iterator = linkedHashSet.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
	}
}
