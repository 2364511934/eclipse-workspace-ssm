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
		System.out.print("请输入文件名:");
		String file = scanner.nextLine();
		System.out.print("请输入邮箱名字:");
		String mail = scanner.nextLine();
		System.out.println("文件名称："+ (checkFileName(file) ? "正确": "错误"));
		System.out.println("电子："+ (checkMail(mail) ? "正确": "错误"));
		System.out.println("作业提交成功!!!");

	}

}
