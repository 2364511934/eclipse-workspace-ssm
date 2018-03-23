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

	// 查询所有的书
	@Test
	public void testMybatisQueryAll() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.queryAll();
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// 查询某个指定的书
	@Test
	public void testMybatisQueryOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		// 查询书 bid = 3 的书名字
		Book book = mapper.queryOne(3);
		System.out.println(book);
		MybatisUtils.closeSession();
	}

	// 插入一本书
	@Test
	public void testMybatisInsertOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBname("ssm");
		book.setAuthor("ssm 作者");
		book.setPrice(88.88);
		int rows = mapper.insertOne(book);
		System.out.println(rows);
		MybatisUtils.closeSession();
	}

	// 插入一本书
	@Test
	public void testMybatisInsertOneByBid() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBname("ssm1");
		book.setAuthor("ssm 作者1");
		book.setPrice(88.99);
		int rows = mapper.insertOneByBid(book);
		System.out.println(book);
		MybatisUtils.closeSession();
	}

	// 更新一本书
	@Test
	public void testMybatisUpdateOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBid(20);
		book.setBname("白雪公主和七个小矮人");
		book.setAuthor("未知");
		book.setPrice(1.99);
		int rows = mapper.updateOne(book);
		System.out.println(book);
		MybatisUtils.closeSession();
	}

	// 删除一本书
	@Test
	public void testMybatisDeleteOne() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		int rows = mapper.deleteOne(20);
		System.out.println(rows);
		MybatisUtils.closeSession();
	}

	// 查询所有的书
	@Test
	public void testMybatisQueryAllByMap() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		List<Book> books = mapper.queryAllByMap();
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// 查询所有的书 通过条件查询
	@Test
	public void testMybatisQueryCombo() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBid(0);
		book.setBname(null);
		book.setAuthor("谭浩强");
		book.setPrice(0.0);
		List<Book> books = mapper.queryCombo(book);
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// 查询所有的书 通过条件查询
	@Test
	public void testMybatisQueryComboByWhere() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		BookMapper mapper = session.getMapper(BookMapper.class);
		Book book = new Book();
		book.setBid(12);
		book.setBname("Java从入门到精通");
		List<Book> books = mapper.queryComboByWhere(book);
		System.out.println(books);
		MybatisUtils.closeSession();
	}

	// 查询所有的书 通过条件查询
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
