package day19.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class SocketRunRead implements Runnable {
	Socket socket = null;

	public SocketRunRead(Socket socket) {
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
		System.out.println("服务器读线程:>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		String line = null;
		while (true) {
			try {
				line = scanner.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				//scanner.next();
				break;
			} 
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

class SocketRunWrite implements Runnable {
	Socket socket = null;

	public SocketRunWrite(Socket socket) {
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

		System.out.println("服务器写线程:>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		pw.println("客户端连接成功!!!");
		// pw.println("end");

		String line = null;
		while (true) {
			Scanner input = new Scanner(System.in);
			try {
				line = input.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
				//input.next();
			}
			if (line.equals("end")) {
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

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(5678);

		System.out.println("多客户端连接服务器");
		while (true) {
			Socket socket = server.accept();
			SocketRunRead socketRunRead = new SocketRunRead(socket);
			SocketRunWrite socketRunWrite = new SocketRunWrite(socket);
			Thread readThread = new Thread(socketRunRead);
			Thread writeThread = new Thread(socketRunWrite);
			readThread.start();
			writeThread.start();

		}

		/*
		 * InputStream is = socket.getInputStream(); OutputStream os =
		 * socket.getOutputStream();
		 * 
		 * Scanner scanner = new Scanner(is); PrintWriter pw = new PrintWriter(os,
		 * true);
		 * 
		 * System.out.println("我是服务器>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		 * 
		 * pw.println("服务器说了我是服务器"); pw.println("end");
		 * 
		 * String line = null; while(true) { line = scanner.nextLine();
		 * if(line.equals("end")) { break; } System.out.println(line); }
		 * 
		 * socket.close();
		 */
		// server.close();
	}

}
