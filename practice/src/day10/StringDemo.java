package day10;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("Hello");

		// concat 测试
		// System.out.println(str.concat(null)); // 这种情况崩溃
		System.out.println(str.concat("")); // 直接返回str
		System.out.println(str.concat("world")); // 连接world 生成新的字符串 "Helloworld"

		// length测试
		String str1 = null;
		// System.out.println(str1.length()); // java.lang.NullPointerException
		System.out.println("".length()); // 0
		System.out.println(str.length()); // "Hello" // 5

		// equals 测试
		String str2 = null;
		// System.out.println(str2.equals(str2)); // java.lang.NullPointerException
		String str3 = new String("Hello");
		System.out.println(str3.equals("Hello")); // true 逐次比较字符串中的数字
		System.out.println(str3.equals("hello")); // false 不相同
		System.out.println(str3.equals(str3)); // true 引用相同

		// equalsIgnoreCase 测试
		String str4 = null;
		// System.out.println(str4.equalsIgnoreCase(str4)); //
		// java.lang.NullPointerException
		String str5 = new String("Hello");
		System.out.println(str5.equalsIgnoreCase("Hello")); // true 逐次比较字符串中的数字
		System.out.println(str5.equalsIgnoreCase("hELlo33")); // false 不相同
		System.out.println(str5.equalsIgnoreCase(str5)); // true 引用相同

		// toUpperCase 测试
		String str6 = new String("Hello");
		System.out.println(str6.toUpperCase()); // HELLO

		// toLowerCase 测试
		String str7 = new String("Hello");
		System.out.println(str7.toLowerCase()); // hello

		// indexof
		String str8 = new String("Hellohello");
		System.out.println(str8.indexOf("he")); // 字符串 he 首次出现的位置 5
		System.out.println(str8.indexOf('h')); // 字符h 首次出现的位置 5

		// lastIndexof
		String str9 = new String("Hellohello");
		System.out.println(str9.lastIndexOf("ll")); // 字符串 ll 从右往左 首次出现的位置  7
		System.out.println(str9.lastIndexOf('l')); // 字符l 从右往左 首次出现的位置  8
		
		// charAt
		String str10 = new String("Hello");
		System.out.println(str9.charAt(2)); // 字符 l
		System.out.println(str9.charAt(89)); // 不存在 java.lang.StringIndexOutOfBoundsExceptin

	}

}
