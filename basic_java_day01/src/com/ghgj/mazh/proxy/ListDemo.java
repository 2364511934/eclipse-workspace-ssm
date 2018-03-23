package com.ghgj.mazh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午9:52:47 
 * 
 * 描述: 动态代理的list测试
 */
public class ListDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		
		final List list = new ArrayList();
		// 这是被代理的
		Object oo = Proxy.newProxyInstance(List.class.getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.err.println("加入一个对象：");
				Object returnValue = method.invoke(list, args);// 反射
				System.err.println("加入完成。。。。");
				if (method.getName().equals("size")) {
					return 100;
				}
				return returnValue;
			}
		});

		List list2 = (List) oo;
		boolean add = list2.add("aaa");
		boolean add2 = list2.add("bbb");
		System.out.println("aaa add:" + add);
		System.out.println("bbb add:" + add2);

		System.out.println("size:" + list2.size() + "," + list.size());// 100,2
		// 为什么调用3次？
		// list2.size()这个也调用
	}
}
