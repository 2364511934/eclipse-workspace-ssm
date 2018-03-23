package day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyLoader extends  ClassLoader{
	String path;
	MyLoader(String path){
		this.path = path;
	}
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> c = null;
		System.out.println("MyLoader.......................");
		path = path + name.concat(".class");
		try {
			FileInputStream fis = new FileInputStream(path);
			byte[] b = new byte[fis.available()];
			int len = fis.read(b);
			c = this.defineClass(name, b, 0, len);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
}


class MyOwnLoader extends MyLoader{
	
	public MyOwnLoader(String path) {
		super(path);
	}

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class<?> c = null;
		path = path + name.concat(".class");
		System.out.println("MyOwnLoader.......................");
		try {
			FileInputStream fis = new FileInputStream(path);
			byte[] b = new byte[fis.available()];
			int len = fis.read(b);
			c = this.defineClass(name, b, 0, len);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
}
public class CloaderLoaderDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		MyLoader myLoader = new MyLoader("d:\\");
		Class c1 = Class.forName("Hello", true, myLoader);
		MyOwnLoader myOwnLoader =  new MyOwnLoader("d:\\");
		Class c2 = Class.forName("Word", true, myOwnLoader);
		//ClassLoader.getSystemClassLoader().loadClass(name);
		System.out.println(c1.getClassLoader());
		System.out.println(c2.getClassLoader());
		System.out.println(c1.getClassLoader().getParent());
		System.out.println(c2.getClassLoader().getParent());
	}

}
