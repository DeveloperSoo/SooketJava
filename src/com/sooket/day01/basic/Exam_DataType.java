package com.sooket.day01.basic;

public class Exam_DataType {
	public static void main(String[] args) {
		// 한줄 주석
		/* 여러줄 주석
		 * 자료형의 분류 2가지
		 * 1. 기본형
		 * - 정수, 실수, 문자, 참/거짓
		 * 정수 4가지(byte, short, int, long)
		 * 실수 2가지(float, double)
		 * 문자 char
		 * 참/거짓 boolean
		 * 2. 참조형 , 주소를 저장
		 * - 문자열 String
		 * 
		 */	
		boolean result = true;
		char fChar = 'a';
		
		System.out.println(result);
		System.out.println(fChar);
	
		//정수 파트
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483648L;
		
		//실수 파트
		float fNum = 25.52f;
		double dNum = 25.52;
	}
}
