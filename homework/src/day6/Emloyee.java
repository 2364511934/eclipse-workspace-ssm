package day6;
/**
 * 
 * @author Administrator
 *
 */
public class Emloyee {
	int id;
	String name;
	String tel;
	double height;
	double wage;
	
	public void showInfo() {
		System.out.print("员工编号:" + id );
		System.out.print("\t员工名:" + name );
		System.out.print("\t员工电话:" + tel );
		System.out.print("\t员工身高:" + height );
		System.out.print("\t员工工资:" + wage );
		System.out.print("\n");
	}
}
