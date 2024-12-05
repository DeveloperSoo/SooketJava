package com.sooket.day05.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String[] args) {
		/*
		 * 배열의 length 필드를 이용하여 배열 크기만큼 정수를
		 * 입력받고 평균을 구하는 프로그램을 작성하라.
		 * 단, 배열의 크기는 5이다.	
		 */
		
		// 내풀이
		Scanner sc = new Scanner(System.in);
		int nums [] = new int[5];
		System.out.println("정수 " + nums.length+"개 입력");
		int total = 0;
		for(int i = 0; i < nums.length; i++) {
			nums[i]=sc.nextInt();
			total += nums[i];
			}
//		nums[0] = sc.nextInt();
//		nums[1] = sc.nextInt();
//		nums[2] = sc.nextInt();
//		nums[3] = sc.nextInt();
//		nums[4] = sc.nextInt();
		
		double avg = total/(double)5;
		
		System.out.println("평균 : " + avg);
		
		
		//선생님 풀이
//		nums[0] = 24;
//		nums[1] = 11;
//		nums[2] = 18;
//		nums[3] = 5;
//		nums[4] = 2;
//		int total = nums[0] + nums[1] + nums[2] + nums[3] + nums[4];
//		double avg = total/(double)5;
//		System.out.println("평균 : " + avg);
		
		// nums 배열에 24 11 18 5 2 순서대로 저장 후
		// 평균을 구하는 프로그램을 작성하여라.

	}
}