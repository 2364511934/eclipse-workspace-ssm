package day15;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;


class Goods{
	private int no;
	private String name;
	private double price;
	private int count;
	
	public Goods() {}
	public Goods(int no, String name, double price, int count) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.count = count;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price + "\t" + count;
	}

}

class ShoppingCart{
	private List<Goods> goodsList;
	
	
	public boolean addGoods(Goods g) {
		if(null == goodsList) {
			goodsList = new ArrayList<>();
			return goodsList.add(g);
		}
		for(Goods goods : goodsList ) {
			if(goods.getNo() == g.getNo()) {
				return false;
			}
		}
		return goodsList.add(g);
	}
	
	public boolean modifyGoods(int no, int count) {
		if(null == goodsList || goodsList.isEmpty()) {
			return false;
		}
		int i = 0;
		for(i=0; i< goodsList.size(); i++ ) {
			if(goodsList.get(i).getNo() == no) {
				break;
			}
		}
		
		if(i < goodsList.size()) {
			goodsList.get(i).setCount(count);
		}
		else {
			System.out.println("not found the NO:" + no);
			return false;
		}
		
		return true;
	}
	
	public boolean deleteGoods(int no) {
		
		if(null == goodsList || goodsList.isEmpty()) {
			return false;
		}
		
		for(int i=0; i< goodsList.size(); i++ ) {
			if(goodsList.get(i).getNo() == no) {
				goodsList.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public int quireGoods() {
		if(null != goodsList) {
			System.out.println("���" + "\t" + "����" + "\t" + "�۸�" + "\t" + " ����");
			goodsList.forEach(System.out::println);
			return goodsList.size();
		}
		return 0;	
	}
		
}

class TestShoppingCart{
	
	private void add(Scanner scanner, ShoppingCart shoppingCart ) {
		Goods goods = new Goods();
		try {
			System.out.print("* ��������:");
			goods.setNo(scanner.nextInt());
			System.out.print("* ����������:");
			goods.setName(scanner.next());
			System.out.print("* ������۸�:");
			//goods.setPrice((double) scanner.nextDouble());
			//goods.setPrice((float) scanner.nextDouble());
			goods.setPrice(scanner.nextDouble());
			System.out.print("* ����������:");
			goods.setCount(scanner.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			scanner.next();
			return;
		}
		
		if(shoppingCart.addGoods(goods)) {
			System.out.println("��ӳɹ�");
		}
	}
	
	private void modify(Scanner scanner, ShoppingCart shoppingCart ) {
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
		if(shoppingCart.modifyGoods(no, count)) {
			System.out.println("�޸������ɹ�");
		}
		
	}
	
	private void delete(Scanner scanner, ShoppingCart shoppingCart ) {
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
		
		if(shoppingCart.deleteGoods(no)) {
			System.out.println("ɾ���ɹ�");
		}
	}
	
	private void quire(Scanner scanner, ShoppingCart shoppingCart ) {
		
		if(0 == shoppingCart.quireGoods()) {
			System.out.println("û����Ʒ");
		}
	}
	
	private void welcome() {
		System.out.println("********************�˵�**********************");
		System.out.println("\t 1.���; 2.�޸�����; 3.ɾ����Ʒ;  4.��ѯȫ��; 5.�˳�" );
		System.out.println("*********************************************");
	}
	
	public void start() {
		//welcome();
		Scanner scanner = new Scanner(System.in);
		ShoppingCart shoppingCart = new ShoppingCart();
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
			case 1: add(scanner, shoppingCart); break;
			case 2: modify(scanner, shoppingCart); break;
			case 3: delete(scanner, shoppingCart); break;
			case 4: quire(scanner,shoppingCart); break;
			case 5: break;
			}
		}
		System.out.println("�����˳�!!!!");
		
	}
	
	
}

public class ShoppingCartDemo {

	public static void main(String[] args) {
		TestShoppingCart testShoppingCart = new TestShoppingCart();
		testShoppingCart.start();
		
		//Deque<String> queue= new ArrayDeque<>();
	}

}
