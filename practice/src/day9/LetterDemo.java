package day9;

interface Letter{
	void LetterHead();
	void LetterBody();
	void LetterTail();
	static void LetterPaper() {
		System.out.println("白色信纸");
	}
	
	default void defLetter() {
		System.out.println("def Letter");
	}
}


class HomeLetter implements Letter{

	@Override
	public void LetterHead() {
		Letter.LetterPaper();
		System.out.println("亲爱的爷爷:");
		defLetter();
		
	}

	@Override
	public void LetterBody() {
		// TODO Auto-generated method stub
		System.out.println("现在还不吧，不好也没办法...");
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
		System.out.println("亲爱的老婆:");
		defLetter();
		
	}

	@Override
	public void LetterBody() {
		// TODO Auto-generated method stub
		System.out.println("能不能给我买个笔记本啊！！！");
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
