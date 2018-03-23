package day8_2;

class MusicalInstruments{
	public void sound() {
		System.out.println("乐器声音");
	}
}

// 管弦
class Orchestra extends MusicalInstruments{
	public void sound() {
		System.out.println("管弦声音");
	}
}

// 赛克斯
class Sykes extends MusicalInstruments{
	public void sound() {
		System.out.println("赛克斯声音");
	}
}


// 学生
class Student{
	public void play( MusicalInstruments musicalInstruments) {
		musicalInstruments.sound();
	}
}


public class Work3MusicalInstruments {

	public static void main(String[] args) {
		Sykes sykes = new Sykes();
		Orchestra orchestra = new Orchestra();
		Student student= new Student();
		
		student.play(sykes);
		student.play(orchestra);

	}

}
