package day16.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/a.txt");
		// true ��׷��ģʽ false �����֮ǰ�ļ����������
		FileOutputStream fout = new FileOutputStream(file,true);
		
		byte[] b = new byte[1024];
		
		// ����һ������
		fout.write((int)b[0]);
		// ����һ������ ����������д�뵽�ļ��� 
		fout.write(b);
		// �����е����ݲ���д��  write(b, off, len) ��off ������д�룬 д�� len ���ֽ�
		fout.write(b, 1, b.length-1);
		
		fout.close();
	}

}
