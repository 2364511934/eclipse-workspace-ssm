package day10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentyDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile("[1-1]{1}[0-9]{10}");
		System.out.print("请输入一个手机号码: ");
		String str = scanner.next();
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.matches());
		
		
		Pattern pattern1 = Pattern.compile("[0-9a-zA-Z]{4,10}");
		System.out.print("请输入一个密码: ");
		str = scanner.next();
		Matcher matcher1 = pattern1.matcher(str);
		System.out.println(matcher1.matches());
		
		Pattern pattern2 = Pattern.compile("[a-zA-Z]{1}[0-9a-zA-Z]{3,15}");
		System.out.print("请输入一个密码: ");
		str = scanner.next();
		Matcher matcher2 = pattern2.matcher(str);
		System.out.println(matcher2.matches());
		
	}

}
