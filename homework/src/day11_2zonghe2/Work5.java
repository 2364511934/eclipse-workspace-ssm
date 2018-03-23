package day11_2zonghe2;

abstract class Water{ 
	public abstract void water();
} 

interface Filter{
	void filter();
}
interface Buffer {
	void buffer();
}

interface Heating {
	void heating();
} 
interface Sugar {
	void sugar();
}   

class Drinks1  extends Water implements Filter, Buffer{

	@Override
	public void buffer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		
	}
	
} 
class Drinks2 extends Water implements Buffer, Heating{

	@Override
	public void heating() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		
	}
	
} 
class Drinks3 extends Water implements Filter, Sugar{

	@Override
	public void sugar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		
	}
	
}  


public class Work5 {

	public static void main(String[] args) {
		Drinks1 drinks1 = new Drinks1();
		drinks1.water();
		drinks1.filter();
		drinks1.buffer();
		Drinks2 drinks2 = new Drinks2();
		drinks2.water();
		drinks2.buffer();
		drinks2.heating();
		Drinks3 drinks3 = new Drinks3();
		drinks3.water();
		drinks3.filter();
		drinks3.sugar();
	}

}
