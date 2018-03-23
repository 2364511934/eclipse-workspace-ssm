package day16.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

public class TestFile1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/a.txt");
		//File file = new File("D:/ftp");
		// 查看文件或目录是否存在
		System.out.println(file.exists());
		// 创建新文件 创建成功返回true 文件存在则返回false
		file.createNewFile();
		// 获取文件的名字 仅仅是文件名 a.txt 
		System.out.println(file.getName());
		// 获取文件路径 指的是相对路径 D:/a.txt
		System.out.println(file.getPath());
		// 绝对路径 D:/a.txt
		System.out.println(file.getAbsolutePath());
		// 获取目录  D:/
		System.out.println(file.getParent());
		// 文件是否可读 true
		System.out.println(file.canRead());
		// 文件是否可写 true
		System.out.println(file.canWrite());
		// 是否是一个文件 true 判断是否是一个文件
		System.out.println(file.isFile());
		// 获取文件最后修改的时间 单位是毫秒
		long time = file.lastModified();
		System.out.println(time);
		// 2018-1-3
		System.out.println(DateFormat.getDateInstance().format(time));
		
		// 获取文件长度 0
		long length = file.length();
		System.out.println(length);
		// 删除文件 如果文件被成删除返回 true ; false 则删除失败 
		System.out.println(file.delete());;

	}

}
