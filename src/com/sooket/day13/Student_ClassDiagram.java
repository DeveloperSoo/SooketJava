package com.sooket.day13;

public class Student_ClassDiagram {
	//필드 //수정
	private int studentId;
	private String name;
	private String major;
	
	// 메소드(생성자)
	public Student_ClassDiagram() {}
	
	public Student_ClassDiagram(int studentId, String name, String major) {}
	
	// 메소드 (getter/setter)	
	public int getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	

	

}


