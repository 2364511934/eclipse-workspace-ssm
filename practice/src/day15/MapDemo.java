package day15;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> mapBank = new HashMap<>();
		mapBank.put("PBC", "农业银行");
		mapBank.put("ICBC", "工商银行");
		mapBank.put("BC", "中国银行");
		mapBank.put("CBC", "建设银行");
		mapBank.keySet().forEach(System.out::println);
		mapBank.values().forEach(System.out::println);
		
		mapBank.values().forEach(System.out::println);
		mapBank.entrySet().forEach(System.out::println);
		mapBank.forEach((k, v)->{System.out.println(k+","+v);});
		
		System.out.println(mapBank.get("BC"));
		System.out.println(mapBank.size());
		System.out.println(mapBank.containsKey("BC"));
	}

}
