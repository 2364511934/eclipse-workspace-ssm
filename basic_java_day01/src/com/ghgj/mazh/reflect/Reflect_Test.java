package com.ghgj.mazh.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2017年04月21日 下午7:30:09 
 * 
 * 描述: 
 * 
 * 		反射测试类
 * 
 * 		重点概念：
 * 		Class
 * 		Field
 * 		Method
 * 		Constructor
 */
public class Reflect_Test {

	public String className = "com.ghgj.mazh.reflect.Student";

	@SuppressWarnings("rawtypes")
	public Class studentClass = null;

	/**
	 * 反射Person类
	 * 
	 * Before   Test    After  
	 * 
	 * 作用： 初始化的代码都写在 Before
	 *     最终的垃圾回收，资源回收， 全部都放在   After方法中
	 */
	@Before
	public void init() throws Exception {
		System.out.println("1");
		studentClass = Class.forName(className);
	}

	/**
	 * 获取某个class类的名称
	 */
	@Test
	public void getClassName() throws Exception {
		System.out.println("2");
		System.out.println(studentClass);
	}
	
	@After
	public void destroy(){
		System.out.println("44444");
	}
	

	/**
	 *获取某个class类对象的另一种方式
	 */
	@Test
	public void getClassName2() throws Exception {
		System.out.println("33333");
		System.out.println(Student.class);
	}
	
	@Test
	public void getClassName3() throws Exception {
		System.out.println("33333");
		Student s = new Student();
		System.out.println(s.getClass());
	}

	/**
	 *创建一个该class类表示的一个真实对象，底层会调用空参数的构造方法
	 */
	@Test
	public void getNewInstance() throws Exception {
		System.out.println(studentClass.newInstance());
	}

	/**
	 * 获取非私有的构造函数
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void getPublicConstructor() throws Exception {
		Constructor constructor = studentClass.getConstructor(long.class, String.class);
		Student student = (Student) constructor.newInstance(100L, "zhangsan");
		System.out.println(student.getId());
		System.out.println(student.getName());
	}

	/**
	 * 获得私有的构造函数
	 * 
	 * Female   male
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void getPrivateConstructor() throws Exception {
		Constructor con = studentClass.getDeclaredConstructor(String.class);
		// 强制取消Java的权限检测
		con.setAccessible(true);
		Student student = (Student) con.newInstance("zhangsan");
		System.out.println(student.getName() + " - " + student.getId());
	}

	/**
	 * 获取非私有的成员变量
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void getNotPrivateField() throws Exception {
		Constructor constructor = studentClass.getConstructor(long.class, String.class);
		Object obj = constructor.newInstance(100L, "zhangsan");
		Student student = (Student)obj;
		Field field = studentClass.getField("name");
		field.set(obj, "lisi");
		System.out.println(field.get(obj) +"\t"+ student.getName());
	}

	/**
	 * 获取私有的成员变量
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void getPrivateField() throws Exception {
		Constructor constructor = studentClass.getConstructor(long.class);
		Object obj = constructor.newInstance(100L);

		Field field2 = studentClass.getDeclaredField("id");
		field2.setAccessible(true);// 强制取消Java的权限检测
		field2.set(obj, 10000L);
		System.out.println(field2.get(obj));
	}

	/**
	 * 获取非私有的成员方法
	 */
	@SuppressWarnings({ "unchecked" })
	@Test
	public void getNotPrivateMethod() throws Exception {
		
		Method method = studentClass.getMethod("toString");
		System.out.println(method);

		// 利用空参构造函数 创建一个 对象
		Object obj = studentClass.newInstance();
		
		// 通过方法对象调用 调用某个对象的 该方法， object对象是 method 方法 调用之后返回的值
		// 等同于   obj.method()
		Object object = method.invoke(obj);
		System.out.println(object);
	}

	/**
	 * 获取私有的成员方法
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void getPrivateMethod() throws Exception {
		Object obj = studentClass.newInstance();// 获取空参的构造函数
		
		/**
		 * 获取私有的无参的 getSomeThing方法
		 */
		Method method1 = studentClass.getDeclaredMethod("getSomeThing");
		// 强制取消 权限监测
		method1.setAccessible(true);
		Object value1 = method1.invoke(obj);
		
		/**
		 * 获取私有的带Stirng类型参数的 getSomeThing方法
		 */
		Method method2 = studentClass.getDeclaredMethod("getSomeThing", String.class);
		// 强制取消 权限监测
		method2.setAccessible(true);
		Object value2 = method2.invoke(obj, "huangbo");
		
		System.out.println(value1 + "\t" + value2);
	}

	/**
	 *
	 */
	@Test
	public void otherMethod() throws Exception {
		// 当前加载这个class文件的那个类加载器对象
		System.out.println("类加载器："+ studentClass.getClassLoader());
		
		// 获取某个类实现的所有接口
		Class[] interfaces = studentClass.getInterfaces();
		for (Class class1 : interfaces) {
			System.out.println("实现的接口：" + class1);
		}
		// 反射当前这个类的直接父类
		System.out.println("直接父类：" + studentClass.getGenericSuperclass());
		
		/**
		 * getResourceAsStream这个方法可以获取到一个输入流，这个输入流会关联到name所表示的那个文件上。
		 * 不以’/'开头时默认是从此类所在的包下取资源，以’/'开头则是从ClassPath根下获取。
		 * 其只是通过path构造一个绝对路径，最终还是由ClassLoader获取资源。
		 * 默认则是从ClassPath根下获取，path不能以’/'开头，最终是由ClassLoader获取资源。
		 */
		System.out.println(studentClass.getResourceAsStream("/log4j.properties"));

		// 判断当前的Class对象表示是否是数组
		System.out.println("判断是否是数组： " + studentClass.isArray());
		System.out.println("判断是否是数组： " + new String[3].getClass().isArray());

		// 判断当前的Class对象表示是否是枚举类
		System.out.println("判断是否是枚举类： " + studentClass.isEnum());
		System.out.println("判断是否是枚举类： " + Class.forName("com.ghgj.mazh.pojo.Weekday").isEnum());

		// 判断当前的Class对象表示是否是接口
		System.out.println("判断是否是接口： " + studentClass.isInterface());
		System.out.println("判断是否是接口： " + Class.forName("com.ghgj.mazh.pojo.Female").isInterface());

	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void otherTest() throws Exception {
		String str = "abc";  
		Class clazz = str.getClass();  
		Class clazz2 = String.class;  
		Class clazz3 = Class.forName("java.lang.String");  
		System.out.println(clazz == clazz2);// true  
		System.out.println(clazz2 == clazz3);// true  
		System.out.println(clazz.isPrimitive());// 判断是否为基本类型   false
		System.out.println(int.class.isPrimitive());// true  
		System.out.println(int.class == Integer.class);// false  
		System.out.println(int.class == Integer.TYPE);// true  
		System.out.println(int[].class.isPrimitive());// false  
		System.out.println(int[].class.isArray());// 判断是否为数组  true
		System.out.println(new Integer(5).getClass().isArray());// 判断是否为数组  false
	}
}
