package com.sooket.total.exercise;

import java.util.Scanner;

public class Personal_ArrayPractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수 : ");
		int num = sc.nextInt();
		int arrs [] = new int [num];
		int k = 1;
		
		for(int i = 0; i < num; i++) {
			arrs[i] = k;
			k++;
			System.out.print(arrs[i] + " ");
		}
	}
		
	
	
}
