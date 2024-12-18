package com.sooket.lss.workoutProject_second;

public class WorkoutController {
	
	
	public static void main(String[] args) {		
		WorkoutView view = new WorkoutView();
		WorkoutManage manage = new WorkoutManage();
		
		int choice = view.mainMenu();
		
		switch(choice) {
			case 1:
				view.insertWorkout();
				
				break;
			case 2:
				
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
