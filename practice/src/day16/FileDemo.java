package day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("d:/Java集合构成.jpg");
		FileInputStream fint = new FileInputStream(f);
		FileOutputStream fout = new FileOutputStream("d:/Java集合构成New.jpg");
		
		/*byte[] b = new byte[(int)f.length()];
		
		fint.read(b);
		fout.write(b);*/
		
		/*byte[] b = new byte[1024];
		
		while(fint.read(b) > 0) {
			fout.write(b);
		}*/
		
		int temp = 0;
		
		while((temp = fint.read()) != -1 ) {
			fout.write(temp);
		}
		
		fint.close();
		fout.close();
		
		
	
	}

}
