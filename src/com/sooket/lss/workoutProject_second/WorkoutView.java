package com.sooket.lss.workoutProject_second;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

public class WorkoutView {
	Scanner sc;
	private List<Workout> list;
	int num = 0;
	
	public WorkoutView() {
		sc = new Scanner(System.in);
		list = new ArrayList<Workout>();
}
	// 메인메뉴 출력 메소드
	public int mainMenu() {
		System.out.println("==== Workout List====");
		System.out.println("1. 운동 등록");
		System.out.println("2. 운동 일지");
		System.out.println("3. 월간 리뷰");
		System.out.println("4. 종료");
		System.out.print("선택 >>");
		int choice = sc.nextInt();
		return choice;
		
	}
	
	// 운동 내용을 입력받는 메소드
	public Workout insertWorkout () {
		Workout list = new Workout();
		System.out.print("날짜(yyyymmdd) : ");
		list.setDate(sc.next());
		System.out.print("부위\n1.가슴 / 2.등 / 3.어깨 / 4.다리 / 5.팔\n선택 : ");
		list.setPart(sc.nextInt());
		System.out.print("총 세트 수 : ");
		list.setSet(sc.nextInt());
		System.out.print("세트 당 평균 횟수 : ");
		list.setRep(sc.nextInt());	
		return list;
	}
		
	// 해당 월 운동 횟수와 부위 별 운동 횟수 체크
	public void showDate(List<Workout> list) {
		List<Workout> newlist = list;
		int year = 0;
		String month = "";
		int count = 0;
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		Calendar cal = new GregorianCalendar();
		String nMonth = sdf.format(cal.getTime()) ;
		if(list != null) {
			for(Workout work : newlist) {
				year = Integer.parseInt(work.getDate().substring(0, 4));
				month = work.getDate().substring(4, 6); 		
				if(nMonth.equals(month)) {
					count++;									
				}
			}
		}
	}
//		// 더블체크용
//		System.out.println("이번달 총 운동횟수는 : 총 " + newlist.size() + "회 입니다.");
//		int chest = 0;
//		int back = 0;
//		int shoulder = 0;
//		int leg = 0;
//		int arm = 0;
//		
//		if(newlist != null) {
//			for(Workout work : newlist) {
//				if("가슴".equals(work.getPart())) {
//					chest++;
//				}
//				if("등".equals(work.getPart())) {
//					back++;
//				}
//				if("어깨".equals(work.getPart())) {
//					shoulder++;
//				}
//				if("하체".equals(work.getPart())) {
//					leg++;
//				}
//				if("팔".equals(work.getPart())) {
//					arm++;
//				}
//			}
//			System.out.println("가슴 운동은 총 " + chest+ "회");
//			System.out.println("등 운동은 총 " + back + "회");
//			System.out.println("어깨 운동은 총 " + shoulder+ "회");
//			System.out.println("하체 운동은 총 " + leg + "회");
//			System.out.println("팔 운동은 총 " + arm + "회");			
//		}
//	}
	
	
	// 입력된 전체 총 , 부위별 운동횟수 출력
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
				if((int)work.getPart() == 1) {
					chest++;
				}
				if((int)work.getPart() == 2) {
					back++;
				}
				if((int)work.getPart() == 3) {
					shoulder++;
				}
				if((int)work.getPart() == 4) {
					leg++;
				}
				if((int)work.getPart() == 5) {
					arm++;
				}
			}
			System.out.println("가슴 운동은 총 " + chest+ "회");
			System.out.println("등 운동은 총 " + back + "회");
			System.out.println("어깨 운동은 총 " + shoulder+ "회");
			System.out.println("하체 운동은 총 " + leg + "회");
			System.out.println("팔 운동은 총 " + arm + "회");			
		}
	}
	
	// 지난달의 운동횟수와 비교해주는 메소드
	public void workoutReview(List <Workout> workout) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM");
		Calendar cal = new GregorianCalendar();
		String nMonth = sdf.format(cal.getTime()) ;
		List <Workout> presentMonth = new ArrayList<Workout>();
		List <Workout> lastMonth = new ArrayList<Workout>();
		
		for(Workout work : workout) {
			if(work.getDate().substring(4, 6).equals(nMonth)) {
				presentMonth.add(work);
			}else {
				lastMonth.add(work);
			}
		}
		System.out.println("지난달 운동 횟수 : " + lastMonth.size() + "회");
		System.out.println("이번달 운동 횟수 : " + presentMonth.size() + "회");

	}
	
	// 메세지 출력 메소드
	public void displayMessage(String msg) {
		
		System.out.println(msg);
	}	
}
