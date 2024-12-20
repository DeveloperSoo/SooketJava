package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;

public class WorkoutManage {
	private List<Member> mList;
	
	
	public WorkoutManage () {
		mList = new ArrayList<Member>();
	}
	
	// 전달받은 멤버 객체를 리스트에 저장
	public void saveMember(Member member) {
		mList.add(member);
	}

	// 입력받은 운동기록의 이름과 mList에 존재하는 객체들 이름이 동일하면 넣어주기
//	public void searchMember(Workout workout) {
//		for(Member mem : mList) {
//			if(mem.getName().equals(workout.getName())) {
//				mem.addList(workout);
//			}
//		}		
//	}
	// 입력받은 운동기록의 이름과 mList에 존재하는 객체들 이름이 동일하면 넣어주기
	public void saveWorkout(Workout workout) {
		for(Member mem : mList) {
			if(mem.getName().equals(workout.getName())) {
				mem.addList(workout);
			}else {
				System.out.println("확인된 회원이 아닙니다, 다시 적어주세요");
			}
		}	
	}
	


	
	// 지금까지 입력받은 놈들 뱉을거임	
	public List<Member> printMember () {

		return mList;
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
