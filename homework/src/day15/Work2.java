package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Work2 {

	public static void main(String[] args) {
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("CA", "加拿大(CANADA)");
		countryMap.put("CF", "中非(CENTRAL AFRICA)"); // - 
		countryMap.put("CG", "刚果(CONGO)"); // -  
		countryMap.put("CH", "瑞士(SWITZERLAND)"); // -  
		countryMap.put("CL", "智利(CHILE)"); // - 
		countryMap.put("CM", "喀麦隆(CAMEROON)"); // - 
		countryMap.put("CN", "中国(CHINA)"); // -  
		countryMap.put("CO", "哥伦比亚(COLOMBIA)"); // -  
		countryMap.put("CR", "哥斯达黎加(COSTA RICA)"); // -  
		countryMap.put("CS", "捷克(CZECH REPUBIC)"); // -  
		countryMap.put("", "古巴(CUBA)"); // CU-  
		countryMap.put("CY", "塞浦路斯(CYPRUS)"); // -  
		countryMap.put("CN", "中国(CHINA)"); // -
		countryMap.put("DE", "德 国(GERMANY)"); // -  
		countryMap.put("DK", "丹麦(DENMARK)"); // -  
		countryMap.put("D", "多米尼加共和国(DOMINICAN REPUBLIC)"); // O-  
		countryMap.put("DZ", "阿尔及利亚(ALGERIA)"); // -
		
		if(countryMap.containsKey("CA")) {
			System.out.println(countryMap.get("CA"));
		}
		else {
			System.out.println("无此国家");
		}
		
		System.out.println("一共有:"+countryMap.size() + "国家");
		
		countryMap.keySet().forEach((k)->System.out.print(k+" "));
		System.out.println();
		countryMap.values().forEach((v)->System.out.print(v+" "));
		System.out.println();
	}

}
 