package day9;

interface Letter{
	void LetterHead();
	void LetterBody();
	void LetterTail();
	static void LetterPaper() {
		System.out.println("��ɫ��ֽ");
	}
	
	default void defLetter() {
		System.out.println("def Letter");
	}
}


class HomeLetter implements Letter{

	@Override
	public void LetterHead() {
		Letter.LetterPaper();
		System.out.println("�װ���үү:");
		defLetter();
		
	}

	@Override
	public void LetterBody() {
		// TODO Auto-generated method stub
		System.out.println("���ڻ����ɣ�����Ҳû�취...");
	}

	@Override
	public void LetterTail() {
		System.out.println("2017-12-22 yn");
		
	}
	
}

class LoveLetter implements Letter{

	@Override
	public void LetterHead() {
		Letter.LetterPaper();
		System.out.println("�װ�������:");
		defLetter();
		
	}

	@Override
	public void LetterBody() {
		// TODO Auto-generated method stub
		System.out.println("�ܲ��ܸ�������ʼǱ���������");
	}

	@Override
	public void LetterTail() {
		System.out.println("2017-12-22 xiaonan");
		
	}
	
}

public class LetterDemo {
	public static void main(String[] args) {
		HomeLetter homeLetter = new HomeLetter();
		homeLetter.LetterHead();
		homeLetter.LetterBody();
		homeLetter.LetterTail();
		LoveLetter loveLetter = new LoveLetter();
		loveLetter.LetterHead();
		loveLetter.LetterBody();
		loveLetter.LetterTail();
	}
	
}
