package com.ghgj.jdbc.api;

import java.util.Random;

public class Random1704 {

	public static void main(String[] args) {
		
		String[] student = new String[]{"柯于辉","张甜露","刘翔","李晓星","马海微","邓鹏飞",
				"宋加凯","单彬彬","张亮杰","刘杰","臧爽","李鹏","邓泽宇",
				"王培","李晓强","徐润田","吴雁娇","黄婷婷","鲍云锋","赵健龙",
				"王贤甬","晏黎","徐爽","程兴其","武威","谭前程","高亚迪",
				"张梁","杨航飞","赵伟宏","尚春雷","陶王飞","赵忍",
				"王栋梁","成佩庆","李立峥 ","张育珲","彭可","郑航",
				"王拓","杨宁","郭达","连胜超","陈宗威","王伟","李润馨",
				"姚大万","汪洪","鲁贵丽","宗亚峰","于明远","杨晟","叶智楷",
				"张若愚","岳明星","李佳媛","杨凤梅","王佳宝","李伟","李明燕"};
		
		int number = (int)(new Random().nextInt(student.length));
		
		System.err.println(student[number]);
	}
}