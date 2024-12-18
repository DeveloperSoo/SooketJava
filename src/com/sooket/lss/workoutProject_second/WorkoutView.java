package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutView {
	Scanner sc;
	
	public WorkoutView() {
		sc = new Scanner(System.in);
	}
	
	public int mainMenu() {
		System.out.println("==== Workout List====");
		System.out.println("1. 운동 등록");
		System.out.println("2. 운동 일지");
		System.out.println("3. 운동 리뷰");
		System.out.println("4. 종료");
		System.out.print("선택 >>");
		int choice = sc.nextInt();
		return choice;
		
	}
	
	public WorkoutList insertWorkout () {
		WorkoutList list = new WorkoutList();
		System.out.print("날짜 : ");
		list.setDate(sc.next());
		System.out.print("부위(가슴, 등, 어깨, 하체, 팔) : ");
		list.setPart(sc.next());
		System.out.print("총 세트 수 : ");
		list.setSet(sc.nextInt());
		System.out.print("세트 당 평균 횟수 : ");
		list.setRep(sc.nextInt());
		
		return list;

	}
	
	
	
	
	
}
