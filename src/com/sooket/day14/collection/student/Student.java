package com.sooket.day14.collection.student;

// Value Object
// Vo 
// 값이 들어가있는 클래스를 표기할때 부름
public class Student {
	// 필드
	private String name;
	private int firstScore;
	private int secondScore;

	// 생성자
	public Student() {}
	
	// 매개변수 생성자
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;		
	}
	
	// 메소드(getter/setter) alt + shift + s -> generate getter and setter
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// void는 return 생략 가능 왜? 반환할때 쓸게 아니니까
	}

	public int getFirstScore() {
		return firstScore;
	}

	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}

	public int getSecondScore() {
		return secondScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	// toString(); VO 클래스에는 기본세팅으로 getter/setter와 함께 꼭들어감
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
		
	}
	
	
	
	

	
	

	
	
	

}
