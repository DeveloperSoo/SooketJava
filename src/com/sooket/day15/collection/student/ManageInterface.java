package com.sooket.day15.collection.student;


import java.util.List;

public interface ManageInterface {

	/**
	 * 학생 정보 Student List에 저장 (create)
	 * @param student
	 */
	void registerStudent(Student student); // 등록
	
	/**
	 * 학생 정보 수정 (update)
	 * Student List에 있던 값 대체
	 * @param index
	 * @param student
	 */
	void modifyStudent(int index, Student student);

	/**
	 * 학생 정보 삭제 (delete)
	 * 인덱스로 삭제
	 * @param index
	 */
	void deleteStudent(int index);

	/**
	 * 이름으로 학생 정보 검색
	 * 동명이인 포함
	 * @param name
	 * @return List<Student>
	 */
	List<Student> searchListByName(String name);
	
	/**
	 * 이름으로 학생 정보 1명 검색
	 * @param name
	 * @return Student
	 */
	Student searchOneByName(String name);
	
	/**
	 * 이름으로 인덱스 값 구하기
	 * 인덱스로 삭제 또는 수정하기 때문
	 * @param name
	 * @return int
	 */
	public int searchIndexByName(String name);
	
	/**
	 * Student List 전체 정보 리턴
	 * @return List<Student>
	 */
	List<Student> selectAllStudents(); // 가져오기
	
	/**
	 * 재평가 시험 대상자 확인
	 * @param name
	 */
	String searchFailResult(Student student);
	
}
