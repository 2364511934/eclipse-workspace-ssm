package com.ghgj.yn.url;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * 现在有一个非常庞大的URL库（10000E），然后现在还有一个URL，（迅速）判断这个URL是否在这个URL库中？
 *
 */

public class test {
	private List<String> listUrl1 = new ArrayList<>();
	
	
	private void loadUrl(File file,  List<String> list) throws IOException {
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		String s = "";
		while((s=br.readLine()) != null) {
			list.add(s);
		}
		br.close();
	}
	
	@Before
	public void readFile() throws IOException {
		File urlFile1 = new File("src\\url1.txt");
		loadUrl(urlFile1, listUrl1);
		
	}
	
	@Test
	public void test() {
		listUrl1.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		
		String url = "https://baike.baidu.com/link?url=cV1S8SgzSdEpegHlU-8O1o-7IlKWeorvGuvFltddC0lGkU6rPoEeL9Ck5CNigJutYvnBLjYvmQywrtnw5tugq4GZ95e-lFfoJJOMNyJnsZe26";
		System.out.println(listUrl1.contains(url));

	}
	
	@After
	public void clearResource() {
		
	}
}
