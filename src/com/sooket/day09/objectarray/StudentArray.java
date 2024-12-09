package com.sooket.day09.objectarray;



class Student {
	String name;
	int kor;
	int eng;
	int math;
	
	// 기본 생성자(생략가능), JVM이 알아서 생성해줌
	public Student() {

	}
	
	// 이렇게 쓸 경우 뒤에 점수는 따로 넣어줘야함
	public Student(String name) {
		this.name = name;
	}
	
	// 이렇게 쓸 경우 앞에 이름은 따로 넣어줘야함
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	
	
	public int total() {
		
		return kor + eng + math;
	}
	
	public double avg() {
		
		return (kor+eng+math)/3.0;
	}
}


public class StudentArray {
	public static void main(String[] args) {
		Student [] students = new Student[3]; //Student라는 클래스를 이용해 students 라는 객체배열을 3칸 만들겠다
	
		students[0] = new Student("일용자", 99, 88, 77); // 기본생성자를 통해 줄을 요약할 수 있음
		 
//		 students[0] = new Student(this.name); // students 객체배열의 첫번째 인덱스에 Student클래스의 새로운 객체를 생성함 
//		 students[0].name = "일용자"; // students 객체배열 첫번째 인덱스안 멤버변수 name에 "일용자"라는 데이터 입력
//		 students[0].kor = 99; // 일용자와 동일
//		 students[0].eng = 88; // 일용자와 동일
//		 students[0].math =77; // 일용자와 동일
		 
		 students[1] = new Student(88, 77, 66); //
		 students[1].name = "이용자";
		
//		 students[1] = new Student(); //
//		 students[1].name = "이용자";
//		 students[1].kor = 99;
//		 students[1].eng = 88;
//		 students[1].math =77;
		 
		 
		 students[2] = new Student("삼용자");
		 students[2].kor = 77;
		 students[2].eng = 66;
		 students[2].math = 55;
		 
//		 students[2] = new Student();
//		 students[2].name = "삼용자";
//		 students[2].kor = 99;
//		 students[2].eng = 88;
//		 students[2].math =77;
		
		 //반복문을 이용하여 객체배열의 객체가 가지고 있는
		 // 이름, 점수, 총점, 평균을 출력해보아라
		 
		 for(int i = 0; i < students.length ; i++) {
			 System.out.println("이름 : " + students[i].name);
			 System.out.println("국어 : " + students[i].kor);
			 System.out.println("영어 : " + students[i].eng);
			 System.out.println("수학 : " + students[i].math);
			 System.out.println("총점 : " + students[i].total());
			 System.out.println("평균 : " + students[i].avg());
			 System.out.println();
		 }
	}
}



