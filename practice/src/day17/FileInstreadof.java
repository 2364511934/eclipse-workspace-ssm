package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInstreadof {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:/template.txt");
		String lin1 = "你好!\r\n";
		String lin2 = "我的名字是{name}, 我是一只{type}\r\n";
		String lin3 = "我的主人是{master}\r\n";
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
		str=str.replace("{name}", "小花");
		str=str.replace("{type}", "哈巴狗");
		str=str.replace("{master}", "老师");
		
		fr.close();
		
		fw = new FileWriter("D:/template.txt");
		fw.write(str);
		fw.close();
	}

}
