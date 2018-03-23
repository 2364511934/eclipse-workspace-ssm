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
 * 2、在两个庞大文件中，文件也都是存储的URL地址，比如文件名叫做file1和file2, 找出这两个文件中的交集？
	select url from file1 a join file2 b on a.url = b.url
 *
 */

public class test {
	private List<String> listUrl1 = new ArrayList<>();
	private List<String> listUrl2 = new ArrayList<>();
	private List<String> listUrl3 = new ArrayList<>();
	
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
		File urlFile2 = new File("src\\url2.txt");
		loadUrl(urlFile1, listUrl1);
		loadUrl(urlFile2, listUrl2);
	}
	
	@Test
	public void test() {
		listUrl1.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
			
		});
		listUrl2.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(int i =0; i<listUrl1.size(); i++) {
			String s = listUrl1.get(i);
			if(listUrl2.contains(s)) {
				listUrl3.add(s);
			}
		}
		
		for(int i =0; i<listUrl3.size(); i++) {
			System.out.println(listUrl3.get(i));
		}
	
		
	}
	
	@After
	public void clearResource() {
		
	}
}
