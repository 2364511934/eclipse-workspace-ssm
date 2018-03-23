package day9;


//class Animal1{
abstract class Animal1 {
	private String name;
	
	public Animal1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void Shout();
}

interface Terrestral{
	int getLegs();
}



class Cat1 extends Animal1 implements Terrestral {
	private int legs;
	
	@Override
	public int getLegs() {
		return legs;
	}
	
	public Cat1(String name, int legs) {
		super(name);
		this.legs = legs;
	}

	public void Shout() {
		System.out.print("  ������  ");
	}
}

class Duck1 extends Animal1 implements Terrestral{
	private int legs;


	@Override
	public void Shout() {
		// TODO Auto-generated method stub
		System.out.print("  ���ɽ�  ");
	}


	public Duck1(String name, int legs) {
		super(name);
		this.legs = legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	@Override
	public int getLegs() {
		return legs;
	}
	
}

class Dolphin extends Animal1{

	public Dolphin(String name) {
		super(name);
	}

	@Override
	public void Shout() {
		
		System.out.print("  �����໽�  ");
	}
	
	
}

public class AnnimalGardenDemo {

	public static void main(String[] args) {
		/*Animal1[] animal = new Animal1[3];
		animal[0] = new Cat1("è", 4);
		animal[1]= new Duck1("Ѽ��", 2);
	    animal[2]= new Dolphin("����");
	    */
		Animal1[] animal = new Animal1[] {new Cat1("è", 4),new Duck1("Ѽ��", 2), new Dolphin("����") };
	    
	    for(Animal1 ani:animal) {
	    	System.out.print(ani.getName() + " ");
	    	ani.Shout();
	    	if (ani instanceof Cat1 || ani instanceof Duck1) { // �����ж��˾Ϳ���
	    		if (ani instanceof Terrestral) {
	    			Terrestral ter = (Terrestral) ani;
					System.out.println("��" + ter.getLegs() + "��");
	    		}
	    		else {
	    			System.out.println("Unsupport type");
	    		}
	    		
			}
	    	else
	    	{
	    		System.out.println("û����");
	    	}
	    }
	    

	}

}
