package day8_2;


class Shape{
	public void draw(){
		System.out.println("shape draw");
	}
	
	public void erase(){
		System.out.println("shape erase");
	}
}

class Round extends  Shape{

	@Override
	public void draw() {
		System.out.println("Round draw");
	}

	@Override
	public void erase() {
		System.out.println("Round erase");
	}
	
}


class Square extends Shape{

	@Override
	public void draw() {
		System.out.println("Square draw");
	}

	@Override
	public void erase() {
		System.out.println("Square erase");
	}
	
}

public class Work2ShapeDemo {

	
	public static void main(String[] args) {
		Shape round = new Round();
		Shape square = new Square();
		round.draw();
		round.erase();
		square.draw();
		square.erase();
		
		
	}

}
