package day10_2;
/**
 * @author lh
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author lh
 *
 */
public class DateDemo {

	
	public static long getDays(String strCur, String strBirth) throws ParseException {
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date dateCur = null;
	    java.util.Date dateBirth = null;
	    
	    dateCur = myFormatter.parse(strCur);
	    dateBirth = myFormatter.parse(strBirth);
	    long day = (dateCur.getTime() - dateBirth.getTime()) / (24 * 60 * 60 * 1000);
		return day;
	}
	
	public static int getDaysByYear(int year) {
		if(year %400 == 0 || (year%4 ==0 && year%100 !=0)) {
			return 29;
		}
		return 28;
	}
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
		
		String strCur = myFormatter.format(date);
		String strBirth="2007-02-20";
		

		System.out.println(getDays(strCur, strBirth)+" : Ìì");
		
		System.out.println(getDaysByYear(2017));
		
	}

}


