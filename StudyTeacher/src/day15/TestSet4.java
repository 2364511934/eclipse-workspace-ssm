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
		// 小于等于 指定参数 的最大 元素
		System.out.println(set.floor(58.9));  // 67.2
		//大于等于 指定参数 的 最小元素  
		System.out.println(set.ceiling(58.9)); // 56.34
		//降序排列的集合
		set.descendingSet().forEach(System.out::println);
		//返回 降序的迭代器
		set.descendingIterator().forEachRemaining(System.out::println);
		//删除 第一元素
		set.pollFirst();
		System.out.println(set);
		set.pollLast();
		System.out.println(set);
	}

}
