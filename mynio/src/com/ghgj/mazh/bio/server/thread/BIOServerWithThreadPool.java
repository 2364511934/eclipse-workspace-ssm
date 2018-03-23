package com.ghgj.mazh.bio.server.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2018年1月31日上午8:41:47
 * 
 * 描述：  伪异步
 */
public class BIOServerWithThreadPool {

	private static final int PORT = 9090;

	public static void main(String[] args) {

		ServerSocket ss = null;

		try {

			ss = new ServerSocket();
			ss.bind(new InetSocketAddress("127.0.0.1", PORT));
			System.out.println("server started listening " + PORT);

			MyThreadPoolExecuter threadPool = new MyThreadPoolExecuter();

			while (true) {

				Socket s = ss.accept();
				threadPool.execute(new ServerTaskThread(s));

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class ServerTaskThread implements Runnable {

	private Socket s = null;

	public ServerTaskThread(Socket s) {
		this.s = s;

	}

	@Override
	public void run() {

		String threadName = Thread.currentThread().getName();
		System.out.println(threadName + " 正在提供服务");

		// 输入流用来获取到 客户端的请求输入
		InputStream inputStream = null;
		// 输出流用来给客户端进行反馈输出的
		OutputStream outputStream = null;

		try {
			inputStream = s.getInputStream();
			outputStream = s.getOutputStream();

			BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
			PrintWriter out = new PrintWriter(outputStream, true);

			// 模拟服务端在不停的对 客户端 提供服务
			while (true) {

				String readLine = in.readLine();
				if (readLine == null) {
					break;
				}
				System.out.println("receive client order : " + readLine);

				if (readLine.equals("getNow")) {
					String now = getNow();
					out.println(now);
				} else if (readLine.equals("getServerName")) {
					String name = getServerName();
					out.println(name);
				} else {
					System.out.println("客户端 断开链接");
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getNow() {
		return new SimpleDateFormat("yy-MM-dd HH:MM:ss").format(new Date());
	}

	public static String getServerName() {
		return "huangbo";
	}
}

class MyThreadPoolExecuter {

	private Executor exec = null;

	public MyThreadPoolExecuter() {
		System.out.println("server  thread pool started work : ");
		this.exec = new ThreadPoolExecutor(3, 4, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(6));
	}

	public void execute(Runnable task) {
		exec.execute(task);
	}
}
