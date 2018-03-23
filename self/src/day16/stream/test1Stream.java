package day16.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
public class test1Stream {
	public static void main(String[] args) {
		IntStream stream = IntStream.builder().add(10).add(20).add(39).build();
		// ��ȡָ�����е������
		System.out.println(stream.max().getAsInt());   // 39
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// ��ȡָ�����е���С��
		System.out.println(stream.min().getAsInt());   // 10
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// ��ȡ���еĺ�
		System.out.println(stream.sum());   // 10+20+39 = 69
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// ��ȡ���ĸ���   
		System.out.println(stream.count()); //3
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// ��ȡ���е�ƽ����
		System.out.println(stream.average().getAsDouble()); //(10+20+39)/3= 23.0
		
		
		// ȫ��ƥ�� ���� ture ���� ���� false
		stream = IntStream.builder().add(10).add(20).add(39).build();
		
		/*IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value > 20;
			}
		};*/
		// ���� ����д ��� false 
		/*System.out.println(stream.allMatch(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value > 20;
			}
		}));*/
		//���� ����д ��� false 
		System.out.println(stream.allMatch((v)-> v>20));
		
		
		// ����ƥ�� ֻҪ��һ���ɹ��򷵻� ture ���� ���� false
		stream = IntStream.builder().add(10).add(20).add(39).build();
		System.out.println(stream.anyMatch((v)-> v>20));
		
		// �м䷽��ʹ��
		// ʹ�ù���ԭ��
		stream = IntStream.builder().add(10).add(20).add(39).build();
		System.out.println(stream.filter((v)-> v>20).count());
		
		// Stream->����
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "aa","bb","ccc");
		//list.stream().filter(v-> v.length() == 3).forEach(System.out::println);
		// �ȼ������������
		list.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				
				return t.length() == 3;
			}
			
		}).forEach(System.out::println);
	}

}
