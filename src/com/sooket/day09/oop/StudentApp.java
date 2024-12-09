package com.sooket.day09.oop;

import java.util.Scanner;

//import com.sooket.day09.recap.Student;

public class StudentApp {
	static Scanner sc = new Scanner(System.in);
	//Student student = new Student();
	Student students[] = new Student[3];
	public void startProgram() {
		
		end:
		while(true) {
			int choice = printMenu(); //printMenu에서 받은 값을 사용하기위해 넣어줌
			
			switch(choice) {
			case 1 : 
				// 한번 시작하면 3명의 학생의 점수를
				// 모두 입력해야하는 방식
				for(int i = 0 ; i < students.length ; i++) {
					students[i] = inputStudentData(); // i값으로 inputS~ 메소드로 넘겨도 안에가 지역변수라 겹치지 않음
				}
				break;

			case 2 : 
				for(Student student : students) { //클래스명 자체가 자료형이 돼서 배열의 for~each문으로 작성
					printStudentData(student);
				}
//				for(int i = 0 ; i <students.length; i++) {
//					printStudentData(students[i]);
//				}
				break;
				
			case 3 : 
				displayMessage("프로그램이 종료되었습니다.");
				break end;
				
			default :
				displayMessage("1 ~ 3 사이의 수를 입력해주세요");
				break;
			}
		}
	}

	private int printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice; // choice를 메인안에서 쓰기위해 return을 쓰고 반환형을 int로 맞춰줌
	}	
	
	private Student inputStudentData() {
		System.out.println("===== 성적입력 =====");   
		Student student = new Student(); // 여기서 선언되는 객체명은 지역 변수이기 때문에 여기서만 쓰이고 
		System.out.print("이름 : "); // 다시 for문으로 나가면 students[i] 즉 students의 객체배열 인덱스명으로 저장되기에 상관없음
		student.name = sc.next();
		System.out.print("국어 : ");
		student.kor = sc.nextInt();
		System.out.print("영어 : ");
		student.eng = sc.nextInt();
		System.out.print("수학 : ");
		student.math = sc.nextInt();
		return student;
	}
	
	private void printStudentData(Student student) { // 클래스명 Student가 자료형이 됨
		System.out.println("===== 성적출력 ====="); 
		System.out.println("이름 : " + student.name);				
		System.out.println("국어 : " + student.kor);
		System.out.println("영어 : " + student.eng);
		System.out.println("수학 : " + student.math); //클라스에 선언된 멤버 변수는 파란색 글씨
		System.out.println("총점 : " + student.total()); //메소드는 검은색 글씨로 나오며 ()소괄호로 감싸줘야함
		System.out.println("평균 : " + student.avg());
	}
	

	private void displayMessage(String message) {
		System.out.println(message);
		
	}

}
