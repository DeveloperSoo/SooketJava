package com.sooket.day02.control.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
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
		System.out.print("메뉴를 입력해주세요 : ");
		String menu = sc.next();
		
		
//		if(menu.equals("에스프레소")) {
//			System.out.println("2,500원 입니다.");
//		}
//		
//		String msg1 = "hello";
//		String msg2 = "hello";
//		String msg3 = new String("hello");
//		
//		if(msg3 ==msg2) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");			
//		}
		
		if(menu.equals("에스프레소")) {
			System.out.println("2,500원");
		}else if (menu.equals("카푸치노")){
			System.out.println("3,500원");			
		}else if (menu.equals("카페라떼")){
			System.out.println("4,500원");			
		}else if (menu.equals("아메리카노")){
			System.out.println("3,500원");			
		}
		
		
		// 내가한 답
		String result = (menu.equals("에스프레소")) ? "2,500원 입니다." :
						(menu.equals("카푸치노"))   ? "3,500원 입니다." :
						(menu.equals("카페라떼"))   ? "4,500원 입니다." :
						(menu.equals("아메리카노")) ? "5,500원 입니다." :
							"없는메뉴입니다.";
								
		
		System.out.println(result);
		
		
	}
}
