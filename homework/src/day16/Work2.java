package day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work2 {

	public static void main(String[] args) throws IOException {
		File fi = new File("D:/成都.mp3");
		FileInputStream fin = new FileInputStream(fi);
		BufferedInputStream bfin = new BufferedInputStream(fin);
		File fo = new File("D:/成都New.mp3");
		FileOutputStream fou = new FileOutputStream(fo);
		BufferedOutputStream bfout = new BufferedOutputStream(fou);
		
		int singleByte = 0; 
		while((singleByte = bfin.read()) != -1) {
			bfout.write(singleByte);
		}
		
		System.out.println("文件拷贝成功！！！");
		
		bfout.flush();
		
		bfout.close();
		bfin.close();

	}

}
