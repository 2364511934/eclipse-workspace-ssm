package day6;
/**
 * 
 * @author Administrator
 *
 */
public class EmloyeeMgr {
	public double totalWage(Emloyee[] array) {
		double total = 0.0;
		for(Emloyee e : array) {
			total += e.wage;
		}
		return total;
	}
	
	public double averageHeight(Emloyee[] array) {
		double average = 0.0;
		for(Emloyee e : array) {
			average += e.height;
		}
		return average;
	}
}
