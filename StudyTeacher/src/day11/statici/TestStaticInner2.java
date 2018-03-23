package day11.statici;
interface Info{
	// Ĭ���� public static
	class InnerClass{
		int x = 55;
	}
	//Ĭ���� public static
	interface InnerInfo{
		static void fs() {
			System.out.println("fs_static");
		}
		default void fd() {
			System.out.println("fd_default");
		}
		void fv();//Ĭ���� abstract
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
	//---------�����ڲ��� ʵ�� InnerInfo---------------
	class InnerInfoImpl implements Info.InnerInfo{
		@Override
		public void fv() {
			InnerInfo.fs();//���� �ӿ��еľ�̬��Ա
			fd();//���� �ӿ��е� Ĭ�Ϸ���
		}
	}
}
//������ ʵ�� InnerInfo�ڲ��ӿ�
class InnerInfoImpl1 implements Info.InnerInfo{
	@Override
	public void fv() {
		Info.InnerInfo.fs();//���� ��̬��Ա
		fd();
		
	}	
}
public class TestStaticInner2 {

	public static void main(String[] args) {
		

	}

}
