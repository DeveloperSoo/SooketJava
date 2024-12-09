package com.sooket.day09.recap;

import java.util.Scanner;

class Student {
	static String name = "";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	//double avg = 0;
	
	
	public static int total() {
		return kor+eng+math;
	}
	
	public static double avg() {
		return total()/3.0;
	}
	
}



public class StudentAppGuJo {
	static Scanner sc = new Scanner(System.in); //main 안에서 구동시키기 위해 static 붙이기
	//Student student = new Student();
	
	public static void main(String[] args) {
		
		end:
		while(true) {
			int choice = printMenu(); //printMenu에서 받은 값을 사용하기위해 넣어줌
			
			
			switch(choice) {
			case 1 : 
				inputStudentData();
				break;

			case 2 : 
				printStudentData();
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
	
	static int printMenu() { //main이 static이기 때문에 맞춰줌
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice; // choice를 메인안에서 쓰기위해 return을 쓰고 반환형을 int로 맞춰줌
	}
	
	static void inputStudentData() {
		System.out.println("===== 성적입력 =====");   
		System.out.print("이름 : ");
		Student.name = sc.next();
		System.out.print("국어 : ");
		Student.kor = sc.nextInt();
		System.out.print("영어 : ");
		Student.eng = sc.nextInt();
		System.out.print("수학 : ");
		Student.math = sc.nextInt();
	}
	
	static void printStudentData() {
		System.out.println("===== 성적출력 ====="); 
		System.out.println("이름 : " + Student.name);				
		System.out.println("국어 : " + Student.kor);
		System.out.println("영어 : " + Student.eng);
		System.out.println("수학 : " + Student.math); //클라스에 선언된 멤버 변수는 파란색 글씨
		System.out.println("총점 : " + Student.total()); //메소드는 검은색 글씨로 나오며 ()소괄호로 감싸줘야함
		System.out.println("평균 : " + Student.avg());
	}
	
	static void displayMessage(String message) {
		System.out.println(message);
	}
	
	
}
