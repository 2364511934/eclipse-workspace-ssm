package day10_2;


class MyString{
	public String trim(String str) {
		char[] charArray = str.toCharArray();
		int indexStart = -1;
		int indexEnd = -1;
		
		//  从头开始查找
		for(int i =0; i<charArray.length ; i++) {
			if(-1 == indexStart && charArray[i] != ' ') {
				indexStart = i;
				break;
			}
		}
		
		//从尾部开始查找
		for(int i =charArray.length-1; i>=0 ; i--) {
			if(-1 == indexEnd && charArray[i] != ' ') {
				indexEnd = i;
				break;
			}
		}
		
		
		String strNew = new String(charArray,  indexStart, indexEnd-indexStart+1);
		
		return strNew;
	}
	
	public String reverse(String str, int startIndex, int count) {
		char[] charArray = str.toCharArray();
		char[] charNew = new char[charArray.length];
		
	
		for(int i=0; i<charArray.length; i++) {
			charNew[i] = charArray[i];
		}
		
		for(int i =startIndex+count-1, j=startIndex; i>=startIndex ; i--, j++) {
			charNew[j] = charArray[i];
		}
		
		String strNew = new String(charNew);
		
		return strNew;
	}
	
	public int containTimes(String str, String subStr) {
		int count = 0;
		for(int i = 0; i<=str.length()-subStr.length(); i++) {
			int j ;
			for(j=0; j<subStr.length(); j++) {
				if(str.charAt(j+i) != subStr.charAt(j)) {
					break;
				}
			}
			
			if(j == subStr.length()) {
				count++;
			}
		}
		return count;
	}
	
	public String sort(String str) {
		char[] charArray = str.toCharArray();
		String strNew = null;
		for(int i=0; i<charArray.length; i++) {
			for(int j=0; j<charArray.length-i-1; j++) {
				if(charArray[j] > charArray[j+1]) {
					char ch = charArray[j];
					charArray[j] = charArray[j+1] ;
					charArray[j+1]=ch;
				}
			}
		}
		strNew = new String(charArray);
		return strNew;
	}
	
}

public class Work2StringOpsDemo {

	
	public static void main(String[] args) {
		
		MyString myString = new MyString();
		
		String str = "  123456789 trtrtr  ";
		System.out.println(myString.trim(str));
		
		System.out.println(myString.reverse("1234567890", 2, 4)); //1265437890
		
		System.out.println(myString.containTimes("1233abefereabe4545ab", "ab"));
		
		System.out.println(myString.sort("1233abefereabe4545ab"));
		
		
	}

}
