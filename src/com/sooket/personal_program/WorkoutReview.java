package com.sooket.personal_program;

import java.util.Scanner;

public class WorkoutReview {
	private Scanner sc;

	public WorkoutReview () {
		sc = new Scanner(System.in);
	}
	
	public Member insertMember() {
		Member member = new Member();
		System.out.print("1. 이름 : ");	
		member.setName(sc.next());
		System.out.print("2. 성별(남 or 여) : ");
		member.setGender(sc.next());
		System.out.print("3. 전화번호(- 제외) : ");
		member.setPhoneNumber(sc.next());
		
		return member;
	}

	
	
	public int startMenu () {
		System.out.println("====Work out List====");
		Member member = new Member();
		System.out.println("1.회원가입");
		System.out.println("2. 로그인");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		return num;
	}
	
	
	
}
