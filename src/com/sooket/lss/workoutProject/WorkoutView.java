package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkoutView {
	private Scanner sc;
	private List <Member> mList; 
	public WorkoutView () {
		sc = new Scanner(System.in);
		mList = new ArrayList<Member>();
	}
	
	
	public Member insertMember() {
		Member member = new Member();
		System.out.println("===헬스장 입장!===");
		System.out.print("1. 이름 : ");	
		member.setName(sc.next());
		System.out.print("2. 성별(남 or 여) : ");
		member.setGender(sc.next());
		System.out.print("3. 전화번호(- 제외) : ");
		member.setPhoneNumber(sc.next());
		
		return member;
	}

	
	
	
	
	public String startMenu () {
		System.out.println("====Work out List====");
		//System.out.println("1.회원가입");
		System.out.println("아이디");
		System.out.print("입력 : ");
		String id = sc.next();
		return id;
	}
	
	public void showMember(List<Member> member) {
		
		for(Member mem : member) {
			System.out.println(mem.getName() + " 님의 운동기록은");			
			for(int i = 0; i < 3; i++) {
				System.out.println(mem.getList(i));
			}
			
		
		}
	}

	public int mainMenu() {
		System.out.println("=====Work out List=====");
		System.out.println("1. 운동등록");
		System.out.println("2. 운동 일지");
		System.out.println("3. 리뷰");
		System.out.println("4. 종료");
		System.out.print("선택 >>");
		int choice = sc.nextInt();
		return choice;
	}
	
	
	
}
