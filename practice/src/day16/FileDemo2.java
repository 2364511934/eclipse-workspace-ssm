package day16;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {

	public static void main(String[] args) throws IOException {
		File f = new File("D:/name.txt");
		FileOutputStream fout = new FileOutputStream(f);
		BufferedOutputStream bfout = new BufferedOutputStream(fout);
		Scanner input = null;
		String name = "";
		while(true) {
			input = new Scanner(System.in);
			System.out.print("请输入名字 以q 结束:");
			name = input.next();
			if(name.equals("q")) {
				System.out.println("程序结束了！！！");
				break;
			}
			/*name = name + "\r\n";
			bfout.write(name.getBytes());*/
			bfout.write(name.getBytes());
			bfout.write("\r\n".getBytes());
			
		}
		bfout.flush();
		bfout.close();
		input.close();
		
	}

}
