/**
* 要求：三个整数，求最大数。
* 知识点：使用条件运算符实现。
* @author:yn
* @version:1.0 
*/

public class CalMaxBetweenThree{
	public static void main(String[] args){
		int num1 =1;
		int num2= 2;
		int num3 =3;
		int max = 0;

		if (num1 > num2 && num1 > num3){
			max = num1;
		}else if (num2 > num1 && num2 > num3){
			max = num2;
		}
		else{
			max = num3;
		}
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("max : " + max);
	}
}