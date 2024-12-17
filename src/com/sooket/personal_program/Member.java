package com.sooket.personal_program;

public class Member {
	private String name;
	private String gender;
	private String phoneNumber;
	
	public Member() {}
	
	public Member(String name, String gender, String phoneNumber) {
		this.name = name;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String isGender() {
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
