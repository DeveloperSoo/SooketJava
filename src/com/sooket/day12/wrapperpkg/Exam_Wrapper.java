package com.sooket.day12.wrapperpkg;
	
public class Exam_Wrapper {
	public static void main(String[] args) {
		int num = 10;
		num = 1118;
		Integer su = null; // 참조형
		//su = new Integer(10); //The constructor Integer(int) has been deprecated since version 9 and marked for removal
		su = Integer.valueOf(502); // 원칙 Integer <= Integer
		if(su != null) {
			su = 1225; // 오토-박싱(auto-boxing)			
		}
		num = su.intValue(); // 원칙 int <= Integer
		//System.out.println(num + "!!");
		num = su; // 오토-언박싱 (auto-unboxing) 원래 배운대로라면 여기는 얕은복사로 num이 su라는 참조변수 주소지만 옮겼어야함
		Double du = Double.valueOf(11.18);
		du = 5.02;
		double dNum = du.doubleValue();
		dNum = du;
		// Wrapper 클래스를 쓰는 이유
		// 1. Null 체크가 가능해짐, int -> 0, double -> 0.0, String -> null => 모두다 null로 체크 가능
		// 2. 형변환 가능, String -> int, String -> boolean 등 다 가능해짐
		String openData = "20241118"; //문자열에
		System.out.println(openData + 1);
		int openDateNum = Integer.parseInt(openData); // 문자열을 정수로 바꿈 ★개 중요함★ 
		System.out.println(openDateNum + 1);
		
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('b'));
		
		char c1 = '5' , c2 = 'f';
		if(Character.isDigit(c1)) //c1이 숫자인지 물어보는것
			System.out.println("숫자입니다.");
		if(Character.isAlphabetic(c2)) //c2가 알파벳인지 물어보는거
			System.out.println("영문자입니다.");
		// ======================= 문자열로 바꾸기 ==========================
		
		/*
		 * 1. String.valueOf(1);
		 * 2. +"" 붙이기
		 * 3. .toString()
		 * 
		 */
		
		System.out.println(1);
		System.out.println(String.valueOf(1) // 스트링으로 바뀜
								instanceof String);
		System.out.println(1+"" instanceof String);
		System.out.println(Integer.valueOf(1).toString()
				instanceof String);
		
	}
}















