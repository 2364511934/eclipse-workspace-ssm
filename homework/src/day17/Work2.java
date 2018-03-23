package day17;

import java.io.FileWriter;
import java.io.IOException;

public class Work2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:/haha.txt");
		char a[] = "ºÃºÃÑ§Ï°Java".toCharArray();
		fw.write(a, 0, a.length);
		fw.close();
	}

}
