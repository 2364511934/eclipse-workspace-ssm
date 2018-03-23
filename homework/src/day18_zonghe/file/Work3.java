package day18_zonghe.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Goods implements Serializable {
	private static final long serialVersionUID = -9082472986024310200L;
	private int no;
	private String name;
	private double price;
	public Goods(int no, String name, double price) {
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
		return "Goods [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	public void showGoods() {
		System.out.println(toString());
	}
}

public class Work3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Goods g1 = new Goods(1, "y1", 2323.43545);
		Goods g2 = new Goods(2, "y2", 245.9);
		Goods g3 = new Goods(3, "y3", 233.3545);
		Set<Goods> setIn = new HashSet<Goods>();
		setIn.add(g1);
		setIn.add(g2);
		setIn.add(g3);
		FileOutputStream fos = new FileOutputStream("D:\\Goods.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(setIn);
		oos.close();
		System.out.println("写入文件成功!!!");
		
		FileInputStream fis = new FileInputStream("D:\\Goods.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Set<Goods> setOut = new HashSet<Goods>();
		setOut = (Set<Goods>) ois.readObject();
		
		setOut.iterator().forEachRemaining(System.out::println);
		System.out.println("读取文件成功!!!");
		
	}

}
