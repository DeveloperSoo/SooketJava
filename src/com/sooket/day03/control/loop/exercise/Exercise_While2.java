package com.sooket.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될때까지
		 * 정수를 입력받고 -1이 입력되면
		 * 입력한 수의 합을 출력하시오.
		 * 값 : 1
		 * 값 : 2
		 * 값 : -1
		 * 합 : 3
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		int i = 0;
		int sum = 0;
		
		// #5
		System.out.print("값 : ");
		int lastNum;
		while((lastNum = sc.nextInt()) != -1) {
			sum += lastNum;
			System.out.print("값 : ");
			lastNum = sc.nextInt();
		}
		System.out.println("합 : " +  sum);
		
		
		
		
		
		
//		// #4
//		int sum1 = 0;
//		while(true) {
//			System.out.print("값 : ");
//			int num = sc.nextInt();
//			if(num == -1) {
//				break;
//			}
//			sum1 += num;
//		}
//		System.out.print("합 :" + (sum1));
//		
//		
//		
//		
//		// #3
//		while(i < 1) {
//			System.out.print("값 : ");
//			int num = sc.nextInt();
//			if(num == -1) {
//				break;
//			}
//			sum += num;
//		}
//		System.out.println("합 : " + (sum));
//		
//		
//		// #2
//		while(i < 1) {
//			System.out.print("값 : ");
//			int num = sc.nextInt();
//			sum += num;
//			if(num == -1) {
//			System.out.println("합 : " + (sum +1));
//			return;
//			}
//		}
//		// #1
//		System.out.print("값 : ");
//		int input = sc.nextInt();
//		while(input != -1) {
//			sum += input;
//			System.out.print("값 : ");
//			input = sc.nextInt();
//		}
//		System.out.println("합 : " + sum);
//		
	}
}
