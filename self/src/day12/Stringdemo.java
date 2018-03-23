package day12;

public class Stringdemo {

	public static void main(String[] args) {
		// 2017-12-25 ��ʮ��ʼ�
		String str = "hello";
		// �ַ�������
		System.out.println(str.concat("world"));
		// �ַ������� 5
		System.out.println(str.length());
		// �Ƚ��ַ����Ƿ���ͬ
		System.out.println(str.equals("hello"));
		// �Ƚ��ַ����Ƿ���ͬ ���Դ�Сд
		System.out.println(str.equalsIgnoreCase("heLLo"));
		// ���ַ���ת��Ϊ��д
		System.out.println(str.toUpperCase());
		// ���ַ���ת��ΪСд
		System.out.println(str.toLowerCase());
		// ָ�����ַ�����λ�� �״γ��ֵ�λ�� �ҵ��򷵻�index λ��
		System.out.println(str.indexOf('h'));
		// ָ�����ַ�����λ�� �״γ��ֵ�λ�� û���ҵ��򷵻� -1
		System.out.println(str.indexOf("L"));

		// ָ�����ַ�����λ�� �����״γ��ֵ�λ�� �ҵ��򷵻�index λ��
		System.out.println(str.lastIndexOf('h'));
		// ָ�����ַ�����λ�� �����״γ��ֵ�λ�� û���ҵ��򷵻� -1
		System.out.println(str.lastIndexOf("L"));
		
		// ָ������ �ҵ��ַ�
		System.out.println(str.charAt(0));
		
		// substring [start, end)
		System.out.println(str.substring(0, 3));
		// [3, end]
		System.out.println(str.substring(3));
		// trim ȥ��ǰ��Ŀո�
		// �滻 h->H �����ַ�
		System.out.println(str.replace('h', 'H'));
		str = "abcdefg hilom ndff ddfd";
		// startWith �Ƿ��� abc ��ͷ
		System.out.println(str.startsWith("abc"));
		// endWith �Ƿ��� ddfd ��β
		System.out.println(str.endsWith("ddfd"));
		
		// compareTo  ��Ȼ˳��Ƚ��ַ��� > = < 
		System.out.println(str.compareTo("abzdefghilomndffddfd"));
		// ת��Ϊ�ַ�����
		char[] ch = str.toCharArray();
		System.out.println();
		
		// split ���ַ����з�Ϊ�ַ�������
		String[] strArray = str.split(" ");
		
		// contains �����Ӵ�
		System.out.println(str.contains("abz"));
	}

}
