package com.sooket.day13.oop;

import java.util.Scanner;


// 저장하고 로드하는 기능 클래스
public class StudentManage {
	private Student students []; //Student 클래스타입 객체 3개 넣을수있는 students 객체배열 생성
	private int 	index;
	
	public StudentManage() { //여기다 매개변수 그냥 정해서 원하는 만큼 배열을 계속 추가시킬 수 있는지
		students = new Student[3];
		index = 0;
	}
	
	
	public void insertStudent(Student student) {
		students[index] = student; //입력되는 index안에 새로운 Student 타입 객체 집어넣기 
		index++;	
	}
	
	public Student[] getStudents() {
		return students;
	}
	
	
//		//String name = sc.next(); 이렇게 선언해서 밑에 name 적어도 됨
//		students[index].setName(sc.next());
//		students[index].setKor(sc.nextInt());
//		students[index].setEng(sc.nextInt());
//		students[index].setMath(sc.nextInt());
	
//		for(int i = 0; i < students.length; i++) {
//			students[i] = new Student();
//			students[i].name = sc.next();
//			students[i].kor = sc.nextInt();	
//			students[i].eng = sc.nextInt();	
//			students[i].math = sc.nextInt();		
//		}
	}

