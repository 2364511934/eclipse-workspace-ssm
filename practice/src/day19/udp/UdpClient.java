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
		// 发送方
		Scanner input = new Scanner(System.in);
		System.out.println("输入要传输的数据:");
		String s = input.next();
		//
		byte [] b = s.getBytes();
		//打包                                                                                                                                                  接收方的IP地址            接收方的端口
		DatagramPacket dp = new DatagramPacket(b,b.length,InetAddress.getLocalHost(),9999);
		//发送                                                                                   发送方的端口
		DatagramSocket ds = new DatagramSocket(8888);
		ds.send(dp);
		// 关闭
		ds.close();
	}

}

