package com.sooket.day05.array.practice;

public class Practice_Array_teacher {
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지 값 
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs;
		arrs = new int[10];
		for(int i = 0; i < 10; i++) {
			arrs[i] = (i+1);
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arrs[i]+ " "); 
		}
	}
	public void practice2() {
		/*
		 * 길이가 10인 배열 선언
		 * 10부터 1까지 값 
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int [] arrs = new int[10];
		for(int i = 0; i < 10; i++)
			System.out.println(arrs[i]);
	}
	public void practice3() {
		System.out.println("practice3");
	}
	public void practice4() {
		System.out.println("practice4");
	}
	public void practice5() {
		System.out.println("practice5");
	}
	public void practice6() {
		System.out.println("practice6");
	}
	public void practice7() {
		System.out.println("practice7");
	}
	public void practice8() {
		System.out.println("practice8");
	}
	public void practice9() {
		System.out.println("practice9");
	}
	public void practice10() {
		System.out.println("practice10");
	}
	public void practice11() {
		System.out.println("practice11");
	}
}
