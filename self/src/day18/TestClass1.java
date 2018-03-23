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
		System.out.println("�޲ι���");
	}
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
		System.out.println("���ι��죺"+no+","+name);
	}
	public void f1() {
		System.out.println("�޲��޷���ֵ�÷���f1");
	}
	public String f2(String s,int n) {
		return "��"+s+":"+n;
	}
}
public class TestClass1 {

	public static void main(String[] args) throws Exception {
		// Class����
		//���� ��  ������е���Ϣ
		//�Ȼ�� �ֽ����ļ��Ķ���
		Class<?> c = Class.forName("day18.Student");
//		Class<Student> c = Student.class;
//		Class<? extends Student> c = new Student().getClass();
		//����----------------------------------------------------------
		System.out.println("-------------------���� ----------------------");
//		Field [] fs = c.getFields();//public 
		Field [] fs = c.getDeclaredFields();//��������
		for(Field f: fs) {
			System.out.println(f.getName());
			System.out.println(f.getType());
			System.out.println(Modifier.toString(f.getModifiers()));
		}
		Field f1 = c.getDeclaredField("name");
		Object obj = c.newInstance();//���ù���
		f1.set(obj, "Tom");
		System.out.println(f1.get(obj));
		Field f22 = c.getDeclaredField("name");
		f22.set(obj, "jack");
		
		Field f2 = c.getDeclaredField("no");
		f2.setAccessible(true);//�����������Ȩ��
		f2.set(obj, 11);
		System.out.println(f2.get(obj));
		
		//����----------------------------------------------------------------
		System.out.println("------------------����--------------------------");
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
		//����--------------------------------------------------------------
		System.out.println("-------------------����--------------------------------");
		Constructor<?> [] crs = c.getDeclaredConstructors();
		for(Constructor cr :crs) {
			System.out.println(cr.getName());
			System.out.println(Arrays.toString(cr.getParameterTypes()));
		}
		Constructor cr1 = c.getDeclaredConstructor();
		Object obj1 = cr1.newInstance();
		f1.set(obj1, "Tom");
		Constructor cr2 = c.getDeclaredConstructor(int.class,String.class);
		cr2.newInstance(111,"����");
		Constructor cr22 = c.getDeclaredConstructor(int.class, String.class);
		cr22.newInstance(333, "frfff");
		
	}

}
