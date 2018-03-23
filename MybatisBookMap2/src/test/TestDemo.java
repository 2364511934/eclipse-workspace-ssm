package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.Book;
import mapper.BookMapper;
import util.MybatisUtils;

public class TestDemo {

	// ��ѯ���е���
	@Test
	public void testMybatisQueryAll() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.queryAll();
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// ��ѯĳ��ָ������
	@Test
	public void testMybatisQueryOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		// ��ѯ�� bid = 3 ��������
		Book book = mapper.queryOne(3);
		System.out.println(book);
		MybatisUtils.closeSession();
	}

	// ����һ����
	@Test
	public void testMybatisInsertOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBname("ssm");
		book.setAuthor("ssm ����");
		book.setPrice(88.88);
		int rows = mapper.insertOne(book);
		System.out.println(rows);
		MybatisUtils.closeSession();
	}

	// ����һ����
	@Test
	public void testMybatisInsertOneByBid() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBname("ssm1");
		book.setAuthor("ssm ����1");
		book.setPrice(88.99);
		int rows = mapper.insertOneByBid(book);
		System.out.println(book);
		MybatisUtils.closeSession();
	}

	// ����һ����
	@Test
	public void testMybatisUpdateOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBid(20);
		book.setBname("��ѩ�������߸�С����");
		book.setAuthor("δ֪");
		book.setPrice(1.99);
		int rows = mapper.updateOne(book);
		System.out.println(book);
		MybatisUtils.closeSession();
	}

	// ɾ��һ����
	@Test
	public void testMybatisDeleteOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		int rows = mapper.deleteOne(20);
		System.out.println(rows);
		MybatisUtils.closeSession();
	}

	// ��ѯ���е���
	@Test
	public void testMybatisQueryAllByMap() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.queryAllByMap();
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// ��ѯ���е��� ͨ��������ѯ
	@Test
	public void testMybatisQueryCombo() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBid(0);
		book.setBname(null);
		book.setAuthor("̷��ǿ");
		book.setPrice(0.0);
		List<Book> books = mapper.queryCombo(book);
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// ��ѯ���е��� ͨ��������ѯ
	@Test
	public void testMybatisQueryComboByWhere() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBid(12);
		book.setBname("Java�����ŵ���ͨ");
		List<Book> books = mapper.queryComboByWhere(book);
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// ��ѯ���е��� ͨ��������ѯ
	@Test
	public void testMybatisQueryComboByForeach() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Integer> lists = new ArrayList<>();
		lists.add(3);
		lists.add(4);
		lists.add(6);
		List<Book> books = mapper.queryComboByForeach(lists);
		System.out.println(books);
		MybatisUtils.closeSession();
	}
}
