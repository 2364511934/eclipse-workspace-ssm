package day15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestSet4 {

	public static void main(String[] args) {
		// NavigableSet
		NavigableSet<Double> set = new TreeSet<>((d1,d2)->(int)(d2-d1));
		set.add(34.5);
		set.add(56.34);
		set.add(67.2);
		//System.out.println(set);
		// С�ڵ��� ָ������ ����� Ԫ��
		System.out.println(set.floor(58.9));  // 67.2
		//���ڵ��� ָ������ �� ��СԪ��  
		System.out.println(set.ceiling(58.9)); // 56.34
		//�������еļ���
		set.descendingSet().forEach(System.out::println);
		//���� ����ĵ�����
		set.descendingIterator().forEachRemaining(System.out::println);
		//ɾ�� ��һԪ��
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
	}

}
