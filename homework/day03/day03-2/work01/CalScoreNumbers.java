/**
*
* �ǹ̶�����ѭ��while �� do-while
����һ�� ����ɼ��������� 
���û�������ѧԱ�ɼ���������-1ʱ����ѭ����
���һ����������ˣ����������ЩѧԱ���ܷ��������ܰ�-1�ӽ�ȥ��

*/
import java.util.Scanner;
class CalScoreNumbers
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int score = 0;
		int count = -1;
		int scoreTotal=0;
		
		while(score != -1)
		{
			count++;
			scoreTotal += score;
			System.out.println("������ѧԱ�ĳɼ�: -1 ��ʾ�˳�!");
			score = input.nextInt();
		}
		System.out.println("�û�����"+count+"���ѧԱ, �ܳɼ�:" + scoreTotal);
	}
}
