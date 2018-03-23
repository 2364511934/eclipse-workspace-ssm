package com.ghgj.yn.stat;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentDynamicProxyDAO implements InvocationHandler{
	Object object;
	public StudentDynamicProxyDAO(Object object){
		this.object = object;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws Throwable {
		Object obj = null;
		object = method.invoke(object, args);
		System.out.println("dynamic proxy : 成功插入一条记录 ");
		return obj;
	}
	

}
