package day16.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Array;
import java.util.Arrays;

public class TestFileStream {

	public static void main(String[] args) throws IOException {
		// ���ļ�
		File file = new File("D:/Java���Ϲ���.jpg");
		FileInputStream finStream = new FileInputStream(file);
		int temp = 0;
		/*// ��ȡ�ļ������� ����  -1 �����ļ���β
		while((temp=finStream.read()) != -1) {
			System.out.println(temp);
		}*/
		
		// ��ȡ�ļ�����
		byte[] b = new byte[finStream.available()];
		//byte[] b = new byte[(int)file.length()];
		//finStream.read(b);
		finStream.read(b, 10, 30);
		//finStream.read
		// gbk ���ֱ��뷽ʽ
		String str = new String(b, "gbk");
		System.out.println(str);
		for(byte bb : b) {
			System.out.println(bb);
		}
		//System.out.println(b.toString());
		finStream.close();
	}

}
