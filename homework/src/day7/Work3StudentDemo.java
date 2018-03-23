package day7;

public class Work3StudentDemo {

	public static void main(String[] args) {
		Work3Student  a = new Work3Student("a");
		Work3Student  b = new Work3Student("b");
		Work3Student  c = new Work3Student("c");
		/*
		 * (2)	编写Main类的main方法，实例化3个学生对象a,b,c 。a接1次水，喝2次，b接1次水，
		 *      喝完，又接一次，c接1次，喝7次，他们每个人操作后都要查询一次。观察打印结果，注释总结。
		 */
		a.receiveWater();
		System.out.println("饮水机的水还剩:" + Work3Student.getDrinkingFountains());
		a.drink();
		System.out.println(a.getName() +":还剩:" + a.getWater());
		a.drink();
		System.out.println(a.getName() +":还剩:" + a.getWater());
		b.receiveWater();
		System.out.println("饮水机的水还剩:" + Work3Student.getDrinkingFountains());
		while(b.drink()>0) {
			System.out.println(b.getName() +":还剩:" + b.getWater());
		}
		b.receiveWater();
		System.out.println("饮水机的水还剩:" + Work3Student.getDrinkingFountains());
		c.receiveWater();
		System.out.println("饮水机的水还剩:" + Work3Student.getDrinkingFountains());
		for(int i=0; i<7; i++) {
			c.drink();
			System.out.println(c.getName() +":还剩:" + c.getWater());
		}
		System.out.println("饮水机的水还剩:" + Work3Student.getDrinkingFountains());
	}

}
