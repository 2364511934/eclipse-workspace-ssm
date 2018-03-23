package day18;
class Exam{
	static {
		System.out.println("static");
	}
}
public class TestClassLoader {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// 类的加载
		//ClassLoader 只完成了 对类 的加载 ，不会 初始化
		Class c = ClassLoader.getSystemClassLoader().loadClass("day18.Exam");
		//Exam e = (Exam)c.newInstance();
		//可以 加载 并 初始化
		//Class c = Class.forName("day18.Exam");//true
		//                     加载的类  ，          是否进行初始化true，    加载器
		//Class c = Class.forName("day18.Exam", true, ClassLoader.getSystemClassLoader() );
	}

}
