package day12;


class MyException extends Exception{

	private String str;
	public MyException(String message) {
		str = message;
	}

	@Override
	public String getMessage() {
		return str ;
	}

	@Override
	public String toString() {
		return str;
	}

	@Override
	public void printStackTrace() {
		super.printStackTrace();
	}
	
}

class Score{
	private int score;
	
	public Score() {
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) throws MyException {
		if(score <0 || score > 100) {
			throw new MyException("你的分数不正确");
		}
		this.score = score;
	}

	

}

public class Work1 {
	public static void main(String[] args) {
		Score score = new Score();
		try {
			score.setScore(201);

		}catch(MyException my) {
			System.out.println(my.getMessage());
			my.printStackTrace();
			System.out.println(my);
		}
		finally {
			score = null;
		}
		
	}

}
