package day17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("d:/word.txt");
		
		char[] cbuf = new char[1024];
		int n = fr.read(cbuf);
		fr.close();
		
		/*String str = new String(cbuf,0,n);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		*/
		FileWriter fw = new FileWriter("d:/word.reverse.txt");
		
		
		for(int i=n-1; i>=0; i--) {
			fw.write(cbuf[i]);
		}
		//fw.write(sb.toString());
		fw.close();
		
		
	}

}
