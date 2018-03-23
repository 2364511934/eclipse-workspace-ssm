package day6_3;

public class Work1Wage {
	public int CalWage(int basicSalary, int projectBonus, int bonus) {
		return CalWage(basicSalary + projectBonus) +  CalWage(bonus);
	}
	
	public int CalWage(int basicSalary, int projectBonus) {
		return CalWage(basicSalary) + projectBonus;
	}
	
	public int CalWage(int basicSalary) {
		return basicSalary;
	}
	
	
}
