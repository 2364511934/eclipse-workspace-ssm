package day19;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class TestInetAddress {

	
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		/*// InetAddress
		// ��� ������IP // SD-201711211512/188.188.8.65
		System.out.println(InetAddress.getLocalHost());
		// ͨ�� ������ �� IP��ַ ���һ�� InetAddress��һ����װ
		InetAddress i = InetAddress.getByName("www.baidu.com");
		// ���� ��� ������ IP��ַ // 119.75.216.20
		System.out.println(i.getHostAddress());
		// ���������� // www.baidu.com
		System.out.println(i.getHostName());
*/
		// URL
		URL url = new URL("http://127.0.0.1:8080/data/a.txt?id=1&page=2#hello");
		// Э�� // http
		System.out.println(url.getProtocol());
		// ���� // 127.0.0.1
		System.out.println(url.getHost());
		// �˿� // 8080
		System.out.println(url.getPort());
		// Ĭ�϶˿� //80
		System.out.println(url.getDefaultPort());
		// ·�� // /data/a.txt
		System.out.println(url.getPath());
		// ·�� �� ��ѯ�� // /data/a.txt?id=1&page=2
		System.out.println(url.getFile());
		// ��ѯ�� //id=1&page=2
		System.out.println(url.getQuery());
		// Ƭ�� // hello
		System.out.println(url.getRef());
	}

}
