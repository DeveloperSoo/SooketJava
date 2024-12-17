package com.sooket.personal_program;

public class Run {
	public static void main(String[] args) {
		WorkoutReview review = new WorkoutReview();
		WorkoutManage manage = new WorkoutManage();
		
		
		int choice = review.startMenu();
		switch(choice) {
		case 1 :
			Member member = review.insertMember();
			manage.checkMember(member);
			break;
		case 2 :
			
			break;
		
		}
		
		
		
	}
	
}
