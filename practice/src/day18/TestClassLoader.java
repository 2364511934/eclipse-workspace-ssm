package day18;
class Exam{
	static {
		System.out.println("static");
	}
}
public class TestClassLoader {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// ��ļ���
		//ClassLoader ֻ����� ���� �ļ��� ������ ��ʼ��
		Class c = ClassLoader.getSystemClassLoader().loadClass("day18.Exam");
		//Exam e = (Exam)c.newInstance();
		//���� ���� �� ��ʼ��
		//Class c = Class.forName("day18.Exam");//true
		//                     ���ص���  ��          �Ƿ���г�ʼ��true��    ������
		//Class c = Class.forName("day18.Exam", true, ClassLoader.getSystemClassLoader() );
	}

}
