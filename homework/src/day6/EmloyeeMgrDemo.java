package day6;

public class EmloyeeMgrDemo {

	public static void main(String[] args) {
		Emloyee[] emloyeeArray = new Emloyee[10];
		EmloyeeMgr emloyeeMgr = new EmloyeeMgr();
		
		for(int i=0; i<emloyeeArray.length; i++){
			emloyeeArray[i] = new Emloyee();
			emloyeeArray[i].id = 1;
			emloyeeArray[i].name = Integer.toString(i);
			emloyeeArray[i].tel = Integer.toString(i);
			emloyeeArray[i].height =i*1.0;
			emloyeeArray[i].wage = i*100+1.0;	
			emloyeeArray[i].showInfo();
		}
		
		System.out.println(emloyeeMgr.totalWage(emloyeeArray));;
		System.out.println(emloyeeMgr.averageHeight(emloyeeArray));
		
		
	}

}
