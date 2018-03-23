/**
* 要求：310分钟是多少小时余多少分。
* 知识点：运算符
* @author : yn
* @version:1.0.0 2017-12-13
*/
public class Minute
{
	public static void main(String[] args) 
	{
		int minute = 310;
		int hour = minute /60;
		int leftMinute = minute%60;
		System.out.println(minute+"分钟是"+hour+"余"+leftMinute+"分钟");
	}
}
