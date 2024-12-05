package com.sooket.total.exercise;


import java.util.Scanner;

public class Personal_ArrayPractice6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num > 9 && num < 0) {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		for(int i = 1; i < num; i++) {
			if(num % (i) != 0) {
				System.out.println("소수입니다.");
				break;
			}else if(num % (i+1) == 0) {
				System.out.println("소수가 아닙니다.");			
				break;
			}
		}
		
		
		
	}
}
