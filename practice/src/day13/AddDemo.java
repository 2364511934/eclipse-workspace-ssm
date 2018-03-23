package day13;

/*interface IAdd{
	<E extends Number> E add(E e1, E e2);
}*/


//class ClassIAdd implements IAdd {
class ClassIAdd  {

	public <E extends Number> E add(E e1, E e2) {
		if(e1 instanceof Double || e1 instanceof Float) 
		{
			//return e1.doubleValue();
		}
		
		//return e1.intValue() + e2.intValue();
		return e1;
	}
}

public class AddDemo {

	public static void main(String[] args) {
		
		ClassIAdd classIAdd = new ClassIAdd();
		classIAdd.add(10, 20);
	}

}
