package day6;
/**
 * 
 * @author Administrator
 *
 */
public class Person {
	private String sex;
	
	public void setSex(String sex) {
		if(sex.equals("��") || sex.equals("Ů")) {
			this.sex = sex;
		}
		else {
			System.out.println("��Ч�Ա�����");
		}
		return ;
	}
	
	public String getSex() {
		return sex;
	}
}
