package com.sooket.day01.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String[] args) {

		
//		System.out.println(11+18);
//		System.out.println(11-18);
//		System.out.println(11*18);
//		System.out.println(11/18); //결과값은 몫이 나옴
//		System.out.println(11%18); //결과값은 나머지가 나옴
//		System.out.println(9/2);
//		System.out.println(9%2);
			
		// 초 단위의 정수를 입력받고, 몇시간, 몇분, 몇초 인지
		// 출력하는 프로그램을 작성하여라.
		// 초단위의 정수 입력 : 3287
		// 0시간 54분 47초 입니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("초단위의 정수 입력 : ");
		int time = sc.nextInt();
		int minute = (time / 60) % 60;
		int second = time % 60;
		int hour = (time / 60) / 60;
		
		System.out.println(hour + "시간" +minute+ "분" + second + "초");
	}
}
