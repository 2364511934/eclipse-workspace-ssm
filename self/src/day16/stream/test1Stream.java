package day16.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
public class test1Stream {
	public static void main(String[] args) {
		IntStream stream = IntStream.builder().add(10).add(20).add(39).build();
		// 获取指定流中的最大数
		System.out.println(stream.max().getAsInt());   // 39
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// 获取指定流中的最小数
		System.out.println(stream.min().getAsInt());   // 10
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// 获取流中的和
		System.out.println(stream.sum());   // 10+20+39 = 69
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// 获取流的个数   
		System.out.println(stream.count()); //3
		
		stream = IntStream.builder().add(10).add(20).add(39).build();
		// 获取流中的平均数
		System.out.println(stream.average().getAsDouble()); //(10+20+39)/3= 23.0
		
		
		// 全部匹配 返回 ture 否则 返回 false
		stream = IntStream.builder().add(10).add(20).add(39).build();
		
		/*IntPredicate predicate = new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value > 20;
			}
		};*/
		// 或者 这样写 输出 false 
		/*System.out.println(stream.allMatch(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value > 20;
			}
		}));*/
		//或者 这样写 输出 false 
		System.out.println(stream.allMatch((v)-> v>20));
		
		
		// 任意匹配 只要有一个成功则返回 ture 否则 返回 false
		stream = IntStream.builder().add(10).add(20).add(39).build();
		System.out.println(stream.anyMatch((v)-> v>20));
		
		// 中间方法使用
		// 使用过滤原则
		stream = IntStream.builder().add(10).add(20).add(39).build();
		System.out.println(stream.filter((v)-> v>20).count());
		
		// Stream->集合
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "aa","bb","ccc");
		//list.stream().filter(v-> v.length() == 3).forEach(System.out::println);
		// 等价于上面的内容
		list.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				
				return t.length() == 3;
			}
			
		}).forEach(System.out::println);
	}

}
