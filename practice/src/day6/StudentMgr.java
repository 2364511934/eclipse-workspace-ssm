package day6;
/**
 * ѧԱ����
 * @author Administrator
 * @version 1.0 2017-12 -19
 */
public class StudentMgr {
	
	/**
	 * ����ƽ���ɼ�
	 * @param studentArray  ��������
	 * @return  �������
	 */
	public int average(Student []studentArray) {
		int sum =0;
		for(Student s : studentArray) {
			sum += s.score;
		}
		return sum/studentArray.length;
	}
}
