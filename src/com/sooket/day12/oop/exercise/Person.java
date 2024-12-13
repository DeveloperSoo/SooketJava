package com.sooket.day12.oop.exercise;

public class Person {
	//필드
	private String name; // 초기화가 안된 상태 -> 비어있는게 아니다(비어있음을 표시함)
	private int	   age;
	
	
	//생성자 - 클래스 이름과 같은 메소드, 반환형이 없음, 그냥 없음
	//기본 생성자
	public Person() {}
	//매개변수가 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드
	// getter/setter
	public String getName() {
		return name;
	}
	
	public int getAge () {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 일반메소드
	public String inform() {
		return name + "님("+ age + "세)";
	}
	
	@Override
	public String toString() {
		
		return "이름 : " + name + ", 나이 : " + age;
	}
	
	public static void main(String[] args) {
		Person [] pArr = new Person[3];
		pArr[0] = new Person();
		System.out.println(pArr[0].getAge()); //0
		pArr[0].getAge();		 // 암것도 안뜸
		
		
	}
}
