package com.sooket.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Operator2 {
	public static void main(String[] args) {
	 /*
	  * 입력한 정수가 1 ~ 100사이의 숫자인지 확인하는
	  * 프로그램을 작성하여라
	  * 정수 하나 입력 : 44
	  * 1부터 100사이의 숫자인가? : true
	  * 
	  * 정수 하나 입력 : 101
	  * 1부터 100사이의 숫자인가 : false
	  *  
	  */
		
		System.out.print("정수 하나 입력 : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		boolean result = input >= 1 && input <= 100;
		System.out.println("1부터 100사이의 숫자인가? : " + result);
		
		
		
	}
}
