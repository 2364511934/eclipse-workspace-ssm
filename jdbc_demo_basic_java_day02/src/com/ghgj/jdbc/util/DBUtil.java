package com.ghgj.jdbc.util;

import java.awt.print.Book;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class DBUtil {
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://lee:3306/db_test?useUnicode=true&characterEncoding=UTF-8";
	private static String username = "root";
	private static String password = "1234";
	private static Connection conn;
	private static Object REAL = new Object();
	private static Map<String, Object> types = new HashMap<>();

	static {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			/*types.put("boolean", REAL);
			types.put("byte", REAL);
			types.put("short", REAL);
			types.put("int", REAL);
			types.put("long", REAL);
			types.put("char", REAL);
			types.put("float", REAL);
			types.put("double", REAL);*/
			types.put("java.lang.Boolean", REAL);
			types.put("java.lang.Byte", REAL);
			types.put("java.lang.Short", REAL);
			types.put("java.lang.Integer", REAL);
			types.put("java.lang.Long", REAL);
			types.put("java.lang.Character", REAL);
			types.put("java.lang.Float", REAL);
			types.put("java.lang.Double", REAL);
			types.put("java.lang.String", REAL);
			types.put("java.util.Date", REAL);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static int insert(Object obj) {
		int result = -1;
		try {
			Class<? extends Object> clazz = obj.getClass();
			Map<String, Map<String, Object>> config = getConfig(clazz, obj);
			if (config == null) {
				throw new RuntimeException(clazz.getName() + " has't properties");
			}
			StringBuilder fieldBuilder = new StringBuilder();
			StringBuilder valueBuilder = new StringBuilder();
			fieldBuilder.append("insert into " + clazz.getSimpleName().toLowerCase()).append("(");
			valueBuilder.append("values(");
			config.forEach((k, v) -> {
				Object val = v.get("value");
				if (val != null) {
					fieldBuilder.append(k).append(",");
					valueBuilder.append("?").append(",");
				}
			});
			int fIndex = fieldBuilder.lastIndexOf(",");
			int vIndex = valueBuilder.lastIndexOf(",");
			fieldBuilder.delete(fIndex, fIndex + 1);
			valueBuilder.delete(vIndex, vIndex + 1);

			fieldBuilder.append(")");
			valueBuilder.append(")");
			fieldBuilder.append(" ").append(valueBuilder);
			System.out.println(fieldBuilder.toString());
			result = executeUpdate(fieldBuilder.toString(), config);
			if (result > 0)
				conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static int delete(Object obj) {
		int result = -1;
		try {
			Class<? extends Object> clazz = obj.getClass();
			Map<String, Map<String, Object>> config = getConfig(clazz, obj);
			if (config == null) {
				throw new RuntimeException(clazz.getName() + " has't properties");
			}
			StringBuilder fieldBuilder = new StringBuilder();
			fieldBuilder.append("delete from " + clazz.getSimpleName().toLowerCase());

			StringBuilder wherebuilder = new StringBuilder();
			wherebuilder.append(" where 1=1 ");
			Field[] fields = clazz.getDeclaredFields();
			config.forEach((k, v) -> {
				Object val = v.get("value");
				if (val != null) {
					wherebuilder.append(" and " + k + "=? ");
				}
			});

			fieldBuilder.append(" ").append(wherebuilder);
			System.out.println(fieldBuilder.toString());
			result = executeUpdate(fieldBuilder.toString(), config);
			if (result > 0)
				conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static <T> int update(T obj, T where) {
		int result = -1;
		try {
			Class<? extends Object> clazz = obj.getClass();
			Map<String, Map<String, Object>> config = getConfig(clazz, obj);
			Map<String, Map<String, Object>> wconfig = getConfig(clazz, where);
			if (config == null) {
				throw new RuntimeException(clazz.getName() + " has't properties");
			}
			if (wconfig == null) {
				throw new RuntimeException(clazz.getName() + " condition has't properties");
			}
			StringBuilder fieldBuilder = new StringBuilder();
			fieldBuilder.append("update " + clazz.getSimpleName().toLowerCase()).append(" set ");

			StringBuilder wherebuilder = new StringBuilder();
			wherebuilder.append(" where 1=1 ");
			Field[] fields = clazz.getDeclaredFields();
			config.forEach((k, v) -> {
				Object val = v.get("value");
				if (val != null) {
					fieldBuilder.append(k + "=?,");
				}
			});
			wconfig.forEach((k, v) -> {
				Object val = v.get("value");
				if (val != null) {
					wherebuilder.append(" and " + k + "=? ");
				}
			});
			int tindex = fieldBuilder.lastIndexOf(",");
			fieldBuilder.delete(tindex, tindex + 1);
			fieldBuilder.append(" ").append(wherebuilder);
			System.out.println(fieldBuilder.toString());
			result = executeUpdate(fieldBuilder.toString(), config, wconfig);
			if (result > 0)
				conn.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public static <T> List<T> selectList(Class clazz, T obj) {
		List<T> list = new ArrayList<>();
		Map<String, Map<String, Object>> config = getConfig(clazz, obj);
		if (config == null) {
			throw new RuntimeException(clazz.getName() + " has't properties");
		}
		StringBuilder builder = new StringBuilder();
		StringBuilder wherebuilder = new StringBuilder();
		builder.append("select ");
		wherebuilder.append(" where 1=1 ");
		Field[] fields = clazz.getDeclaredFields();
		config.forEach((k, v) -> {
			builder.append(k).append(",");
			Object val = v.get("value");
			if (val != null) {
				wherebuilder.append(" and " + k + "=? ");
			}
		});
		builder.delete(builder.lastIndexOf(","), builder.lastIndexOf(",") + 1);
		builder.append(" from ").append(clazz.getSimpleName().toLowerCase());
		builder.append(wherebuilder.toString());
		// System.out.println(builder.toString());
		executeQuery((t) -> {
			try {
				while (t.next()) {
					Object newObj = clazz.newInstance();
					config.forEach((k, v) -> {
						try {
							Field field = clazz.getDeclaredField(k);
							field.setAccessible(true);
							switch ((String) v.get("type")) {
							case "java.lang.Integer":
								field.set(newObj, t.getInt(k));
								break;
							case "java.lang.Boolean":
								field.set(newObj, t.getBoolean(k));
								break;
							case "java.lang.Byte":
								field.set(newObj, t.getByte(k));
								break;
							case "java.lang.Short":
								field.set(newObj, t.getShort(k));
								break;
							case "java.lang.Long":
								field.set(newObj, t.getLong(k));
								break;
							case "java.lang.Float":
								field.set(newObj, t.getFloat(k));
								break;
							case "java.lang.Double":
								field.set(newObj, t.getDouble(k));
								break;
							default:
								field.set(newObj, t.getObject(k));
							}
						} catch (SQLException e) {
							e.printStackTrace();
						} catch (NoSuchFieldException e) {
							e.printStackTrace();
						} catch (SecurityException e) {
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					});
					list.add((T) newObj);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} , builder.toString(), config);
		return list;
	}

	private static void executeQuery(RSExecutor rSExecutor, String sql, Map<String, Map<String, Object>> config) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			setPreparedStatementValue(ps, config, 1);
			rs = ps.executeQuery();
			rSExecutor.execute(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static int executeUpdate(String sql, Map<String, Map<String, Object>>... configs) {
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			if (configs != null && configs.length > 0) {
				int index = 1;
				for (Map<String, Map<String, Object>> config : configs) {
					index = setPreparedStatementValue(ps, config, index);
				}
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}

	private static class MIndex {
		int index = 0;
	};

	private static Map<String, Map<String, Object>> getConfig(Class clazz, Object obj) {
		Field[] fields = clazz.getDeclaredFields();
		Map<String, Map<String, Object>> config = new LinkedHashMap<>();
		try {
			for (int i = 0; i < fields.length; i++) {
				if (types.containsKey(fields[i].getType().getName())) {
					Map<String, Object> desc = new HashMap<>();
					desc.put("type", fields[i].getType().getName());
					fields[i].setAccessible(true);

					if (obj != null) {
						Object val = fields[i].get(obj);
						if (val != null) {
							desc.put("value", val);
							config.put(fields[i].getName(), desc);
						}
					}
					config.put(fields[i].getName(), desc);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return config.size() > 0 ? config : null;
	}

	public static int setPreparedStatementValue(PreparedStatement ps, Map<String, Map<String, Object>> config, int index) {
		if (config != null && config.size() > 0) {
			MIndex mIndex = new MIndex();
			mIndex.index += index;
			config.forEach((k, v) -> {
				try {
					Object val = v.get("value");
					if (val != null) {
						if (val instanceof java.util.Date) {
							ps.setString(mIndex.index++, new SimpleDateFormat("yyyy-MM-dd").format(val));
						} else {
							ps.setObject(mIndex.index++, val);
						}
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			});
			return mIndex.index;
		}
		return index;
	}

	@FunctionalInterface
	private static interface RSExecutor {
		void execute(ResultSet rs);
	}

	public static void main(String[] args) {
		/*Book listWhere = new Book();
		//listWhere.setAuthor("lee");
		listWhere.setId(2);
		List<Book> list = selectList(Book.class,listWhere);
		for (Book b : list) {
			System.out.println(b);
		}*/

		/*Book book = new Book();
		book.setAuthor("王先森3");
		book.setName("图论3");
		book.setCategory_id(1);
		book.setPrice(3000.0);
		book.setPub_date(new Date());
		insert(book);*/

		/*Book book = new Book();
		book.setId(13);
		System.out.println(delete(book));*/

//		Book book = new Book();
//		book.setAuthor("王先森11");
//		Book where = new Book();
//		where.setAuthor("王先森");
//		System.out.println(update(book, where));
		
		/*Book book = new Book();
		book.setName("java基础");
		book.setAuthor("王先森");
		book.setPrice(20.2);
		book.setPub_date(new Date());
		book.setCategory_id(1);
		insert(book);*/

	}
}
