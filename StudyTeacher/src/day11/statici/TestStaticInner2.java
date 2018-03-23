package day11.statici;
interface Info{
	// 默认是 public static
	class InnerClass{
		int x = 55;
	}
	//默认是 public static
	interface InnerInfo{
		static void fs() {
			System.out.println("fs_static");
		}
		default void fd() {
			System.out.println("fd_default");
		}
		void fv();//默认是 abstract
	}
}
class InfoImpl implements Info{
	public void show() {
		InfoImpl  info1 = new InfoImpl();
		((Info.InnerInfo)info1).fd();
		
		System.out.println(new InnerClass().x);
		InnerInfo.fs();
		//fd()
		Info info = new InfoImpl();
		Info.InnerInfo in = (Info.InnerInfo)info;
		in.fd();
	}
	//---------定义内部类 实现 InnerInfo---------------
	class InnerInfoImpl implements Info.InnerInfo{
		@Override
		public void fv() {
			InnerInfo.fs();//调用 接口中的静态成员
			fd();//调用 接口中的 默认方法
		}
	}
}
//顶级类 实现 InnerInfo内部接口
class InnerInfoImpl1 implements Info.InnerInfo{
	@Override
	public void fv() {
		Info.InnerInfo.fs();//访问 静态成员
		fd();
		
	}	
}
public class TestStaticInner2 {

	public static void main(String[] args) {
		

	}

}
