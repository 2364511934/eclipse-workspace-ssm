package day16.file;

import java.io.File;
import java.sql.Array;
import java.util.Arrays;
import java.util.function.Predicate;

public class TestDir {

	public static void main(String[] args) {
		// ����
		File file = new File("D:/ftp");
		// Ҳ����
		File file2 = new File("D:\\ftp");
		// �Ƿ���Ŀ¼ true
		System.out.println(file.isDirectory());
		// Ŀ¼�Ƿ���� true
		System.out.println(file.exists());

		// ��ȡĿ¼�µ��ļ���
		String[] names = file.list();
		// ��� ͬѧ�ǣ�ֻ�ܸ��Ʋ���ɾ��.txt
		// ��� ����������ôʻ��.docx
		Arrays.stream(names).forEach(System.out::println);

		// �������� �ļ������� java ��β
		Arrays.stream(names).filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.endsWith("java");
			}
		});

		// ���� ʹ�� lamda ���ʽ �������� �ļ������� java ��β
		Arrays.stream(names).filter((t) -> t.endsWith("java"));

		// ��ȡ�ļ��б�
		File[] files = file.listFiles();
		// D:\ftp\ͬѧ�ǣ�ֻ�ܸ��Ʋ���ɾ��.txt
		// D:\ftp\����������ôʻ��.docx
		Arrays.stream(files).forEach(System.out::println);
		
		
		// ��ӹ������� �ļ����ȴ���20 �����
		Arrays.stream(files).filter(new Predicate<File>() {
			@Override
			public boolean test(File t) {
				return t.length() > 20;
			}
		});
		// ���� Lamba���ʽ��ʽ  ��ӹ������� �ļ����ȴ���20 �����
		Arrays.stream(files).filter((t)->t.length() > 20);

	}

}
