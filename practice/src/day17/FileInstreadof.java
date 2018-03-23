package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInstreadof {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:/template.txt");
		String lin1 = "���!\r\n";
		String lin2 = "�ҵ�������{name}, ����һֻ{type}\r\n";
		String lin3 = "�ҵ�������{master}\r\n";
		fw.write(lin1);
		fw.write(lin2);
		fw.write(lin3);
		fw.close();
		
		FileReader fr = new FileReader("D:/template.txt");
		
		StringBuffer sb = new StringBuffer();
		int temp = 0;
		while(temp != -1) {
			temp = fr.read();
			sb.append((char)temp);
		}
		
		
		String str = sb.toString();
		str=str.replace("{name}", "С��");
		str=str.replace("{type}", "���͹�");
		str=str.replace("{master}", "��ʦ");
		
		fr.close();
		
		fw = new FileWriter("D:/template.txt");
		fw.write(str);
		fw.close();
	}

}
