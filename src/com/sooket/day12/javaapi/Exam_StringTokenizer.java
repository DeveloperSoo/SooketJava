package com.sooket.day12.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=james&addr=seoul&age=33";
		String [] words = query.split("&");
		for(String word : words) 
			System.out.println(word);
		System.out.println();

		//얘가 속도가 더 빠르고 메모리 사용이 적다
		StringTokenizer st = new StringTokenizer(query,"&");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
