package com.sooket.total.exercise;

import java.util.Random;
import java.util.Scanner;

public class Personal_ArrayPractice5 {
	public static void main(String[] args) {
		int arrs [] = new int [10];
		Random rand = new Random();

		
		for(int i = 0; i < arrs.length; i++) {
			arrs[i] = rand.nextInt(10)+1;		
			System.out.print(arrs[i] +" ");
		}
		
		for(int j = 0; j < arrs.length-1; j ++) {
			for(int i = 0; i < (arrs.length-1)-j; i++) {
				if(arrs[i] > arrs[i+1]) {
					int temp = arrs[i];
					arrs[i] = arrs[i+1];
					arrs[i+1] = temp;
				}			
			}
		}
		for(int arr : arrs) {
			//System.out.print(arr + " ");
		}
		System.out.println();
		int max = arrs[arrs.length-1];
		int min = arrs[0];
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		
		
		
	}
}
