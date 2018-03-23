package com.ghgj.mazh.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 作者： 马中华：http://blog.csdn.net/zhongqi2513
 * 日期： 2018年1月30日下午11:29:49
 * 
 * 描述：

		通过BufferedReader进行文件的读取
 */
public class BufferReaderTest {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("c:/student.txt")));
		
		String line = null;
		while( (line = br.readLine()) != null){
			
			System.out.println(line);
		}
	
		br.close();
	}
}
