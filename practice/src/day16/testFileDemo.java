package day16;

import java.io.File;
import java.io.FileFilter;

public class testFileDemo {

	public static void outputFile(File f) {
		File[] fa =  f.listFiles();
		for(File fi : fa) {
			if(fi.isFile()) {
				System.out.println("File:"+fi.getPath());
			}
			else {
				System.out.println("Dir:"+fi.getPath());
				outputFile(fi);
			}
		}
	}
	
	public static void main(String[] args) {
		File file = new File("D:\\eclipse-workspace");
		//outputFile(file);
		
		File[] fa =  file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith("a");
			}
		});
		
	}

}
