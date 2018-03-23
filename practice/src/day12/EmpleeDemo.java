package day12;

import javax.management.RuntimeErrorException;

class SexException extends RuntimeException{
	private String str;

	public SexException(String message) {
		super(message);
		str = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "getMessage():" + str;
	}

	@Override
	public void printStackTrace() {
		System.out.println("printStackTrace : "+str);
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}
	
	
	
}

class Emplee{
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) throws SexException {
		if(!sex.equals("男") && !sex.equals("女")) {
			throw new SexException("必须输入男或者女");
		}
		this.sex = sex;
	}
	
	public void setSex2(String sex)  {
		if(!sex.equals("男") || !sex.equals("女")) {
			
		}
		this.sex = sex;
	}
	
	
}

public class EmpleeDemo {

	public static void main(String[] args) {
		Emplee emplee = new Emplee();
		try {
			emplee.setSex("男ww");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("我一定能执行..................****");
		}
		
	}

}
