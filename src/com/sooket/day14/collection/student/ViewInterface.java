package com.sooket.day14.collection.student;

import java.util.List;

public interface ViewInterface {
	
	Student inputStudent();
	
	void displayStudents(List<Student> stdList);
	
	int printMenu();
	
	void displayMsg(String msg);
	
	String inputName(String category);
	
	Student modiftStudent(Student student);
	
}
