package com.sooket.day08.method;

public class Exam_Method {
	/*
	 * 리턴형 O , X
	 * 매개변수 O , X
	 * 
	 * 리턴형 X , 매개변수 X
	 * 리턴형 X , 매개변수 O
	 * 리턴형 O , 매개변수 X
	 * 리턴형 O , 매개변수 O
	 * 
	 */
	
	public void noReturnNoParam() {
		System.out.println("noReturnNoparam");
	
	}
	
	public void noReturnYesParam(int num) {
		//int num; //여기에 num이 있는것과 같기 때문에 선언하면안됨 그냥 바로 사용
		//int num = 20250502; 
		System.out.println("num : " + num);
		
	}
	
	public int yesReturnNoParam() {
		int date = 20241118; // 출력시킬 값을 먼저 선언해줘도 되고
		return date; // 해당 리턴뒤에 바로 붙여도됨 return 20241118;
	}
	
	public int yesReturnYesParam(int num) {
		num += 10;
		return num; //반환형 있어서 생략 불가
	}
	
	public int sum(int ...numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum; 
	}
	
	
	
}
