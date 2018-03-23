package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import entity.Book;

public class TestDemo {

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

}
