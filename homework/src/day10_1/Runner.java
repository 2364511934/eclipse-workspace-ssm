package day10_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Runner {
	public void welcom() {
		System.out.println("**********************");
		System.out.println("***ͼ�����ϵͳ2.0********");
		System.out.println("**********************");
		
		System.out.println("----------------------------");
		System.out.println("1.��ӣ� 2.�޸ģ�3.ɾ����4����ѯ��5.�˳�");
		System.out.println("-----------------------------");
	}
	public void start() throws ParseException {
		welcom();
		BookMgr mgr = new BookMgr();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("--������ͼ����:");
			int doWhat = scanner.nextInt();
			if(doWhat == 5) {
				System.out.println("�˳�ͼ�����ϵͳ!!!");
				break;
			}
			switch(doWhat) {
			case 1: doAdd(mgr,scanner);break;
			case 2: doModify(mgr,scanner); break;
			case 3: doDelete(mgr,scanner); break;
			case 4: doInquire(mgr,scanner); break;
			default:System.out.println("��Ч����!!!");break;
			}
		}
		
	}
	
	public void doAdd(BookMgr mgr, Scanner scanner) throws ParseException {
		System.out.print("* ������ͼ����: ");
		String no = scanner.next();
		System.out.print("* ������ͼ������: ");
		String name = scanner.next();
		System.out.print("* ������ͼ�鵥��: ");
		double price = scanner.nextDouble();
		System.out.print("* ������ͼ������: ");
		String author = scanner.next();
		System.out.print("* ������ͼ���������(��-��-��): ");
		String dateString = scanner.next();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sf1.parse(dateString); //2017-12-25
		
		Book book = new Book(no, name, price, author, date);
		
		if(mgr.addBook(no, book)) {
			System.out.println("���ͼ��ɹ�");
		}
		else
		{
			System.out.println("���ʧ��");
		}
	}
	
	public void doModify(BookMgr mgr, Scanner scanner) throws ParseException {
		System.out.print("* ������Ҫ�޸ĵ�ͼ����: ");
		String no = scanner.next();
		System.out.print("* �������µ�ͼ������: ");
		String name = scanner.next();
		System.out.print("* �������µ�ͼ�鵥��: ");
		double price = scanner.nextDouble();
		System.out.print("* �������µ�ͼ������: ");
		String author = scanner.next();
		System.out.print("* �������µ�ͼ���������(��-��-��): ");
		String dateString = scanner.next();
		
		SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = sf1.parse(dateString); //2017-12-25
		
		Book book = new Book(no, name, price, author, date);
		
		if(mgr.modifyBook(no, book)) {
			System.out.println("�޸�ͼ��ɹ�");
		}
		else
		{
			System.out.println("�޸�ͼ��ʧ��");
		}
	}
	
	public void doDelete(BookMgr mgr, Scanner scanner) {
		System.out.print("* ������Ҫɾ��ͼ����: ");
		String no = scanner.next();
		
		if(mgr.deleteBook(no)) {
			System.out.println("ɾ��ͼ��ɹ�");
		}
		else
		{
			System.out.println("ɾ��ͼ��ʧ��");
		}
	}
	
	public void  doInquire(BookMgr mgr, Scanner scanner) {
		Book[] bookArray = mgr.inquireBook("");
		
		if(null != bookArray && mgr.getBookNumbers() != 0) {
			System.out.println("���\t����\t����\t����\t��������");
		}
		else {
			System.out.println("û��ͼ��");
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
