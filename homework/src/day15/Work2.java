package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Work2 {

	public static void main(String[] args) {
		Map<String, String> countryMap = new HashMap<>();
		countryMap.put("CA", "���ô�(CANADA)");
		countryMap.put("CF", "�з�(CENTRAL AFRICA)"); // - 
		countryMap.put("CG", "�չ�(CONGO)"); // -  
		countryMap.put("CH", "��ʿ(SWITZERLAND)"); // -  
		countryMap.put("CL", "����(CHILE)"); // - 
		countryMap.put("CM", "����¡(CAMEROON)"); // - 
		countryMap.put("CN", "�й�(CHINA)"); // -  
		countryMap.put("CO", "���ױ���(COLOMBIA)"); // -  
		countryMap.put("CR", "��˹�����(COSTA RICA)"); // -  
		countryMap.put("CS", "�ݿ�(CZECH REPUBIC)"); // -  
		countryMap.put("", "�Ű�(CUBA)"); // CU-  
		countryMap.put("CY", "����·˹(CYPRUS)"); // -  
		countryMap.put("CN", "�й�(CHINA)"); // -
		countryMap.put("DE", "�� ��(GERMANY)"); // -  
		countryMap.put("DK", "����(DENMARK)"); // -  
		countryMap.put("D", "������ӹ��͹�(DOMINICAN REPUBLIC)"); // O-  
		countryMap.put("DZ", "����������(ALGERIA)"); // -
		
		if(countryMap.containsKey("CA")) {
			System.out.println(countryMap.get("CA"));
		}
		else {
			System.out.println("�޴˹���");
		}
		
		System.out.println("һ����:"+countryMap.size() + "����");
		
		countryMap.keySet().forEach((k)->System.out.print(k+" "));
		System.out.println();
		countryMap.values().forEach((v)->System.out.print(v+" "));
		System.out.println();
	}

}
 