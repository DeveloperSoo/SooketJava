package com.sooket.day12.javaapi;

public class Exam_StringBuffur {
	public static void main(String[] args) {
		String data1 = "Hello";
		String data2 = " ";
		String data3 = "JAVA";
		// 문자열 연결하여 Hello JAVA를 출력해보세요
		String word = data1.concat(data2).concat(data3);
		System.out.println(word);
							// 결과 : Hello JAVA
		System.out.println(data1 + data2 + data3);
							// 결과 : Hello JAVA
		System.out.println(); // 위 방법으로 진행시 메모리를 한칸 더 쓰게됨
		// StringBuffer를 이용해서 연결(메모리 절약)
		StringBuffer stb = new StringBuffer();
		stb.append(data1).append(data2).append(data3); // 메로리를 추가로 쓸 필요가 없음
		System.out.println("연결된 문자열 : " + stb.toString()); 
							// 결과 : 연결된 문자열 : Hello JAVA
		
		stb.reverse();
		System.out.println("반전된 문자열 : " + stb.toString()); 
							// 결과 : 반전된 문자열 : AVAJ olleH
		
		
		
		
	}
}
