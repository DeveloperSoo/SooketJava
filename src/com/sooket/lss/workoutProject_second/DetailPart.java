package com.sooket.lss.workoutProject_second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailPart {
	private int top;
	private int center;
	private int bottom;
	private int front;
	private int back;
	private int set;
	private int reps;
	DetailPart partList;
	List<Workout> workList;
	Scanner sc;
	
	public DetailPart() {
	//partList = new DetailPart();
	//workList = new ArrayList<Workout>();
	sc = new Scanner(System.in);
	}
	
	public void insertDetailPart(Workout work) {
				
			}
	
	public int getSet() {
		return set;
	}

	public void setSet(int set) {
		this.set = set;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}	

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getCenter() {
		return center;
	}

	public void setCenter(int center) {
		this.center = center;
	}

	public int getBottom() {
		return bottom;
	}

	public void setBottom(int bottom) {
		this.bottom = bottom;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getBack() {
		return back;
	}

	public void setBack(int back) {
		this.back = back;
	}	 
}
