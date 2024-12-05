package com.sooket.day03.control.loop;

public class Exam_ForDouble {
	public static void main(String[] args) {
		/*
		 * 2 ~ 9단 구구단을 출력하시오.
		 */
		for(int i = 2; i < 10 ;i++) {
			System.out.println("==="+i+"단===");
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
		}	
		
		for(int j = 2; j < 10; j++) {
			System.out.println("==="+j+"단===");
			for(int i = 1; i < 10 ; i++) {
				System.out.println(j + " * " + i + " = " + j*i);			
			}
		}
	
		
	
//	for(int i = 1 ; i < 10; i++) {
//		System.out.println("2 * " + i + " = " + 2*i);
//	}
//	for(int i = 1 ; i < 10; i++) {
//		System.out.println("3 * " + i + " = " + 3*i);
//	}
//	for(int i = 1 ; i < 10; i++) {
//		System.out.println("4 * " + i + " = " + 4*i);
//	}
//	for(int i = 1 ; i < 10; i++) {
//		System.out.println("5 * " + i + " = " + 5*i);
//	}
//	for(int i = 1 ; i < 10; i++) {
//		System.out.println("6 * " + i + " = " + 6*i);
//	}
//	for(int i = 1 ; i < 10; i++) {
//		System.out.println("7 * " + i + " = " + 7*i);
//	}
	
	
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("2 * 5 = 10");
//		System.out.println("2 * 6 = 12");
//		System.out.println("2 * 7 = 14");
//		System.out.println("2 * 8 = 16");
//		System.out.println("2 * 9 = 18");
}
}

