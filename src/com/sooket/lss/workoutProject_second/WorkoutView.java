package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutView {
	Scanner sc;
	private List<Workout> list;
	
	public WorkoutView() {
		sc = new Scanner(System.in);
		list = new ArrayList<Workout>();
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
	
	public Workout insertWorkout () {
		Workout list = new Workout();
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
	
	public void showWorkout(List<Workout> list) {
		List<Workout> newlist =  list;
		System.out.println("총 운동횟수는 : " + newlist.size() + "회 입니다.");
		int chest = 0;
		int back = 0;
		int shoulder = 0;
		int leg = 0;
		int arm = 0;
		
		if(newlist != null) {
			for(Workout work : newlist) {
				if("가슴".equals(work.getPart())) {
					chest++;
				}
				if("등".equals(work.getPart())) {
					chest++;
				}
				if("어깨".equals(work.getPart())) {
					chest++;
				}
				if("하체".equals(work.getPart())) {
					chest++;
				}
				if("팔".equals(work.getPart())) {
					chest++;
				}
			}
			System.out.println("가슴 운동은 총 " + chest+ "회");
			System.out.println("등 운동은 총 " + back + "회");
			System.out.println("어깨 운동은 총 " + shoulder+ "회");
			System.out.println("하체 운동은 총 " + leg + "회");
			System.out.println("팔 운동은 총 " + arm + "회");
			
		}
		
		
		
		
		
		
	}
	
	
	
	
}
