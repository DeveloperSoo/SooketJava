package com.sooket.day08.oop;

import java.util.Scanner;

public class Rectangle {
		/*
		너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
		너비(width)와 높이(height) 필드, 그리고 면적 값을 제공하는 getArea() 메소드를 가진 
		Rectangle 클래스를 만들어 활용하라
		*/	
	int width;
	int height;
	
	
	public int getArea(/*int width, int height*/) {
		
		return width*height;
	}
	

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
//		System.out.print(">>");
//		rect.width = sc.nextInt();
//		rect.height = sc.nextInt();
//		int result = rect.getArea(rect.width, rect.height);	
//		System.out.println("사각형의 면적은" + result);
/////////////////////////////////////////////////////////////////////////////////
		
		//Rectangle rect= new Rectangle(); // 객체 생성
		Scanner scanner= new Scanner(System.in);
		 System.out.print(">> ");
		 rect.width= scanner.nextInt();
		 rect.height= scanner.nextInt();
		 System.out.println("사각형의 면적은 : " + rect.getArea());
		
		
	}
	
}