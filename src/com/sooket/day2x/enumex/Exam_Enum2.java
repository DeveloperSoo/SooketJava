package com.sooket.day2x.enumex;

interface University {
	int SEOUL = 1;
	int YONSEI = 2;
	int KOREA = 3;
	
}

//enum Major {
//	KOREAN, MATH, ENGLISH, SCIENCE
//}
// 이렇게 선언시 밑에 메인메소드 안에있는 int major에 University의 값을 넣을수 없게 만듬
// 대신 int 가아니라 Major 클래스 형태고 받아야함

interface Major {
	int KOREAN = 1;
	int MATH = 2;
	int ENGLISH = 3;
	int SCIENCE = 4;
}



public class Exam_Enum2 {
	public static void main(String[] args) {
		int major = Major.MATH;
		//Major major = Major.MATH;		// 이렇게 해야 위에 정의한 ENUM 클래스 사용 가능
		//major = University.YONSEI; 	// 원래는 Major의 값이 아니면 
								   		// 들어가지 못하도록 체크해줘야함. 
										// enum타입으로 쓰면서 타입안정성 보장됨.
		switch(major) {
		case Major.KOREAN: 
			System.out.println("국어전공");
			break;
			
		case Major.MATH: 
			System.out.println("수학전공");	
			break;
			
		case Major.ENGLISH: 
			System.out.println("영어전공");		
			break;
		
		case Major.SCIENCE :
			System.out.println("과학전공");
			break;
		}
	}	
}
