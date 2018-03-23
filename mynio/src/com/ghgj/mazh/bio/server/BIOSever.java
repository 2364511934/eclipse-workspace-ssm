package com.ghgj.mazh.bio.server;

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

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2018年7月31日上午8:36:16
 * 
 * 描述：

		同步阻塞， 一对一服务的服务端程序
 */
public class BIOSever {

	private static final int PORT = 9090;

	public static void main(String[] args) throws Exception {

		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress("localhost", PORT));
		System.out.println("server started listening " + PORT);

		try {

			Socket s = null;
			while (true) {

				s = ss.accept();
				new Thread(new ServerTaskThread(s)).start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ss != null) {
				ss.close();
				ss = null;
				System.out.println("sever stoped");
			}
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
		System.out.println(threadName+ " 正在提供服务");
		
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

				if(readLine.equals("getNow")){
					String now = getNow();
					out.println(now);
				}else if(readLine.equals("getServerName")){
					String name = getServerName();
					out.println(name);
				}else{
					System.out.println("客户端 断开链接");
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getNow() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	public static String getServerName() {
		return "huangbo";
	}
}
