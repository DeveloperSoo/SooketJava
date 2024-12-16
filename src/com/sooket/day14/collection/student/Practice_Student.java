package com.sooket.day14.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Practice_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 : ");
		int secondScore = sc.nextInt();
		// 최종적으로는 Student 객체에 넣어야 함.
		// 1. 기본생성자 이용
		 Student student = new Student(); 		//객체 생성
		 student.setName(name);					//네임 넣기
		 student.setFirstScore(firstScore);		//1차 점수
		 student.setSecondScore(secondScore);	//2차 점수
		 
		
		// 2. 매개변수 있는 생성자 이용
//		Student student [] = new Student{"이성수", 11, 20};
		 student = new Student(name, firstScore, secondScore); // 매개변수 생성자를 통한 객체 생성
		// 그 후에는 ArrayList 객체에 넣어야 함.
		List<Student> stdList = new ArrayList<Student>();
		
		stdList.add(student);
		Student std = stdList.get(0);
		System.out.println(std.toString());
		
		//stdList.get(1);
	}
}
