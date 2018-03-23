package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Goods1 {
	private int no;
	private String name;
	private double price;

	public Goods1() {
	}

	public Goods1(int no, String name, double price) {
		this.no = no;
		this.name = name;
		this.price = price;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price + "\t";
	}

}

class Goods1Shows {
	private static  List<Goods1> goodsList = new ArrayList<>();

	static  {
		goodsList.add(new Goods1(1, "����", 11.9));
		goodsList.add(new Goods1(2, "�·�", 119.9));
		goodsList.add(new Goods1(3, "����", 60.9));
		goodsList.add(new Goods1(4, "����", 15.7));
		goodsList.add(new Goods1(5, "����", 1.9));
	}

	public static int showGoods() {
		System.out.println("���" + "\t" + "����" + "\t" + "�۸�" + "\t" + " ����");
		goodsList.forEach(System.out::println);
		return goodsList.size();
	}
	
	public  static Goods1 findGoods(int no) {
		for(int i=0; i<goodsList.size(); i++) {
			if(goodsList.get(i).getNo() == no)
				return goodsList.get(i);
		}
		return null;
	}
}

class ShoppingCart1{
	private Map<Goods1, Integer> goodsList = new HashMap<>(); 
	
	
	public boolean addGoods(int no, int count) {
		Set<Goods1> set = goodsList.keySet();
		Iterator<Goods1> it =  set.iterator();
		Goods1 g1 = null;
		while(it.hasNext()) {
			g1 = it.next();
			if(g1.getNo() == no) {
				break;
			}
			g1 = null;
		}
		
		// �ҵ�
		if(g1 == null) {
			g1 = Goods1Shows.findGoods(no) ;
			goodsList.put(g1, count);
			return true;
		}
		
		return false;
	}
	
	public boolean modifyGoods(int no, int count) {
		Set<Goods1> set = goodsList.keySet();
		Iterator<Goods1> it =  set.iterator();
		Goods1 g1 = null;
		while(it.hasNext()) {
			g1 = it.next();
			if(g1.getNo() == no) {
				break;
			}
		}
		
		// �ҵ�
		if(g1 != null) {
			goodsList.put(g1, count);
			return true;
		}
		
		return false;
	}
	
	
	public boolean deleteGoods(int no) {
		Set<Goods1> set = goodsList.keySet();
		Iterator<Goods1> it =  set.iterator();
		Goods1 g1 = null;
		while(it.hasNext()) {
			g1 = it.next();
			if(g1.getNo() == no) {
				break;
			}
		}
		
		// �ҵ�
		if(g1 != null) {
			goodsList.remove(g1);
			return true;
		}
		
		return false;
	}
	
	public int quireGoods() {
		if(goodsList.size()>0) {
			System.out.println("���" + "\t" + "����" + "\t" + "�۸�" + "\t" + " ����");
			goodsList.forEach((k,v)->System.out.println(k+" "+v));
			//goodsList.entrySet().forEach(System.out::println);
			return goodsList.size();
		}
		return 0;	
	}
		
}

class TestShoppingCart1{
	
	private void add(Scanner scanner, ShoppingCart1 shoppingCart1 ) {
		int no = 0;
		int count = 0;
		try {
			System.out.print("* ��������:");
			no = scanner.nextInt();
			System.out.print("* ����������:");
			count = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			scanner.next();
			return;
		}
		
		if(shoppingCart1.addGoods(no, count)) {
			System.out.println("��ӳɹ�");
		}
	}
	
	private void modify(Scanner scanner, ShoppingCart1 shoppingCart1 ) {
		int no;
		int count;
		try {
			System.out.print("* ������Ҫ�޸ĵı��:");
			no = scanner.nextInt();
			System.out.print("* ����������:");
			count = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			scanner.next();
			return ;
		}
		if(shoppingCart1.modifyGoods(no, count)) {
			System.out.println("�޸������ɹ�");
		}
		
	}
	
	private void delete(Scanner scanner, ShoppingCart1 shoppingCart1 ) {
		System.out.print("* ������Ҫɾ���ı��:");
		int no;
		try {
			no = scanner.nextInt();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			scanner.next();
			return ;
		}
		
		if(shoppingCart1.deleteGoods(no)) {
			System.out.println("ɾ���ɹ�");
		}
	}
	
	private void quire(Scanner scanner, ShoppingCart1 shoppingCart1 ) {
		
		if(0 == shoppingCart1.quireGoods()) {
			System.out.println("û����Ʒ");
		}
	}
	
	private void welcome() {
		System.out.println("********************�˵�**********************");
		System.out.println("\t 1.���; 2.�޸�����; 3.ɾ����Ʒ;  4.��ѯȫ��; 5.�˳�; 6.��ѯ������Ʒ" );
		System.out.println("*********************************************");
	}
	
	public void start() {
		//welcome();
		Scanner scanner = new Scanner(System.in);
		ShoppingCart1 shoppingCart1 = new ShoppingCart1();
		int choice = 0;
		
		while(choice != 5) {
			welcome();
			try {
				System.out.println("* ������ѡ��:");
				choice = scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				choice = 0;
				scanner.next();
			}
			switch(choice) {
			case 1: add(scanner, shoppingCart1); break;
			case 2: modify(scanner, shoppingCart1); break;
			case 3: delete(scanner, shoppingCart1); break;
			case 4: quire(scanner,shoppingCart1); break;
			case 5: break;
			case 6: Goods1Shows.showGoods();break;
			}
		}
		System.out.println("�����˳�!!!!");
		
	}
	
	
}

public class ShoppingCartMapDemo {

	public static void main(String[] args) {
		TestShoppingCart1 testShoppingCart1 = new TestShoppingCart1();
		testShoppingCart1.start();

	}

}
