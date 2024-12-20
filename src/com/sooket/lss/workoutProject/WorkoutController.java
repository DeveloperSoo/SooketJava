package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;

public class WorkoutController {
	public static void main(String[] args) {
		WorkoutView view = new WorkoutView();
		WorkoutManage manage = new WorkoutManage();
		Workout workout = new Workout();
		Member member = new Member();
		
			member = view.insertMember();
			manage.saveMember(member);
			
			//System.out.println(member); // 여기까진 저장한거 확인
			System.out.println(manage.printMember());
			
			while(true) {
				int choice = view.mainMenu();
				switch(choice) {
				
				case 1 :
					//int count;
					workout = workout.insertWorkout(); //여기서 workout 객체 하나 뱉음운동 기록
					manage.saveWorkout(workout);
					
					break;
				case 2 :
					List<Member> mem = new ArrayList<Member>();
					mem = manage.printMember();
					System.out.println(mem);
					view.showMember(mem); 
					
					break;		
			}
		}		
	}	
}
