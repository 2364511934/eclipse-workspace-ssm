package day10_2;
import java.util.Scanner;

public class Work1StringDemo {

	public static boolean checkFileName(String file) {
		
		if(file == null) {
			return false;
		}
		
		if(file.endsWith("java") && file.charAt(0) != '.') {
			return true;
		}
		
		return false;
	}
	public static boolean checkMail(String mail) {
		if(mail == null) {
			return false;
		}
		
		if(mail.contains(".") && mail.contains("@") &&
				(mail.indexOf('.') > mail.indexOf('@'))) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������ļ���:");
		String file = scanner.nextLine();
		System.out.print("��������������:");
		String mail = scanner.nextLine();
		System.out.println("�ļ����ƣ�"+ (checkFileName(file) ? "��ȷ": "����"));
		System.out.println("���ӣ�"+ (checkMail(mail) ? "��ȷ": "����"));
		System.out.println("��ҵ�ύ�ɹ�!!!");

	}

}
