package com.sooket.total.exercise;

public class Personal_ArrayPractice2 {
	public static void main(String[] args) {
		
		int nums[] = new int [10];
		int k = 10;
		for(int i = 1 ; i < 10; i++) {
			nums[i] = k;
			k--;
			System.out.print(nums[i] + " ");
		}
		
	}
	
}
