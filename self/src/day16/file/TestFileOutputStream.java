package day16.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/a.txt");
		// true 是追加模式 false 将清空之前文件存入的内容
		FileOutputStream fout = new FileOutputStream(file,true);
		
		byte[] b = new byte[1024];
		
		// 存入一个整数
		fout.write((int)b[0]);
		// 存入一个数组 将整个数组写入到文件中 
		fout.write(b);
		// 数组中的数据部分写入  write(b, off, len) 从off 索引处写入， 写入 len 个字节
		fout.write(b, 1, b.length-1);
		
		fout.close();
	}

}
