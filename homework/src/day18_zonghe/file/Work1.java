package day18_zonghe.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Work1 {

	// Ê¹ÓÃ FileInputStreamÁ÷
	public static void useFileInputStream(String source) throws IOException {
		FileInputStream fis = new FileInputStream(source);
		byte[] b = new byte[1024];
		int temp = 0;

		for (int i=0; temp != -1; i++) {
			temp = fis.read();
			b[i] = (byte)temp;
			if ('\n' == temp) {
				System.out.println(new String(b, 0, i+1, "gbk"));
				i=-1;
				continue;
			}
		}
		
		fis.close();
	}

	public static void main(String[] args) throws IOException {
		/*FileReader fr = new FileReader("d:/myjava/Hello.java");
		FileInputStream fis = new FileInputStream("d:/myjava/Hello.java");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();*/
		useFileInputStream("D:/TestClassLoader.java");
		
	}

}
