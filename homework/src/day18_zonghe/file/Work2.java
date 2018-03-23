package day18_zonghe.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("d:/Dest.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		String str = "100,101,102,103,104,105";
		byte[] b= str.getBytes();
		bos.write(b);
		bos.close();
		
		FileInputStream fis = new FileInputStream("d:/Dest.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		b = new byte[bis.available()];
		bis.read(b);
		
		StringBuffer sb = new StringBuffer(new String(b));
		sb.reverse();
		System.out.println(sb.toString());
		bos.close();
	}

}
