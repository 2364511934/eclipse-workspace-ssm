package entity;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TestMybatisDemo {

	public static void selectBookAll() {
		try {
			InputStream is = Resources.getResourceAsStream("MyBatis.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = ssf.openSession();
			List<entity.Book> lists = session.selectList("mapper.BookMapper.selectBookAll");
			for(entity.Book book : lists) {
				System.out.println("book:"+book);
			}
			
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 查询一个
	public static void selectBookOne() {
		try {
			InputStream is = Resources.getResourceAsStream("MyBatis.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = ssf.openSession();
			Book book = session.selectOne("mapper.BookMapper.selectBook", 1);
			System.out.println("book:"+book);
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	// 插入一条数据
	public static void insertBookOne(Book book) {
		try {
			InputStream is = Resources.getResourceAsStream("MyBatis.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = ssf.openSession();
			int ret  = session.insert("mapper.BookMapper.insertBook", book);
			session.commit();
			System.out.println("book:"+book);
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 修改一条数据
	public static void updateBookOne(Book book) {
		try {
			InputStream is = Resources.getResourceAsStream("MyBatis.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = ssf.openSession();
			int ret  = session.update("mapper.BookMapper.updateBook", book);
			session.commit();
			System.out.println("book:"+book);
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	// 删除一本书
	public static void deleteBookOne(int bid) {
		try {
			InputStream is = Resources.getResourceAsStream("MyBatis.xml");
			SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = ssf.openSession();
			int ret  = session.update("mapper.BookMapper.deleteBook", bid);
			session.commit();
			System.out.println("book:"+bid);
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		selectBookAll();
		//selectBookOne();
		
		//Book book = new Book("三国志", "陈寿", 34.7);
		
		//insertBookOne(book);
		/*Book book = new Book("三国志", "陈寿", 34.7);
		book.setBid(2);
		updateBookOne(book);*/
		
		/*deleteBookOne(2);*/
		
	}
}
