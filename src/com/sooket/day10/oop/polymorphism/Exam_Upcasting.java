package com.sooket.day10.oop.polymorphism;



class Person {
	String name;
	String id;
	
	public Person() {}
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
}

class Student extends Person{
	String grade;
	String department;
	public Student() {
		super();
	}
	
	public Student(String name, String id, 
					String grade, String department) {
			super(name, id);
			this.grade = grade;
			this.department = department;
	}
}

class Worker extends Person {}

class Docter extends Person {}

public class Exam_Upcasting {
	public static void main(String[] args) {
		Person p = new Person();
		Student s = new Student();
		p = s;
		p.id = "khsuer01";
		p.name = "일용자";
		//p.grade = "접근불가능";
		p = new Worker();
		p = new Docter();
		
	}
}











