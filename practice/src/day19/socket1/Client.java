package day19.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

class SocketClientRead implements Runnable {
	Socket socket = null;

	public SocketClientRead(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		InputStream is = null;
		try {
			is = socket.getInputStream();
		} catch (IOException e) {
			e.printStackTrace();
		} 

		Scanner scanner = new Scanner(is);
		String line = null;
		System.out.println("客户端读线程:>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		while (true) {
			// 读
			line = scanner.nextLine();
			if (line.equals("end")) {
				break;
			}
			System.err.println(line);
		}

		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class SocketClientWrite implements Runnable {
	Socket socket = null;

	public SocketClientWrite(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		OutputStream os = null;
		try {
			os = socket.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		PrintWriter pw = new PrintWriter(os, true);

		String line = null;
		System.out.println("客户端写线程:>>>>>>>>>>>>>>>>>>>>>>>>>>");
		while (true) {
			Scanner toServer = new Scanner(System.in);
			// 写
			line = toServer.nextLine();
			if (line.equals("end")) {
				toServer.close();
				break;
			}
			pw.println(line);
		}
		try {
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		Socket socket = new Socket("127.0.0.1", 5678);

		SocketClientRead socketClientRead = new SocketClientRead(socket);
		SocketClientWrite socketClientWrite = new SocketClientWrite(socket);
		Thread readThread = new Thread(socketClientRead);
		Thread writeThread = new Thread(socketClientWrite);

		readThread.start();
		writeThread.start();
		readThread.join();
		writeThread.join();

		/*
		 * while(true) { Thread.sleep(1000); }
		 */
		/*
		 * InputStream is = socket.getInputStream(); OutputStream os =
		 * socket.getOutputStream();
		 * 
		 * Scanner scanner = new Scanner(is); PrintWriter pw = new PrintWriter(os,
		 * true);
		 * 
		 * String line = null; System.out.println("我是客户端>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 * while (true) { // 读 line = scanner.nextLine(); if (line.equals("end")) {
		 * break;
		 * 
		 * } System.out.println(line); Scanner toServer = new Scanner(System.in);
		 * 
		 * // 写 line = toServer.nextLine(); pw.println(line); if (line.equals("end")) {
		 * toServer.close(); break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * //toServer.close(); socket.close();
		 */

	}

}
