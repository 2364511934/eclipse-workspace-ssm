package day19.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {

	public static void main(String[] args) throws IOException {
		// ���շ� 9999
		byte[] b = new byte[1024];
		// ���
		DatagramPacket dp = new DatagramPacket(b, b.length);
		// ���շ�                                                                       // ���շ��Ķ˿�
		DatagramSocket ds = new DatagramSocket(9999);
		// ����
		ds.receive(dp);
		byte[] bt = dp.getData();
		System.out.println(new String(bt, "gbk"));
		ds.close();
	}

}
