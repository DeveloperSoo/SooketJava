package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;

public class WorkoutManage {
	private List<Member> mList;
	
	
	public WorkoutManage () {
		mList = new ArrayList<Member>();
	}
	
	public void saveMember(Member member) {
		mList.add(member);
	}

	
	public void saveWorkout(Workout workout, int index) {
		mList.get(index).addList(workout);
		
	}
	
	
	public void printMember () {
		for(Member mem : mList) {
			System.out.println(mem);
		}
	}


	
	
	
	
	public void checkMember(Member member) {
		//List <Member> checked = new ArrayList<Member>();
		if(member != null) {
			for(Member mem : mList) {
				if(mem.getName().equals(member.getName()) 
						&& mem.getGender().equals(member.getName()) 
						&& mem.getPhoneNumber().equals(member.getPhoneNumber())) {
					System.out.println("중복된 회원입니다, 로그인 부탁드립니다.");
					break;
				}
				else {
					System.out.println("회원등록 되었습니다");
				} 
			} 
		} 
	}
	
	
}
