package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.Book;

public class TestDemo {

	// ֱ�Ӳ���ID
	@Test
	public void testMybatis() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 ָ����bid = 3����
		Book book = session.selectOne("com.lee.selectBook", 3);
		System.out.println(book);
		session.close();

		// ������
		// Book [bid=3, bname=ˮ䰴�, author=ʩ����, price=34.98]
	}

	// ͨ���������ID
	@Test
	public void testMybatisSelectBookByBook() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 ָ����bid = 3����
		Book b = new Book();
		b.setBid(3);
		Book book = session.selectOne("com.lee.selectBookByBook", b);
		System.out.println(book);
		session.close();

		// ������
		// Book [bid=3, bname=ˮ䰴�, author=ʩ����, price=34.98]
	}

	// ͨ�� map���� id
	@Test
	public void testMybatisSelectBookByMap() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 ָ����bid = 3����
		Map<String, Integer> map = new HashMap<>();
		map.put("no", 3);
		Book book = session.selectOne("com.lee.selectBookByMap", map);
		System.out.println(book);
		session.close();

		// ������
		// Book [bid=3, bname=ˮ䰴�, author=ʩ����, price=34.98]
	}

	// ��ѯ���е���
	@Test
	public void testMybatisSelectBookAll() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 ָ����bid = 3����

		List<Book> books = session.selectList("com.lee.selectBookAll");
		System.out.println(books);
		session.close();
	}

	// ��ѯ ģ������ ��������
	@Test
	public void testMybatisSelectBookLike() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		List<Book> books = session.selectList("com.lee.selectBookLike", "java");
		System.out.println(books);
		session.close();
	}

	// ��ѯ ģ������ �������ֻ�����������
	@Test
	public void testMybatisSelectBookLike2() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		Book b = new Book();
		b.setBname("java");
		b.setAuthor("��");

		List<Book> books = session.selectList("com.lee.selectBookLike2", b);

		System.out.println(books);
		session.close();
	}

	// ��ҳ��ѯ
	@Test
	public void testMybatisSelectBookByPage() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		Map<String, Integer> map = new HashMap<>();
		map.put("startRow", 0);
		map.put("length", 3);

		List<Book> books = session.selectList("com.lee.selectBookByPage", map);

		System.out.println(books);
		session.close();
	}

	// ����һ������
	@Test
	public void testMybatisInsertBookOne1() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBname("j2ee");
		book.setAuthor("����");
		book.setPrice(4545.56);
		int rows = session.insert("com.lee.insertBookOne1", book);

		System.out.println(rows);
		// �ǵ��޸�����Ҫ�ύ
		session.commit();
		session.close();
	}

	// ����һ������ ������������
	@Test
	public void testMybatisInsertBookOne2() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBname("javaweb");
		book.setAuthor("����");
		book.setPrice(333.56);
		int rows = session.insert("com.lee.insertBookOne2", book);

		System.out.println(rows);
		System.out.println(book);
		// �ǵ��޸�����Ҫ�ύ
		session.commit();
		session.close();
	}

	// ����һ������ ������������ ����һ������
	@Test
	public void testMybatisInsertBookOne3() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBname("javaweb2");
		book.setAuthor("����2");
		book.setPrice(533.56);
		int rows = session.insert("com.lee.insertBookOne3", book);

		System.out.println(rows);
		System.out.println(book);
		// �ǵ��޸�����Ҫ�ύ
		session.commit();
		session.close();
	}

	// ����һ������
	@Test
	public void testMybatisUpdateBookOne1() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBid(24);
		book.setBname("�����澭1");
		book.setAuthor("������1");
		book.setPrice(0.03);
		int rows = session.update("com.lee.updateBookOne1", book);

		System.out.println(rows);
		// �ǵ��޸�����Ҫ�ύ
		session.commit();
		session.close();
	}

	// ɾ��һ������
	@Test
	public void testMybatisDeleteBookOne1() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		int rows = session.delete("com.lee.deleteBookOne1", 24);
		System.out.println(rows);
		// �ǵ��޸�����Ҫ�ύ
		session.commit();
		session.close();
	}
}
