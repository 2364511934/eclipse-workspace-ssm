package day18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

class Student{
	private int no;
	public String name;
	
	public Student() {
		System.out.println("无参构造");
	}
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
		System.out.println("带参构造："+no+","+name);
	}
	public void f1() {
		System.out.println("无参无返回值得方法f1");
	}
	public String f2(String s,int n) {
		return "串"+s+":"+n;
	}
}
public class TestClass1 {

	public static void main(String[] args) throws Exception {
		// Class反射
		//运行 期  获得类中的信息
		//先获得 字节码文件的对象
		Class<?> c = Class.forName("day18.Student");
//		Class<Student> c = Student.class;
//		Class<? extends Student> c = new Student().getClass();
		//属性----------------------------------------------------------
		System.out.println("-------------------属性 ----------------------");
//		Field [] fs = c.getFields();//public 
		Field [] fs = c.getDeclaredFields();//所有属性
		for(Field f: fs) {
			System.out.println(f.getName());
			System.out.println(f.getType());
			System.out.println(Modifier.toString(f.getModifiers()));
		}
		Field f1 = c.getDeclaredField("name");
		Object obj = c.newInstance();//调用构造
		f1.set(obj, "Tom");
		System.out.println(f1.get(obj));
		Field f22 = c.getDeclaredField("name");
		f22.set(obj, "jack");
		
		Field f2 = c.getDeclaredField("no");
		f2.setAccessible(true);//设置允许访问权限
		f2.set(obj, 11);
		System.out.println(f2.get(obj));
		
		//方法----------------------------------------------------------------
		System.out.println("------------------方法--------------------------");
		Method [] ms = c.getDeclaredMethods();
		for(Method m :ms) {
			System.out.println(m.getName());
			System.out.println(m.getReturnType());
			System.out.println(Arrays.toString(m.getParameterTypes()));
		}
		Method m1 = c.getDeclaredMethod("f1");
		m1.invoke(obj);
		Method m2 = c.getDeclaredMethod("f2", String.class,int.class);
		System.out.println(m2.invoke(obj, "hello",123));
		Method m22 = c.getDeclaredMethod("f2", String.class, int.class);
		m22.invoke(obj, "vvv", 90);
		//构造--------------------------------------------------------------
		System.out.println("-------------------构造--------------------------------");
		Constructor<?> [] crs = c.getDeclaredConstructors();
		for(Constructor cr :crs) {
			System.out.println(cr.getName());
			System.out.println(Arrays.toString(cr.getParameterTypes()));
		}
		Constructor cr1 = c.getDeclaredConstructor();
		Object obj1 = cr1.newInstance();
		f1.set(obj1, "Tom");
		Constructor cr2 = c.getDeclaredConstructor(int.class,String.class);
		cr2.newInstance(111,"郭靖");
		Constructor cr22 = c.getDeclaredConstructor(int.class, String.class);
		cr22.newInstance(333, "frfff");
		
	}

}
