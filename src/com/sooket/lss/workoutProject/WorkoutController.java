package com.sooket.lss.workoutProject;

import java.util.List;

public class WorkoutController {
	public static void main(String[] args) {
		WorkoutView view = new WorkoutView();
		WorkoutManage manage = new WorkoutManage();
		Workout record = new Workout();
		
			Member member = view.insertMember();
			manage.saveMember(member);
			
			manage.printMember();
			//System.out.println(member); // 여기까진 저장한거 확인
			
			while(true) {
				int choice = view.mainMenu();
				switch(choice) {
				
				case 1 :
					//Member member = view.insertMember();
					//manage.saveMember(member);
					record = record.insertWorkout(); //여기서 workout 객체 하나 뱉음운동 기록
					
					member.addList(record);; // addlist 하나
					manage.printMember();
					
					// 인덱스 값 빼올 리스트 하나
					// 그걸로 saveWorkout 에 넣을 메소드 하나 필요
					
					
					
					//view.showMember(manage.printMember());
					
					break;
				case 2 :
					
					break;
					
				}
			}
			
		
			
			
			
			

			
		
		
		
		
	}
	
}
