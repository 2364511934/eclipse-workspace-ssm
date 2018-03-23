package com.ghgj.mazh.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月22日 上午7:07:24 
 * 
 * 描述: 列出并发包中的各种线程池
 */
public class ExecutorDemo {

	public static void main(String[] args) {
		// 创建单线程线程池
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		
		// 创建可回收的线程池
		ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();

		int cpuNums = Runtime.getRuntime().availableProcessors();
		System.out.println(cpuNums);
		// 创建固定数量线程池
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(cpuNums);

		// 创建可调度的线程池
		ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(8);
		
		// 创建可调度的单线程 线程池
		ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
	}
}
