package com.sooket.day03.control.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String[] args) {
		/*
		 * 0시 0분부터 23시 59분까지 출력하는 프로그램을 작성하세요
		 * 0시 0분
		 * 
		 */
		
		for(int i = 0; i < 24; i++) {
			for(int j = 0; j <60; j++) {
				System.out.println(i + "시" + j + "분");
			}
		}
		
		
		
		
		for(int hour = 0; hour < 24; hour++) {
			for(int min = 0; min < 60 ; min++) {
				System.out.println(hour + "시 " + min + "분");
			}			
		}
		
		
	}
}
