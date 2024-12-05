package com.sooket.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {
	public static void main(String[] args) {
		/*
		 * 문제5
		 * 사용자로부터 입력 받은 숫자의 구구단을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		System.out.println(num + "단");
		for(int i = 1; i < 10 ; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
