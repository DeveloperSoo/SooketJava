package com.sooket.total.exercise;

import java.util.Scanner;

public class Personal_Practice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력하고 싶은 단수 입력 : ");
		int dan = sc.nextInt();
		
		if (dan > 9) {
			System.out.println("9 이하의 숫자만 입력해주세요");
		}else {
			for(int j = dan; j< 10; j++) {
				System.out.println("=====" + j + "단=====");
				for(int i = 1; i < 10; i++) {
					System.out.println(j +" * " + i + " = " + (j*i));
				}
			}
		}
	}
}
