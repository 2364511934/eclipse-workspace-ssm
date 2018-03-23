package day6;
/**
 * 
 * @author Administrator
 *
 */
public class Person {
	private String sex;
	
	public void setSex(String sex) {
		if(sex.equals("男") || sex.equals("女")) {
			this.sex = sex;
		}
		else {
			System.out.println("无效性别输入");
		}
		return ;
	}
	
	public String getSex() {
		return sex;
	}
}
