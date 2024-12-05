package com.sooket.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {
	public static void main(String[] args) {
		/*
		 * 2단을 출력해보겠습니다.
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 
		 */
		
		/*
		 * 문제1
		 * 정수 하나를 입력받아서 그 수 가 1~9사이의 수 일대만
		 * 그 수의 구구단을 출력하세요.
		 * 단, 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야 합니다"를 출력하세요
		 */
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수 하나 입력 : ");
		 int dan = sc.nextInt();
		 if(dan >= 1 && dan <= 9) { // and , or 연산자로 dan의 값을 필터링
			 System.out.println(dan +"단");
			 //구구단 출력
			 for(int i = 1; i < 10; i ++) { 
				 System.out.println(dan + " * " + i +" = " + (dan*i)); //dan단을 만들기 위한 출력값
			 }
		 }else {
			 System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		 }
		
		 
		
		
//		for(int i = 1; i < 10; i ++) {
//			System.out.println("2 * " + i + " = " + (i * 2));
//		}
		
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");		
	}
}
