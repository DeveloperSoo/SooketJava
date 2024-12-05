package com.sooket.day01.inputsc;

import java.io.IOException;
import java.util.Scanner;

public class Exam_ScannerTest {
	public static void main(String[] args) throws IOException {
		
		System.out.println("반지름 입력 :"); //prlnt에 ln은 개행해주는 역활이라 빼면 바로 옆으로 붙음
		//int input = System.in.read("입력 받은 값 : " + (input-48)); //한계가 있음 숫자도 문자로 번역해서 아스키코드표에 따름
		//System.out.println("출력 : " + (input-48));
		Scanner sc = new Scanner(System.in); 	// 데이터를 받을 때 무조건 작성
		//int input = sc.nextInt();				// 정수 입력 nextInt
		double radius = sc.nextDouble();		// 실수 입력 nextDouble
		String msg = sc.next(); 				// 문자열 입력 next
		//System.out.println("입력 받은 값 : " + input );
		
		final double PI = 3.14;
		
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적 : " + circleArea);
		
	}
}
