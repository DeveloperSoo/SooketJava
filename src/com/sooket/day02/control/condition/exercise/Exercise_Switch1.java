package com.sooket.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_Switch1 {
	public static void main(String[] args) {
		/*
		 * 문제2
		 * 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		 * 주문하시겠어요? 가격을 알려드립니다.
		 * (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		 * 메뉴를 입력해주세요 : 에스프레소
		 * 2500원입니다.
		 * 메뉴를 입력해주세요 : 자바칩프라프치노
		 * 없는 메뉴입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		String menu = sc.next(); // 작성하는 텍스트가 메뉴에 들어가는 명령
		
		// #1번 풀이
		switch(menu) {
				case "에스프레소" : 
					System.out.println("2,500원 입니다."); 
					break;
				case "카푸치노" : 
					System.out.println("3,500원 입니다."); 
					break;
				case "카페라떼" : 
					System.out.println("4,500원 입니다."); 
					break;
				case "아메리카노" : 
					System.out.println("5,500원 입니다."); 
					break;
				default : System.out.println("없는 메뉴임");
		}
		// #1번 풀이 정리 모델방식
		int price = 0;
		switch(menu) {
		case "에스프레소" : 
			price = 2500; 
			break;
		case "카푸치노" : 
			price = 3500; 
			break;
		case "카페라떼" : 
			price = 4500; 
			break;
		case "아메리카노" : 
			price = 5500; 
			break;
		default : System.out.println("없는 메뉴입니다.");
		// 동작 안하게 하는 방법 #1
			return;
}
		// 동작 안하게 하는 방법 #2
		if(price != 0) {
		System.out.println(price + "원 입니다.");
		}
	}
}
