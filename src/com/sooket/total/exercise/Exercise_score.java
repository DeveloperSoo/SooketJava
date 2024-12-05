package com.sooket.total.exercise;

import java.util.Scanner;

public class Exercise_score {
	public static void main(String[] args){
		
//				====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 >> 1
//				====== 성적 입력 ======
//				국어 : 99
//				영어 : 88
//				수학 : 77
//				====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 >> 2
//				====== 성적 출력 =======
//				국어 : 99
//				영어 : 88
//				수학 : 77
//				총점 : 264
//				평균 : 88.0
//				====== 메인 메뉴 ======
//				1. 성적입력
//				2. 성적출력
//				3. 종료
//				선택 >> 3
//				프로그램이 종료되었습니다.
//		
		Scanner sc = new Scanner(System.in);


		int kor = 0;
		int eng = 0;
		int math = 0;
		
		while(true) {
			System.out.println("===== 메인메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 >> ");
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : 
				System.out.println("===== 성적입력 =====");
				System.out.print("국어 : ");
				kor = sc.nextInt();
				System.out.print("영어 : ");
				eng = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;
				
			case 2 : 
				System.out.println("===== 성적출력 =====");
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				int sum = kor + eng + math;
				double avg = (sum) / 3;
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
				break;
				
			case 3 : 
				System.out.println("프로그램이 종료 됩니다.");
				return;
			}
		
		
		}
		
		
		


		
		
		
			
		}
		
	}
//}
