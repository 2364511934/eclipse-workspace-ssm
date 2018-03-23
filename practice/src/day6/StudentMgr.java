package day6;
/**
 * 学员管理
 * @author Administrator
 * @version 1.0 2017-12 -19
 */
public class StudentMgr {
	
	/**
	 * 计算平均成绩
	 * @param studentArray  输入数组
	 * @return  输出数组
	 */
	public int average(Student []studentArray) {
		int sum =0;
		for(Student s : studentArray) {
			sum += s.score;
		}
		return sum/studentArray.length;
	}
}
