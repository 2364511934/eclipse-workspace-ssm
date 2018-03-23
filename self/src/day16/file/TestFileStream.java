package day16.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;

public class TestFileStream {

	public static void main(String[] args) throws IOException {
		// 打开文件
		File file = new File("D:/Java集合构成.jpg");
		FileInputStream finStream = new FileInputStream(file);
		int temp = 0;
		/*// 读取文件的内容 遇到  -1 读到文件结尾
		while((temp=finStream.read()) != -1) {
			System.out.println(temp);
		}*/
		
		// 获取文件长度
		byte[] b = new byte[finStream.available()];
		//byte[] b = new byte[(int)file.length()];
		//finStream.read(b);
		finStream.read(b, 10, 30);
		//finStream.read
		// gbk 汉字编码方式
		String str = new String(b, "gbk");
		System.out.println(str);
		for(byte bb : b) {
			System.out.println(bb);
		}
		//System.out.println(b.toString());
		finStream.close();
	}

}
