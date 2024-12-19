package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;

public class WorkoutController {
	
	
	public static void main(String[] args) {		
		WorkoutView view = new WorkoutView();
		WorkoutManage manage = new WorkoutManage();
		Workout work = new Workout();
		List<Workout> list = new ArrayList<Workout>();
		
		while(true) {	
			int choice = view.mainMenu();
			
			switch(choice) {
			case 1:
				work = view.insertWorkout();
				manage.saveWorkout(work);
				break;
			case 2:
				list = manage.printWorkout();
				view.showWorkout(list);
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				
				break;
				
			}
		}
	
	
	
	}
	
	
	
	
	
	
}
