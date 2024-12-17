package com.sooket.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{
	private List<Student> sList;
	
	public StudentManage() { //기본생성자로 자동 데이터배열 생성
		this.sList = new ArrayList<Student>(); //자동 업캐스팅 List타입으로 Arraylist 객체공간을 만드니까
	}
	
	@Override
	public void registerStudent(Student student) {
			sList.add(student);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);
		
	}

	@Override
	public void deleteStudent(int index) {
		sList.remove(index); // remove를 사용하기 위해 인덱스가 필요함
		
	}

	@Override
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>();//이렇게만 return하면 비어있는 값임
		if(name != null) { 									//이름이 입력되었을때 동작하도록함.
			for(Student std : sList) { 						//sList를 검색하여 name과 같은값 찾기
				if(name.equals(std.getName())) { 			//같은 값을 찾으면
					searchList.add(std); 					//searchList에 추가
				}
			}
			return searchList;
		}
		
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					return std;		// 찾으면 그때의 값을 리턴, 현재는 동명이인 처리 불가
				}
			}
		}
		
		
		return null; //없으면 null 리컨
	}

	@Override
	public int searchIndexByName(String name) { 	//remove를 사용하기 위해 정수형 인덱스가 필요함
		int count = 0; 								//for~each는 i가 없어서 index값을 찾기 위함임
		if(name != null) {
			for(Student std : sList) { 				//sList for~each돌려서
				if(name.equals(std.getName())) {	// 매개변수랑 sList name이 같은지
					return count; 
				}
				count++; 							//if문 나왔는데 동일하지 않았으면 count를 증가시켜서 숫자 추가
			}
		}
		return -1;									//동일한게 없으면 -1해서 오류 출력
	}

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return sList;
	}

	public String searchFailResult(Student student) { 		//이름으로 찾은 학생 정보 넘어옴
		if(student != null) { 								// 정보가 있을때 동작
			int firstScore, secondScore;
			firstScore = student.getFirstScore();
			secondScore = student.getSecondScore();			// 1차, 2차, 점수 설정
			double avg = (firstScore + secondScore)/2.0;	// 평균 구하고
			StringBuffer sb = new StringBuffer(); 			// 결과 값(String) 담을 객체
			if(avg >= 60) {
				if(firstScore < 40) {						
					sb.append("1차 시험 재평가");			// 결과 값 담김
					//System.out.println("1차 시험 재평가");				
				}else if(secondScore < 40) {
					sb.append("2차 시험 재평가");
					//System.out.println("2차 시험 재평가");
					
				}else {
					sb.append(" 모두 통과하셨습니다.");
					//System.out.println(" 모두 통과하셨습니다.");
				}											// 여기에서는 3가지 결과 중 1개만 담김
				
			}else {
				if(firstScore < 60) {
					sb.append("1차 시험 재평가\n");			// 개행해서 출력되도록 역슬래쉬앤을 붙여줌
					//System.out.println("1차 시험 재평가");				
				}
				if(secondScore < 60) {
					sb.append("2차 시험 재평가");
					//System.out.println("2차 시험 재평가");				
				}											// 여기에서는 2가지 결과가 담길 수 있음.
			}
			return sb.toString();
		}
		return null;
	}
}

