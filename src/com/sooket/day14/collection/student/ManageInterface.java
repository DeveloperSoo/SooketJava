package com.sooket.day14.collection.student;


import java.util.List;

public interface ManageInterface {

	void registerStudent(Student student); // 등록
	
	List<Student> searchListByName(String name);
	
	Student searchOneByName(String name);
	
	public int searchIndexByName(String name);
	
	List<Student> selectAllStudents(); // 가져오기
	
	void modifyStudent(int index, Student student);
	
	void deleteStudent(int index);
	
}
