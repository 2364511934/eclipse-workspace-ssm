package day19.udp;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;
public class UdpClient {

	public static void main(String[] args) throws IOException {
		// ���ͷ�
		Scanner input = new Scanner(System.in);
		System.out.println("����Ҫ���������:");
		String s = input.next();
		//
		byte [] b = s.getBytes();
		//���                                                                                                                                                  ���շ���IP��ַ            ���շ��Ķ˿�
		DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),9999);
		//����                                                                                   ���ͷ��Ķ˿�
		DatagramSocket ds = new DatagramSocket(8888);
		ds.send(dp);
		// �ر�
		ds.close();
	}

}

