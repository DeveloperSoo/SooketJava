package com.sooket.day03.control.loop.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		/*
		 * 문제 1-1
		 * While문을 이용하여 1 ~ 10 까지의 수를 더한 값을 출력하시오.
		 * 
		 * 문제 1-2
		 * while문을 이용하여 1~100사이의 홀수의 합을 출력하시오. 
		 * 
		 */
		
		// 문제 1-1
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i; //누적합
				if(i != 10) {
					System.out.print(i+ "+");
				}else {				
					System.out.print(i+ "=");
					}
			i++;
		}
		System.out.println(sum);
		
		// 문제 1-2 #1
		int num = 1;
		int sum1 = 0;
		while(num <= 100) {
			if(num % 2 != 0) {
				if(num != 99) {
						System.out.print(num + "+");
					}else {
						System.out.print(num + "=");				
					}
				sum1 += num;
				}
			num++;
		}
		System.out.println(sum1);
		
		
		
		//문제 1-2 #2
		int num1 = 1;
		int sum2 = 0;
		while(num1 <= 100) {
			sum2 += num1;
			num1 += 2; // i = i + 2; -> i += 2
		} System.out.println(sum2);
		
		
	}
}
