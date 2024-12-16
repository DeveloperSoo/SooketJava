package com.sooket.day14.collection.list;

class Member{
	
}

public class MemberList {
	Member [] members; //자료형 대신 클래스를 넣으면 객체 배열 넣을수 있음
	int size;

	public MemberList() {
		members = new Member[3];
		size = 0;
	}
	
	// 추가
	public void add(Member member) {
			members[size] = member;
			size++;
	}
	
	// 검색(조회)
	public Member get(int index) {
		return members[index];
	}
	
	// 크기
	public int size() {
		return size;
	}
	
	// 전체삭제
	public void clear() {
		members = new Member[3];
		size = 0;
	}
}
