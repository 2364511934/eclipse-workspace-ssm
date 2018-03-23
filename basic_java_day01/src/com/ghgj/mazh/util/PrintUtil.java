package com.ghgj.mazh.util;

import java.util.List;


public class PrintUtil {

	/**
	 * 日期：2018年2月25日下午6:10:25
	 *  打印List集合中的元素
	 */
	public static void printList(List list){
		
		for(Object o : list){
			System.out.println(o.toString());
		}
	}
}
