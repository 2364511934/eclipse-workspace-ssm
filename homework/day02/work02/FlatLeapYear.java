/**
* Ҫ���ж�ƽ������ꡣ
* ���꣺�ܱ�4���������ܱ�100���������ܱ�400������
* ֪ʶ�㣺�����������
* @author:yn
* @version:1.0.0 2017-12-13
*/
import java.util.Scanner;
public class  FlatLeapYear
{
	public static void main(String[] args) 
	{
		int year = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("���������:");
		year = input.nextInt();
		boolean leapYear = false;
		leapYear = year %4 == 0 && year %100 !=0 || year % 400 == 0 ? true:false;
		System.out.println(year+"��" + (leapYear ? "����" : "ƽ��"));
	}
}
