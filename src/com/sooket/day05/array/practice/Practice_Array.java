package com.sooket.day05.array.practice;

import java.util.Random;
import java.util.Scanner;

public class Practice_Array {
	
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 1부터 10까지 값
		 * 반복문을 이용하여 순서대로 배열에 저장
		 */
		int arrs [] = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			arrs[i] = (i + 1);
		}
		for(int i = 0; i < 10; i++) {			
			System.out.print((arrs[i] + " "));
		}
	}
	
	public void practice2() {
		int [] arrs = new int[10];
		for(int i = 0, count=10; i < 10; i++ , count--)			
			arrs[i] = count;
		
		for(int i = 0; i < 10; i++)
			System.out.print(arrs[i]+ " ");
		
		}
		
		


	public void practice3() {
		System.out.print("양의 정수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr [];
		arr = new int[num];
		for(int i = 0; i < num; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");			
		}
	}
	
	public void practice4() {
		/*
		 * 길이가 5인 String 배열 선언
		 * "사과", "귤", "포도", "복숭아", "참외" 순서대로 저장
		 * 그리고 배열 인덱스를 이용해서 귤 출력
		 */
		
		String fruits [];
		fruits = new String [5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
		
		System.out.println(fruits[1]);
		for(int i = 0; i <fruits.length; i++) {
			System.out.print(fruits[i] + " ");
		}
	}

	public void practice5() {
		System.out.println("practice5");
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String word = sc.next();
		char a = word.charAt(0);
		System.out.print("문자 : ");
		char findAlpabet = sc.next().charAt(0);
		int count = 0;
		int i  = 0;
		int index = 0;
		System.out.print(findAlpabet +"가 존재하는 위치 : ");
		for(i = 0, count = 0; i < 10 ; i++) {
			a = word.charAt(i);
			if(findAlpabet == a) {
				count++;
				index = i + 1;		
				System.out.print(index + " ");
			}
		}		
		System.out.println();
		System.out.println(findAlpabet +"의 개수 : " + count);
	}
	
	
	
	public void practice6_1() {
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		
			String days [] = {"월", "화", "수", "목", "금", "토", "일"};
			int day = sc.nextInt();
			if(day >= 0 && day < days.length) {
				System.out.println(days[day]+"요일");
			}else {
				System.out.println("잘못 입력 하셨습니다.");
			}
	}
	
	
	public void practice6() {
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		try {
			String days [] = {"월", "화", "수", "목", "금", "토", "일"};
			int day = sc.nextInt();
			if(day >= 0 && day <= days.length) {
				System.out.println(days[day]+"요일");
			}else {
				System.out.println("잘못 입력 하셨습니다.");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못 입력 하셨습니다.");
			return;
		}
	}
	

	
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int arrs [] = new int[num];
		for(int i = 0; i < arrs.length; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arrs[i] = sc.nextInt();
		}
				
		int sum = 0;
		for(int arr : arrs) {
			sum += arr;
			System.out.print(arr + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);	
	}
	
	
	public void practice8() {
		System.out.println("practice8");
		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int middle = (num/2)+1;
		int arrs [] = new int[num];
		
		if(num%2 == 0) {
			System.out.println("다시 입력하세요");
		}else if(num % 2 != 0) {
			for(int i = 0; i < middle; i++) {				
					System.out.print((i+1) + ", ");			
			}
			for(int i = (middle-1); i > 0; i--) {
				if(i != 1) {
					System.out.print(i+ " ,");					
				}else {
					System.out.print(i);	
				}
			}	
		}	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String chicken [] = {"양념", "후라이드", "훈제", "뿌링클", "핫쇼킹"};
		System.out.print("치킨 이름을 입력하세요 : ");

		String order = sc.next();
		for(int i = 0; i < 5; i++) {
				if(chicken[i].equals(order)) {
				System.out.println(order+"치킨 배달 가능");
				return;
				
				}else {
				System.out.print(order+"치킨은 없는 메뉴입니다.");
				 return;
				}			
			}
		
		
//		for(int i = 0; i < 5; i++) {
//			if(chicken[i] ==()) {
//				System.out.print(order + " 치킨 배달가능");
//				break;
//			}else {
//				 System.out.print(order + " 치킨은 없는 메뉴입니다.");
//			}
//		} 
		
	}
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		String idNum [] = new String[1];
		System.out.print("주민등록번호 (-포함) : ");
		String myId = sc.next();
		String copied [] = new String[8];
		
		
	}
	
	//선생님 풀이
	public void practice11() {
		int lottos [] = new int [6];
		Random rand = new Random();
		for(int i = 0 ; i < lottos.length; i++) { //여긴 숫자 6개니까 5까지가 맞음
			// 1 ~ 45 사이의 숫자가 랜덤하게 나와야함.
			//System.out.print((rand.nextInt(45)+1)+ " ");
			// 배열안에 넣어보기
			lottos[i] = rand.nextInt(45)+1;		
			
				for(int j = 0; j < i ; j++) {  //중복값 없애기, 전부 돌 필요 없이 i 까지만 확인
					if(lottos[i] == lottos[j]) {
						i--;
						break;
					}		
				}			
			
		}
		System.out.println();
		// 선택, 삽입, 버블, 퀵, 머지 ,,,       // 버블 정렬 사용
		for(int j = 0; j < (lottos.length-1) ; j++) {
			for(int i = 0; i < (lottos.length-1)-j; i++) {
				if(lottos[i] > lottos[i+1]) {
					int temp = lottos[i];
					lottos[i] = lottos[i+1];
					lottos[i+1] = temp;
				}
			}
		}
		for(int lotto:lottos) {
			System.out.print(lotto + " ");
		}
		System.out.println();
	}
			
//			//#1
//			if(lottos[1] == lottos[0] {
//				i--;
//			
//			//#2
//			if(lottos[2] == lottos[0]) {
//				i--;}
//			if(lottos[2] == lottos[1]) {
//				i--;}
//			//#3
//			if(lottos[3] == lottos[0]) {
//				i--;}
//			if(lottos[3] == lottos[1]) {
//				i--;}
//			if(lottos[3] == lottos[2]) {
//				i--;}
//			//#4
//			if(lottos[4] == lottos[0]) {
//				i--;}
//			if(lottos[4] == lottos[1]) {
//				i--;}
//			if(lottos[4] == lottos[2]) {
//				i--;}
//			if(lottos[4] == lottos[2]) {
//				i--;}
		

	
	public void practice12() {
		System.out.println("practice11");
	}
	
}
