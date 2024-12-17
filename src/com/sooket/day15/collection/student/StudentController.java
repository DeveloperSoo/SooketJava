package com.sooket.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		String name;
		int index;
		List<Student> sList;
		Practice_Student prac = new Practice_Student();
		
		finish:
		while(true) {
			int menu = view.printMenu();
			switch(menu) {
			case 1: 
				Student student = view.inputStudent();
				manage.registerStudent(student);
				break;
			case 2: 
				name = view.inputName("검색"); //검색할 이름 입력 받으면
				sList = manage.searchListByName(name); // manage: sList에서 검색해서 list에 담아옴
				view.displayStudents(sList); // 해당 List를 넘겨서 출력해야함.
				break;
			case 3: 
				sList = manage.selectAllStudents();
				view.displayStudents(sList);
				break;
			case 4: 
				name = view.inputName("수정");
				index = manage.searchIndexByName(name);
				if(index != -1) { //수정할 데이터가 존재하면 수정할 데이터 입력
					student = manage.searchOneByName(name); // 이름으로 검색해서 저장된 정보를 가져옴
					student = view.modiftStudent(student);	// 저장된 정보를 수정해서 리턴해줌 -> 수정할 정보가 student에 있음.
					manage.modifyStudent(index, student); //  인덱스와 수정된 정보를 저장한 student를 넘겨서 대체해줌
				}
				break;
			case 5: 
				name = view.inputName("삭제");
				index = manage.searchIndexByName(name);
				if(index != -1) {
					manage.deleteStudent(index);
				}
				break;
			case 6:
				// 내가 한 풀이
//				sList = manage.selectAllStudents(); 
//				prac.retestScore(sList);
//				name = view.inputName("재평가 여부 확인" );
//				prac1.main(name);
				name = view.inputName("재평가 여부 확인" ); // 이름을 입력받음
				student = manage.searchOneByName(name); 	// 이름으로 정보 찾음
				String msg =manage.searchFailResult(student); // 재평가 결과를 리턴함				
				view.displayMsg(msg); //결과 스트링을 출력해버림
				
				break;
			case 0: 
				view.displayMsg("프로그램이 종료되었습니다.");
				break finish;
			default: 
				view.displayMsg("잘못 입력하셨습니다.");	
				break;
			}
			
			
			
		}
		
	}
}
