package day17;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Work5 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter pw = new PrintWriter("d:/a.txt");
		String s1 = "星期一";
		String s2 = "星期二";
		String s3 = "星期三";
		String s4 = "星期四";
		String s5 = "星期五";
		String s6 = "星期六";
		String s7 = "星期日";
		
		pw.write(s1);
		pw.write("\r\n");
		pw.write(s2);
		pw.write("\r\n");
		pw.write(s3);
		pw.write("\r\n");
		pw.write(s4);
		pw.write("\r\n");
		pw.write(s5);
		pw.write("\r\n");
		pw.write(s6);
		pw.write("\r\n");
		pw.write(s7);
		pw.write("\r\n");
		pw.close();

	}

}
