package mapper;

import java.util.List;

import entity.Book;

public interface BookMapper {
	// 查询所有
	List<Book> queryAll();

	// 查询某个
	Book queryOne(int bid);

	// 插入一本书
	int insertOne(Book book);

	// 插入一本书 带回主键
	int insertOneByBid(Book book);

	// 更新书籍
	int updateOne(Book book);

	// 删除一本书
	int deleteOne(int bid);

	// 查询所有通过map
	List<Book> queryAllByMap();

	// 查询所有通过条件查询
	List<Book> queryCombo(Book book);
	
	// 查询所有通过条件查询
	List<Book> queryComboByChoose(Book book);
	
	// 查询所有通过条件查询
	List<Book> queryComboByWhere(Book book);
	
	// 查询所有通过条件查询 foreach
	List<Book> queryComboByForeach(List<Integer> lists);

}
