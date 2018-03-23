package day10;

public class StringDemo {

	public static void main(String[] args) {
		String str = new String("Hello");

		// concat ����
		// System.out.println(str.concat(null)); // �����������
		System.out.println(str.concat("")); // ֱ�ӷ���str
		System.out.println(str.concat("world")); // ����world �����µ��ַ��� "Helloworld"

		// length����
		String str1 = null;
		// System.out.println(str1.length()); // java.lang.NullPointerException
		System.out.println("".length()); // 0
		System.out.println(str.length()); // "Hello" // 5

		// equals ����
		String str2 = null;
		// System.out.println(str2.equals(str2)); // java.lang.NullPointerException
		String str3 = new String("Hello");
		System.out.println(str3.equals("Hello")); // true ��αȽ��ַ����е�����
		System.out.println(str3.equals("hello")); // false ����ͬ
		System.out.println(str3.equals(str3)); // true ������ͬ

		// equalsIgnoreCase ����
		String str4 = null;
		// System.out.println(str4.equalsIgnoreCase(str4)); //
		// java.lang.NullPointerException
		String str5 = new String("Hello");
		System.out.println(str5.equalsIgnoreCase("Hello")); // true ��αȽ��ַ����е�����
		System.out.println(str5.equalsIgnoreCase("hELlo33")); // false ����ͬ
		System.out.println(str5.equalsIgnoreCase(str5)); // true ������ͬ

		// toUpperCase ����
		String str6 = new String("Hello");
		System.out.println(str6.toUpperCase()); // HELLO

		// toLowerCase ����
		String str7 = new String("Hello");
		System.out.println(str7.toLowerCase()); // hello

		// indexof
		String str8 = new String("Hellohello");
		System.out.println(str8.indexOf("he")); // �ַ��� he �״γ��ֵ�λ�� 5
		System.out.println(str8.indexOf('h')); // �ַ�h �״γ��ֵ�λ�� 5

		// lastIndexof
		String str9 = new String("Hellohello");
		System.out.println(str9.lastIndexOf("ll")); // �ַ��� ll �������� �״γ��ֵ�λ��  7
		System.out.println(str9.lastIndexOf('l')); // �ַ�l �������� �״γ��ֵ�λ��  8
		
		// charAt
		String str10 = new String("Hello");
		System.out.println(str9.charAt(2)); // �ַ� l
		System.out.println(str9.charAt(89)); // ������ java.lang.StringIndexOutOfBoundsExceptin

	}

}
