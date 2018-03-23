/** 
* 
*/
package com.ghgj.mazh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**  
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:53:56 
 * 
 * 描述:  动态代理类
 * 
 * 	
 */
public class LoggerDynamicProxy implements InvocationHandler{
	
	private Object target;
	
	public LoggerDynamicProxy(Object obj) {
		this.target = obj;
	}
	
	/**
	 * 动态代理类中的 invoke 方法
	 * 
	 * 三个参数的意义：
	 * 	
	 * proxy ：代理对象
	 * method : 委托类中要调用的方法
	 * args ：method 方法的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Logger.info("before 业务方法调用之前");
		Object obj = method.invoke(target, args);
		Logger.info("before 业务方法调用之前");
		return obj;
	}
}
