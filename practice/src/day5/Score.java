package day5;
/**
 * 
 * @author Administrator
 *
 */
// �ɼ���
public class Score {
	int javase;
	int c;
	int db;
	
	public int sum() {
		return javase+c+db;
	}
	
	public int average() {
		return sum()/3;
	}
}
