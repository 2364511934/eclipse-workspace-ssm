package day10;

import java.util.Scanner;

public class QuireDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入一串数字: ");
		String str = scanner.nextLine();
		StringBuffer[]  strArray = new StringBuffer[3];  // 0 字母 1 数字 2 空格
		
		for(int i=0 ;i<strArray.length; i++) {
			strArray[i] = new StringBuffer();
		}
		
		
		for(int i =0; i<str.length(); i++) {
//			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
			if(Character.isUpperCase(str.charAt(i)) || Character.isLowerCase(str.charAt(i)))  {
				strArray[0].append(str.charAt(i));
			}
//			else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
		    else if(Character.isDigit(str.charAt(i))){
				strArray[1].append(str.charAt(i));
			}
//			else if (str.charAt(i) == ' ') {
			else if(Character.isWhitespace(str.charAt(i))) {
				strArray[2].append(str.charAt(i));
			}
		}
		
		
		System.out.println("字母个数:" + strArray[0].length());
		System.out.println("数字个数:" + strArray[1].length());
		System.out.println("空格个数:" + strArray[2].length());
		
	}

}
