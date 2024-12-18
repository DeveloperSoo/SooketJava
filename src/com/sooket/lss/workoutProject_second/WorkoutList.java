package com.sooket.lss.workoutProject_second;

public class WorkoutList {
	private String part;
	private String date;
	private int set;
	private int rep;
	
	public WorkoutList () {}
	
	
	
	public WorkoutList(String part, String date, int set , int rep) {
		this.part = part;
		this.date = date;
		this.set = set;
		this.rep = rep;
	}



	public String getPart() {
		return part;
	}



	public void setPart(String part) {
		this.part = part;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	public int getSet() {
		return set;
	}



	public void setSet(int set) {
		this.set = set;
	}



	public int getRep() {
		return rep;
	}



	public void setRep(int rep) {
		this.rep = rep;
	}
	



	@Override
	public String toString() {
		return "WorkoutList [part=" + part + ", set=" + set + ", rep=" + rep + "]";
	}
	
	
	
}
