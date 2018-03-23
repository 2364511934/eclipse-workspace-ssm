package com.ghgj.mazh.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		/**
		 * HashSet仅仅是按照hashCode()和equals()去重的集合
		 */
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("a");
		hashSet.add("a");
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()){
			String next = iterator.next();
			System.out.println(next);
		}
	}
}
