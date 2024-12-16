 package com.sooket.day14.collection.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class StudentManage implements ManageInterface{
private List<Student> sList;
	
	public StudentManage() {
		this.sList = new ArrayList<Student>();
	}

	
	public List<Student> searchListByName(String name) {
		if(name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					//찾은 데이터
					searchList.add(std);//저장
				}
			}
			return searchList;
		}
		
		return null;
	}


	@Override
	public Student searchOneByName(String name) {
	
		return null;
	}


	@Override
	public int searchIndexByName(String name) {
		if(name != null) {
			for(int i = 0 ; i <sList.size(); i++) {
				if(name.equals(sList.get(i).getName())) {
					// 찾았다!
					return i;
				}
			}
		}
		return -1;
	}


	@Override
	public List<Student> selectAllStudents() {
	
		return sList;
	}


	public void registerStudent(Student student) {
		sList.add(student);
	}


	@Override
	public void modifyStudent(int index, Student student) {
		
		
	}

	@Override
	public void deleteStudent(int index) {
		if(index > 0)
		sList.remove(index);
	}
	
}
