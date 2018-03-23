package day13;

interface MyMath<T>{
	T getMin(T[] tArray);
	T getMax(T[] tArray);
}

class MyClass implements MyMath<Integer>{

	@Override
	public Integer getMin(Integer[] tArray) {
		Integer min = tArray[0];
		for(Integer i : tArray) {
			if(min.intValue()>i.intValue()) {
				min = i;
				//System.out.println(min);
			}
		}
		//System.out.println(min);
		return min;
	}

	@Override
	public Integer getMax(Integer[] tArray) {
		Integer max = tArray[0];
		for(Integer i : tArray) {
			if(max.intValue()<i.intValue()) {
				max = i.intValue();
			}
		}
		return max;
	}
	
}


public class MinMaxDemo {

	public static void main(String[] args) {
		Integer[] iArr = {1, 320, 232, 44, 454, 5656};
		
		/*for(Integer i:iArr) {
			System.out.println(i.intValue()+",");
		}*/
		
		MyClass myClass = new MyClass();
		
		System.out.println(myClass.getMin(iArr).intValue());
		System.out.println(myClass.getMax(iArr).intValue());
	}

}
