package day19.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {

	public static void main(String[] args) throws IOException {
		// 接收方 9999
		byte[] b = new byte[1024];
		// 打包
		DatagramPacket dp = new DatagramPacket(b, b.length);
		// 接收方                                                                       // 接收方的端口
		DatagramSocket ds = new DatagramSocket(9999);
		// 接收
		ds.receive(dp);
		byte[] bt = dp.getData();
		System.out.println(new String(bt, "gbk"));
		ds.close();
	}

}
