package day10_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Runner {
	public void welcom() {
		System.out.println("**********************");
		System.out.println("***图书管理系统2.0********");
		System.out.println("**********************");
		
		System.out.println("----------------------------");
		System.out.println("1.添加； 2.修改；3.删除；4。查询；5.退出");
		System.out.println("-----------------------------");
	}
	public void start() throws ParseException {
		welcom();
		BookMgr mgr = new BookMgr();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("--请输入图书编号:");
			int doWhat = scanner.nextInt();
			if(doWhat == 5) {
				System.out.println("退出图书管理系统!!!");
				break;
			}
			switch(doWhat) {
			case 1: doAdd(mgr,scanner);break;
			case 2: doModify(mgr,scanner); break;
			case 3: doDelete(mgr,scanner); break;
			case 4: doInquire(mgr,scanner); break;
			default:System.out.println("无效输入!!!");break;
			}
		}
		
	}
	
	public void doAdd(BookMgr mgr, Scanner scanner) throws ParseException {
		System.out.print("* 请输入图书编号: ");
		String no = scanner.next();
		System.out.print("* 请输入图书名字: ");
		String name = scanner.next();
		System.out.print("* 请输入图书单价: ");
		double price = scanner.nextDouble();
		System.out.print("* 请输入图书作者: ");
		String author = scanner.next();
		System.out.print("* 请输入图书出版日期(年-月-日): ");
		String dateString = scanner.next();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sf1.parse(dateString); //2017-12-25
		
		Book book = new Book(no, name, price, author, date);
		
		if(mgr.addBook(no, book)) {
			System.out.println("添加图书成功");
		}
		else
		{
			System.out.println("添加失败");
		}
	}
	
	public void doModify(BookMgr mgr, Scanner scanner) throws ParseException {
		System.out.print("* 请输入要修改的图书编号: ");
		String no = scanner.next();
		System.out.print("* 请输入新的图书名字: ");
		String name = scanner.next();
		System.out.print("* 请输入新的图书单价: ");
		double price = scanner.nextDouble();
		System.out.print("* 请输入新的图书作者: ");
		String author = scanner.next();
		System.out.print("* 请输入新的图书出版日期(年-月-日): ");
		String dateString = scanner.next();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sf1.parse(dateString); //2017-12-25
		
		Book book = new Book(no, name, price, author, date);
		
		if(mgr.modifyBook(no, book)) {
			System.out.println("修改图书成功");
		}
		else
		{
			System.out.println("修改图书失败");
		}
	}
	
	public void doDelete(BookMgr mgr, Scanner scanner) {
		System.out.print("* 请输入要删除图书编号: ");
		String no = scanner.next();
		
		if(mgr.deleteBook(no)) {
			System.out.println("删除图书成功");
		}
		else
		{
			System.out.println("删除图书失败");
		}
	}
	
	public void  doInquire(BookMgr mgr, Scanner scanner) {
		Book[] bookArray = mgr.inquireBook("");
		
		if(null != bookArray && mgr.getBookNumbers() != 0) {
			System.out.println("编号\t名称\t单价\t作者\t出版日期");
		}
		else {
			System.out.println("没有图书");
			return;
		}
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0; i<bookArray.length && i<mgr.getBookNumbers(); i++) {
			System.out.print(bookArray[i].getNo()+
					"\t"+bookArray[i].getName()+"\t"+bookArray[i].getPrice()+
					"\t" + bookArray[i].getAuthor()+"\t"+
					sf1.format(bookArray[i].getDate())+"\n");
		}
		System.out.println();
	}
}
