package com.ghgj.mazh.proxy;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:43:24 
 * 
 * 描述: 日志打印工具类
 */
public class Logger {
	
	public static void debug(String message) {
		System.out.println("DEBUG: " + message);
	}

	public static void info(String message) {
		System.out.println("INFO: " + message);
	}
	
	public static void warn(String message) {
		System.out.println("WARN: " + message);
	}
	
	public static void error(String message) {
		System.err.println("ERROR: " + message);
	}
}
