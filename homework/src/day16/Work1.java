package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Work1 {

	public static void main(String[] args) throws IOException {
		String word = "helloworld";
		//String word = "Œ“ «∏Ë ÷helloworld";
		File f = new File("D:/word.txt");
		FileOutputStream fout = new FileOutputStream(f);
		byte[] b = word.getBytes();
		fout.write(b, 5, 5);
		//fout.write(b, 8, 10);
		
		fout.close();
		
	}

}
