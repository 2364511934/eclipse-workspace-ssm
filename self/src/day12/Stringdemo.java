package day12;

public class Stringdemo {

	public static void main(String[] args) {
		// 2017-12-25 第十天笔记
		String str = "hello";
		// 字符串连接
		System.out.println(str.concat("world"));
		// 字符串长度 5
		System.out.println(str.length());
		// 比较字符串是否相同
		System.out.println(str.equals("hello"));
		// 比较字符串是否相同 忽略大小写
		System.out.println(str.equalsIgnoreCase("heLLo"));
		// 将字符串转化为大写
		System.out.println(str.toUpperCase());
		// 将字符串转化为小写
		System.out.println(str.toLowerCase());
		// 指定的字符串的位置 首次出现的位置 找到则返回index 位置
		System.out.println(str.indexOf('h'));
		// 指定的字符串的位置 首次出现的位置 没有找到则返回 -1
		System.out.println(str.indexOf("L"));

		// 指定的字符串的位置 后面首次出现的位置 找到则返回index 位置
		System.out.println(str.lastIndexOf('h'));
		// 指定的字符串的位置 后面首次出现的位置 没有找到则返回 -1
		System.out.println(str.lastIndexOf("L"));
		
		// 指定索引 找到字符
		System.out.println(str.charAt(0));
		
		// substring [start, end)
		System.out.println(str.substring(0, 3));
		// [3, end]
		System.out.println(str.substring(3));
		// trim 去除前后的空格
		// 替换 h->H 单个字符
		System.out.println(str.replace('h', 'H'));
		str = "abcdefg hilom ndff ddfd";
		// startWith 是否以 abc 开头
		System.out.println(str.startsWith("abc"));
		// endWith 是否以 ddfd 结尾
		System.out.println(str.endsWith("ddfd"));
		
		// compareTo  自然顺序比较字符串 > = < 
		System.out.println(str.compareTo("abzdefghilomndffddfd"));
		// 转化为字符数组
		char[] ch = str.toCharArray();
		System.out.println();
		
		// split 将字符串切分为字符串数组
		String[] strArray = str.split(" ");
		
		// contains 包含子串
		System.out.println(str.contains("abz"));
	}

}
