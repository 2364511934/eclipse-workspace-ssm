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
import util.MybatisUtils;

public class TestDemo {

	// 直接查找ID
	@Test
	public void testMybatis() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		// 3 指的是bid = 3的书
		Book book = session.selectOne("com.lee.selectBook", 3);
		System.out.println(book);
		MybatisUtils.closeSession();

		// 输出结果
		// Book [bid=3, bname=水浒传, author=施耐庵, price=34.98]
	}
}
