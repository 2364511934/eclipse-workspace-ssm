package day18;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

//定义注解
//给Fruit类定义一个注解
//元注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)//在反射 技术 获得
@Inherited()//可以被子类继承（只用在类型上）
@Documented()//Javadoc帮助文档中 显示
@interface FruitAnno{
	public String value() default "Fruit";
}
//给 属性 color定义一个注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)//在反射 技术 获得
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
		// 获得自定义注解父类的
		Class<?> c = Fruit.class;
		//@day18.FruitAnno(value=apple)
		Annotation [] as  = c.getDeclaredAnnotations();
		Arrays.stream(as).forEach(System.out::println);
		//子类的
		System.out.println("-------apple--------------------------");
		Class<?> cz = Apple.class;
		// @day18.FruitAnno(value=apple)
		Annotation [] azs = cz.getAnnotations();//子类继承的父类的注解 //仅仅是FruitAnno
		Arrays.stream(azs).forEach(System.out::println);
		System.out.println("-------apple3--------------------------");
		Annotation[] afs = cz.getDeclaredField("color").getAnnotations();  // @AppleColorAnno
		Arrays.stream(afs).forEach(System.out::println);
		System.out.println("*************************************");
		azs = cz.getDeclaredAnnotations();//获取子类独有的注解 //暂时是没有的呢
		Arrays.stream(azs).forEach(System.out::println);
	}

}
