package com.sooket.day05.array;

public class Exam_ExchangeValue {
	public static void main(String[] args) {
		System.out.println("배열로 교환하기");
		int [] spaces = {24, 25};
		
		
		for(int val:spaces) {
			System.out.println(val);
		}  //spaces 의 데이터들 출력
		
		System.out.println("Exchanged!");
		// 교환 코드 작성
		int temp = spaces[0];
		spaces[0] = spaces[1];
		spaces[1] = temp;
		
		// 출력 코드 작성
		for(int val:spaces) {
			System.out.println(val);
		}
		
		
		
		
		
		System.out.println("변수로 교환하기");
		int space1 = 24;
		int space2 = 25;
		System.out.println(space1);
		System.out.println(space2);
		System.out.println("exchanged!");
		temp = space1;
		space1 = space2; 
		space2 = temp;
		System.out.println(space1);
		System.out.println(space2);
	
	}
}
