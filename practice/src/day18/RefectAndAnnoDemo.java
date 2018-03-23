package day18;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Array;
import java.util.Arrays;

import javax.lang.model.element.Element;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited()
@Documented()
@interface PersonTypeAnno{
	public String value() default "男";
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited()
@Documented()
@interface EmployeeTypeAnno{
	public String value() default "男";
}

@PersonTypeAnno(value="男")
class Person{
	private String name;
	@EmployeeTypeAnno(value="男")
	private String type;
	public Person() {
		System.out.println(" Person() : 无参构造");
	}
	public Person(String name, String type) {
		this.name = name;
		this.type = type;
		System.out.println(name + "," + type);
	}
	
	public void eat(String food, int time) {
		System.out.println("吃:" + food + "," + time);
	}
}

class Employee extends Person{
	public void sing() {
		System.out.println("sing");
	}
}

public class RefectAndAnnoDemo {

	public static void main(String[] args) throws Exception {
		Class cperson = Class.forName("day18.Person");
		Field[] cfield = cperson.getDeclaredFields();
		for(Field f: cfield) {
			System.out.print(Modifier.toString(f.getModifiers()) +" ");
			System.out.print(f.getType()+" (");
			System.out.print(f.getName()+") ");
			System.out.print("\n");
			
		}
		
		Method[] cmethod = cperson.getDeclaredMethods();
		for(Method m: cmethod) {
			System.out.print(Modifier.toString(m.getModifiers()) + " " );
			System.out.print(m.getReturnType()+" ");
			System.out.print(m.getName() + " (");
			Class<?>[] ctypes  = m.getParameterTypes();
			for(Class c : ctypes) {
				System.out.print(c.getName()+" ");
			}
			System.out.print(")\n");
			
		}
		
		Constructor<?>[] cconstructor = cperson.getDeclaredConstructors();
		for(Constructor c: cconstructor) {
			System.out.print(Modifier.toString(c.getModifiers()) + " " );
			System.out.print(c.getName() + " (" );
			Class<?>[] ctypes  = c.getParameterTypes();
			for(Class cc : ctypes) {
				System.out.print(cc.getName()+" ");
			}
			System.out.print(")\n");
		}
		
		System.out.println("*****************************");
		cperson = Person.class;
		Annotation[]  atc = cperson.getDeclaredAnnotations();
		Arrays.stream(atc).forEach(System.out::println);
		
		Arrays.stream(cperson.getDeclaredField("type").getDeclaredAnnotations()).forEach(System.out::println);
		//System.out.println();
		/*for(Annotation cc: atc) {
			System.out.print(cc.toString() );
		}*/
		
		Class eperson = Employee.class;
		Annotation[]  etc = cperson.getDeclaredAnnotations();
		Arrays.stream(etc).forEach(System.out::println);
		//Arrays.stream(eperson.getDeclaredField("type").getDeclaredAnnotations()).forEach(System.out::println);
		/*for(Annotation cc: atc) {
			System.out.print(cc.toString() );
		}*/
	}

}
