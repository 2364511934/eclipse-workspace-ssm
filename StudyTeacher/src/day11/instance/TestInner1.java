package day11.instance;
class Cat{//外部类
	private double weight;
	public Cat(double weight) {
		this.weight = weight;
	}
	
	class CatBody{//内部类
		private String color;
		public CatBody(String color) {
			this.color = color;
		}
		public void show() {
			//内部类 可以直接访问外部类的成员  Cat.this.weight 
			//内部类中 隐含了 一个外部类对象  Cat.this
			System.out.println("颜色："+color+","+weight);
			System.out.println("颜色："+color+","+ Cat.this.weight);
		}
	}
	public void display() {
		System.out.println("重量："+weight);
		//颜色  外部类  访问  内部类的成员  用对象调用
		CatBody body = new CatBody("白色");
		body.show();
	}
}
public class TestInner1 {
	public static void main(String[] args) {
	/*	Cat cat = new Cat(33.3);
		cat.display();
		//必须 用 外部类 对象来 创建 内部类对象，属于 外部类对象的
		Cat.CatBody body = cat.new CatBody("黑色");
		body.show();
		
		Cat.CatBody body1 = cat.new CatBody("ggg");
		body1.show();*/
		
		Cat cat = new Cat(33.3);
		cat.display();
		
		Cat.CatBody  body = cat.new CatBody("黑色");
		body.show();
		
		
	}

}
