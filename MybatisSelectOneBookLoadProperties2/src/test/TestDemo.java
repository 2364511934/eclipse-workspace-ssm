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
		// 3 ָ����bid = 3����
		Book book = session.selectOne("com.lee.selectBook", 3);
		System.out.println(book);
		session.close();
		
		// ������
		// Book [bid=3, bname=ˮ䰴�, author=ʩ����, price=34.98]
	}

}
