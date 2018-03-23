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

	// 直接查找ID
	@Test
	public void testMybatis() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 指的是bid = 3的书
		Book book = session.selectOne("com.lee.selectBook", 3);
		System.out.println(book);
		session.close();

		// 输出结果
		// Book [bid=3, bname=水浒传, author=施耐庵, price=34.98]
	}

	// 通过对象查找ID
	@Test
	public void testMybatisSelectBookByBook() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 指的是bid = 3的书
		Book b = new Book();
		b.setBid(3);
		Book book = session.selectOne("com.lee.selectBookByBook", b);
		System.out.println(book);
		session.close();

		// 输出结果
		// Book [bid=3, bname=水浒传, author=施耐庵, price=34.98]
	}

	// 通过 map查找 id
	@Test
	public void testMybatisSelectBookByMap() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 指的是bid = 3的书
		Map<String, Integer> map = new HashMap<>();
		map.put("no", 3);
		Book book = session.selectOne("com.lee.selectBookByMap", map);
		System.out.println(book);
		session.close();

		// 输出结果
		// Book [bid=3, bname=水浒传, author=施耐庵, price=34.98]
	}

	// 查询所有的书
	@Test
	public void testMybatisSelectBookAll() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		// 3 指的是bid = 3的书

		List<Book> books = session.selectList("com.lee.selectBookAll");
		System.out.println(books);
		session.close();
	}

	// 查询 模糊查找 根据名字
	@Test
	public void testMybatisSelectBookLike() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		List<Book> books = session.selectList("com.lee.selectBookLike", "java");
		System.out.println(books);
		session.close();
	}

	// 查询 模糊查找 根据名字或者作者名字
	@Test
	public void testMybatisSelectBookLike2() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		Book b = new Book();
		b.setBname("java");
		b.setAuthor("陈");

		List<Book> books = session.selectList("com.lee.selectBookLike2", b);

		System.out.println(books);
		session.close();
	}

	// 分页查询
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

	// 插入一行数据
	@Test
	public void testMybatisInsertBookOne1() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBname("j2ee");
		book.setAuthor("于男");
		book.setPrice(4545.56);
		int rows = session.insert("com.lee.insertBookOne1", book);

		System.out.println(rows);
		// 记得修改数据要提交
		session.commit();
		session.close();
	}

	// 插入一行数据 请求主键返回
	@Test
	public void testMybatisInsertBookOne2() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBname("javaweb");
		book.setAuthor("张扬");
		book.setPrice(333.56);
		int rows = session.insert("com.lee.insertBookOne2", book);

		System.out.println(rows);
		System.out.println(book);
		// 记得修改数据要提交
		session.commit();
		session.close();
	}

	// 插入一行数据 请求主键返回 另外一种做法
	@Test
	public void testMybatisInsertBookOne3() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBname("javaweb2");
		book.setAuthor("张扬2");
		book.setPrice(533.56);
		int rows = session.insert("com.lee.insertBookOne3", book);

		System.out.println(rows);
		System.out.println(book);
		// 记得修改数据要提交
		session.commit();
		session.close();
	}

	// 更新一行数据
	@Test
	public void testMybatisUpdateBookOne1() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();

		Book book = new Book();
		book.setBid(24);
		book.setBname("九阴真经1");
		book.setAuthor("无名氏1");
		book.setPrice(0.03);
		int rows = session.update("com.lee.updateBookOne1", book);

		System.out.println(rows);
		// 记得修改数据要提交
		session.commit();
		session.close();
	}

	// 删除一行数据
	@Test
	public void testMybatisDeleteBookOne1() throws IOException {
		InputStream is = Resources.getResourceAsStream("Mybatis.xml");
		SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = ssf.openSession();
		int rows = session.delete("com.lee.deleteBookOne1", 24);
		System.out.println(rows);
		// 记得修改数据要提交
		session.commit();
		session.close();
	}
}
