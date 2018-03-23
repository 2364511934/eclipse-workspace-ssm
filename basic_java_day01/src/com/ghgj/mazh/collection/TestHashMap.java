package com.ghgj.mazh.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年12月30日下午2:47:20
 * 
 * 描述：TODO
 */
public class TestHashMap {


	public static void main(String[] args) {
		
		Map<String, String> testMap = new HashMap<String, String>(120);
		testMap.put("name", "huangbo");
		System.out.println(testMap);
		
	}
}
