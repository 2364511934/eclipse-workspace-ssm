package day19;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class TestInetAddress {

	
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		/*// InetAddress
		// 获得 本机的IP // SD-201711211512/188.188.8.65
		System.out.println(InetAddress.getLocalHost());
		// 通过 主机名 后 IP地址 获得一个 InetAddress的一个封装
		InetAddress i = InetAddress.getByName("www.baidu.com");
		// 单独 获得 主机的 IP地址 // 119.75.216.20
		System.out.println(i.getHostAddress());
		// 主机的名称 // www.baidu.com
		System.out.println(i.getHostName());
*/
		// URL
		URL url = new URL("http://127.0.0.1:8080/data/a.txt?id=1&page=2#hello");
		// 协议 // http
		System.out.println(url.getProtocol());
		// 主机 // 127.0.0.1
		System.out.println(url.getHost());
		// 端口 // 8080
		System.out.println(url.getPort());
		// 默认端口 //80
		System.out.println(url.getDefaultPort());
		// 路径 // /data/a.txt
		System.out.println(url.getPath());
		// 路径 和 查询串 // /data/a.txt?id=1&page=2
		System.out.println(url.getFile());
		// 查询串 //id=1&page=2
		System.out.println(url.getQuery());
		// 片段 // hello
		System.out.println(url.getRef());
	}

}
