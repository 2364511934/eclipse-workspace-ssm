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
 * 在一个庞大的文件中，文件存储的是IP地址， 
 * 你设计算法给我找出出现次数最多的（10个）IP 
 * 解决问题思路:
 * 1.加载文件 将文件中的IP 填入到map 中 目的是为了去除
 * 2.编译map 中的key 和 value 生成新的对象 加入到 arraylist中
 * 3.加入一个compartor 生成器
 * 4.选出前10个
 */

// 1 先 去重 然后 将 ip value 封装为对象 再排序
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
			// 去除重复
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
