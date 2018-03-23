/** 
* 
*/
package com.ghgj.mazh.test;

import java.util.Random;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午9:56:24 
 * 
 * 描述: TODO(这里用一句话描述这个类的作用)
 */
public class Test {

	public static void main(String[] args) {
		
		/**
		 * 生成一个随机数
		 */
		Random random = new Random();
		System.out.println(random.nextInt(10));
		
		/**
		 * 求出当前的计算机有多少个CPU
		 */
		int cpuNums = Runtime.getRuntime().availableProcessors();
		System.out.println(cpuNums);
		
		
		
		
	}
	
//	StudentMapper studentMapper = session.getMapper(StudentMapper.class)
}
