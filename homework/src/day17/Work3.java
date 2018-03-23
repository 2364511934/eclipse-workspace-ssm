package day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Work3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("d:/Hello.txt");
		PrintWriter pw = new PrintWriter(file);
		System.out.println("请输入要写入的字符串:");
		String str = br.readLine();
		pw.write(str);
		
		br.close();
		pw.close();
	}

}
