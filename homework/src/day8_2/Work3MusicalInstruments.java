package day8_2;

class MusicalInstruments{
	public void sound() {
		System.out.println("��������");
	}
}

// ����
class Orchestra extends MusicalInstruments{
	public void sound() {
		System.out.println("��������");
	}
}

// ����˹
class Sykes extends MusicalInstruments{
	public void sound() {
		System.out.println("����˹����");
	}
}


// ѧ��
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
