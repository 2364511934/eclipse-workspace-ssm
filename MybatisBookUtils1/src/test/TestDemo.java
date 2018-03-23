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

	// ֱ�Ӳ���ID
	@Test
	public void testMybatis() throws IOException {
		SqlSession session = MybatisUtils.getSession();
		// 3 ָ����bid = 3����
		Book book = session.selectOne("com.lee.selectBook", 3);
		System.out.println(book);
		MybatisUtils.closeSession();

		// ������
		// Book [bid=3, bname=ˮ䰴�, author=ʩ����, price=34.98]
	}
}
