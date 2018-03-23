package day16.file;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

public class TestFile1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/a.txt");
		//File file = new File("D:/ftp");
		// �鿴�ļ���Ŀ¼�Ƿ����
		System.out.println(file.exists());
		// �������ļ� �����ɹ�����true �ļ������򷵻�false
		file.createNewFile();
		// ��ȡ�ļ������� �������ļ��� a.txt 
		System.out.println(file.getName());
		// ��ȡ�ļ�·�� ָ�������·�� D:/a.txt
		System.out.println(file.getPath());
		// ����·�� D:/a.txt
		System.out.println(file.getAbsolutePath());
		// ��ȡĿ¼  D:/
		System.out.println(file.getParent());
		// �ļ��Ƿ�ɶ� true
		System.out.println(file.canRead());
		// �ļ��Ƿ��д true
		System.out.println(file.canWrite());
		// �Ƿ���һ���ļ� true �ж��Ƿ���һ���ļ�
		System.out.println(file.isFile());
		// ��ȡ�ļ�����޸ĵ�ʱ�� ��λ�Ǻ���
		long time = file.lastModified();
		System.out.println(time);
		// 2018-1-3
		System.out.println(DateFormat.getDateInstance().format(time));
		
		// ��ȡ�ļ����� 0
		long length = file.length();
		System.out.println(length);
		// ɾ���ļ� ����ļ�����ɾ������ true ; false ��ɾ��ʧ�� 
		System.out.println(file.delete());;

	}

}
