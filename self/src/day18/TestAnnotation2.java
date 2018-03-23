package day18;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

//����ע��
//��Fruit�ඨ��һ��ע��
//Ԫע��
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//�ڷ��� ���� ���
@Inherited()//���Ա�����̳У�ֻ���������ϣ�
@Documented()//Javadoc�����ĵ��� ��ʾ
@interface FruitAnno{
	public String value() default "Fruit";
}
//�� ���� color����һ��ע��
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)//�ڷ��� ���� ���
@interface AppleColorAnno{
	public Color color() default Color.RED;
}

@FruitAnno(value="apple")
class Fruit{
	private String name ;
}
class Apple extends Fruit{
	@AppleColorAnno(color=Color.GREEN)
	private Color color;
}
enum Color{
	RED,GREEN,YELLOW;
}
public class TestAnnotation2 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// ����Զ���ע�⸸���
		Class<?> c = Fruit.class;
		//@day18.FruitAnno(value=apple)
		Annotation [] as  = c.getDeclaredAnnotations();
		Arrays.stream(as).forEach(System.out::println);
		//�����
		System.out.println("-------apple--------------------------");
		Class<?> cz = Apple.class;
		// @day18.FruitAnno(value=apple)
		Annotation [] azs = cz.getAnnotations();//����̳еĸ����ע�� //������FruitAnno
		Arrays.stream(azs).forEach(System.out::println);
		System.out.println("-------apple3--------------------------");
		Annotation[] afs = cz.getDeclaredField("color").getAnnotations();  // @AppleColorAnno
		Arrays.stream(afs).forEach(System.out::println);
		System.out.println("*************************************");
		azs = cz.getDeclaredAnnotations();//��ȡ������е�ע�� //��ʱ��û�е���
		Arrays.stream(azs).forEach(System.out::println);
	}

}
