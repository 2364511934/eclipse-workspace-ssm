/** 
* 
*/
package com.ghgj.mazh.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年03月22日 上午7:28:43 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class ArrayAndListChansfer {

	public static void main(String[] args) {
		
		String[] strArray = {"huangbo","xuzheng","wangbaoqiang"};
		for(String str : strArray) {
			System.out.println(str);
		}
		System.out.println("11111111111111111");
		
		
		/**
		 * 把数组转换成List
		 */
		List<String> strList = new ArrayList<String>(Arrays.asList(strArray));
		for(String str : strList) {
			System.out.println(str);
		}
		System.out.println("22222222222222222");
		
		
		/**
		 * 把List转换成数组
		 */
		String[] strArrayNew = (String[])strList .toArray(new String[strList.size()]);
		for(String str : strArrayNew) {
			System.out.println(str);
		}
		System.out.println("33333333333333333");
	}
}
