package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;

public class WorkoutManage {
	private List<Workout> list;	
	
	
	public WorkoutManage () {
		list = new ArrayList<Workout>();

	}
	
	public void saveWorkout(Workout workout) {
		list.add(workout);
	}
	
	public List<Workout> printWorkout() {
		
		return list;
	}
	
	public void printDate(Workout workout) {
		for(Workout work : list) {
			
		}
	}
}
