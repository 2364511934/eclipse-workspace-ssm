package com.ghgj.yn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		String s = Thread.currentThread().getName()+":running";
		return s;
	}
	
}

public class MyCallableDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		 FutureTask<String> future = new FutureTask<String>(new MyCallable());
	     new Thread(future).start();
	     String s = future.get();
	     System.out.println(s);
	}
}
