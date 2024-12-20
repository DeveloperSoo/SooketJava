package com.sooket.lss.workoutProject;

import java.util.ArrayList;
import java.util.List;

// 주로 이용하는 고객 정보임 운동기록을 표시하고 있음
public class Member {
	private String name;
	private String gender;
	private String phoneNumber;
	private List <Workout> list;

	// 기본 생성자
	public Member() {
		list = new ArrayList<Workout>();
	}
	
	// 매개변수 생성자
	public Member(String name, String gender, String phoneNumber) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		//list = new ArrayList<Workout>();

	}
	
	//운동기록 받을때 이름밖에 없으면 사용할 생성자
	public Member (String name) {
		this.name = name;
	}
	
	
	// 운동기록 리스트를 리턴할 때 사용
	public List<Workout> getList(int num) {
			list = (List<Workout>) list.get(num);
		return list;
	}
	// 운동기록 리스트를 member 변수에 넣을때 사용하는건데 밑에꺼랑 겹치는듯?
	public void setList(List<Workout> list) { // 이거 왜있음
		this.list = list;
	}
	
	public void addList(Workout workout) {
		list.add(workout);
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
