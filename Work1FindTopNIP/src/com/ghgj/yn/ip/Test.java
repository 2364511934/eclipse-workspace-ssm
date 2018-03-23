package com.ghgj.yn.ip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
/**
 * 
 * ��һ���Ӵ���ļ��У��ļ��洢����IP��ַ�� 
 * ������㷨�����ҳ����ִ������ģ�10����IP 
 * �������˼·:
 * 1.�����ļ� ���ļ��е�IP ���뵽map �� Ŀ����Ϊ��ȥ��
 * 2.����map �е�key �� value �����µĶ��� ���뵽 arraylist��
 * 3.����һ��compartor ������
 * 4.ѡ��ǰ10��
 */

// 1 �� ȥ�� Ȼ�� �� ip value ��װΪ���� ������
public class Test {
	
	private Map<String, Integer> map = new HashMap<>();
	private List<IpTimes> list = new ArrayList<>();
	
	@Before
	public void fileLoad() throws IOException {
		File file = new File("src\\Ip.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String s = "";
		while((s=br.readLine()) != null) {
			Integer value = null;
			// ȥ���ظ�
			if((value = map.get(s)) == null)
			{
				value = 1;
			}
			else {
				value = value + 1;
			}
			map.put(s, value);
		}
		
		br.close();
		
	}
	
	@org.junit.Test
	public void test() {
		Iterator   it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry  = (Map.Entry)it.next();
			String ip = (String)entry.getKey();
			int times = (int)map.get(ip);
			IpTimes ipTimes = new IpTimes((String)ip, times);
			list.add(ipTimes);
			list.sort(new Comparator<IpTimes>() {
				@Override
				public int compare(IpTimes o1, IpTimes o2) {
					return o2.getTimes()-o1.getTimes();
				}
			});
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println(list.get(i));
		}
	}
	
	@After
	public void clearResource() {
		
	}
}
