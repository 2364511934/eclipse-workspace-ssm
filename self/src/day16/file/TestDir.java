package day16.file;

import java.io.File;
import java.sql.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class TestDir {

	public static void main(String[] args) {
		// 可以
		File file = new File("D:/ftp");
		// 也可以
		File file2 = new File("D:\\ftp");
		// 是否是目录 true
		System.out.println(file.isDirectory());
		// 目录是否存在 true
		System.out.println(file.exists());

		// 获取目录下的文件名
		String[] names = file.list();
		// 输出 同学们，只能复制不能删除.txt
		// 输出 软件开发常用词汇表.docx
		Arrays.stream(names).forEach(System.out::println);

		// 过滤条件 文件名字以 java 结尾
		Arrays.stream(names).filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.endsWith("java");
			}
		});

		// 或者 使用 lamda 表达式 过滤条件 文件名字以 java 结尾
		Arrays.stream(names).filter((t) -> t.endsWith("java"));

		// 获取文件列表
		File[] files = file.listFiles();
		// D:\ftp\同学们，只能复制不能删除.txt
		// D:\ftp\软件开发常用词汇表.docx
		Arrays.stream(files).forEach(System.out::println);
		
		
		// 添加过滤条件 文件长度大于20 的输出
		Arrays.stream(files).filter(new Predicate<File>() {
			@Override
			public boolean test(File t) {
				return t.length() > 20;
			}
		});
		// 或者 Lamba表达式形式  添加过滤条件 文件长度大于20 的输出
		Arrays.stream(files).filter((t)->t.length() > 20);

	}

}
