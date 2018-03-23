package day6;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "12345676";
		String str2 = "12345676";
		String str3 = new String("12345676");
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};
		String[] arrString1 = {"123456", "1234567"};
		String[] arrString2 = {"123456", "1234567"};
		
		if (arrString1[1] == arrString2[1])
		{
			System.out.println("String[] equal");
		}
		else
		{
			System.out.println("String[] unequal");
		}
		
		if (array1 == array2)
		{
			System.out.println("array equal");
		}
		else
		{
			System.out.println("array unequal");
		}
		
		if (str1.intern() == str3.intern())
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("unequal");
		}

	}

}
