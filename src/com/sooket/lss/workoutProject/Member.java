package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String name;
	private String gender;
	private String phoneNumber;
	private List <Workout> list;

	public Member() {}
	
	public Member(String name, String gender, String phoneNumber) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		list = new ArrayList<Workout>();
	}
	
	

	public List<Workout> getList() {
		return list;
	}

	public void setList(List<Workout> list) {
		this.list = list;
	}
	
	public void addList(Workout workout) {
		this.list.add(workout);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", gender=" + gender + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	
	
	
}
