package mapper;

import java.util.List;

import entity.Book;

public interface BookMapper {
	// ��ѯ����
	List<Book> queryAll();

	// ��ѯĳ��
	Book queryOne(int bid);

	// ����һ����
	int insertOne(Book book);

	// ����һ���� ��������
	int insertOneByBid(Book book);

	// �����鼮
	int updateOne(Book book);

	// ɾ��һ����
	int deleteOne(int bid);

	// ��ѯ����ͨ��map
	List<Book> queryAllByMap();

	// ��ѯ����ͨ��������ѯ
	List<Book> queryCombo(Book book);
	
	// ��ѯ����ͨ��������ѯ
	List<Book> queryComboByChoose(Book book);
	
	// ��ѯ����ͨ��������ѯ
	List<Book> queryComboByWhere(Book book);
	
	// ��ѯ����ͨ��������ѯ foreach
	List<Book> queryComboByForeach(List<Integer> lists);

}
