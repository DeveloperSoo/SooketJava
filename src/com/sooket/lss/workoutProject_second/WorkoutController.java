package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;

public class WorkoutController {
	
	public static void main(String[] args) {		
		WorkoutView view = new WorkoutView();
		WorkoutManage manage = new WorkoutManage();
		Workout work = new Workout();
		List<Workout> list = new ArrayList<Workout>();
		DetailPart partList = new DetailPart();
		Member member = new Member();

		end:
		while(true) {	
			int choice = view.mainMenu();
			
			switch(choice) {
			case 1:
				work = view.insertWorkout();
				partList.insertDetailPart(work);
				manage.saveWorkout(work);
				break;
			case 2:
				list = manage.printWorkout();
				view.showDate(list);
				view.showWorkout(list);
				break;
			case 3:
				list = manage.printWorkout();
				view.workoutReview(list);
	
				break;
			case 4:
				view.displayMessage("프로그램이 종료됩니다.");
				break end;
			default: view.displayMessage("1 ~ 4 사이에 숫자를 입력하세요");
				
				break;
			}
		}
	}	
}
